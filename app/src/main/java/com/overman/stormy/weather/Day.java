package com.overman.stormy.weather;

/**
 * Created by Michael on 2/21/2016.
 */
public class Day {
    private long mTime;
    private String mSummary;
    private Double mTemperatureMax;
    private Double mTemperatureMin;
    private String mIcon;
    private String mTimezone;
    private Double mPrecipProbability;

    public int getPrecipProbability() {
        return (int) Math.round(mPrecipProbability * 100);
    }

    public void setPrecipProbability(Double precipProbability) {
        mPrecipProbability = precipProbability;
    }

    public long getTime() {
        return mTime;
    }

    public void setTime(long time) {
        mTime = time;
    }

    public String getSummary() {
        return mSummary;
    }

    public void setSummary(String summary) {
        mSummary = summary;
    }

    public Double getTemperatureMax() {
        return mTemperatureMax;
    }

    public void setTemperatureMax(Double temperatureMax) {
        mTemperatureMax = temperatureMax;
    }

    public Double getTemperatureMin() {
        return mTemperatureMin;
    }

    public void setTemperatureMin(Double temperatureMin) {
        mTemperatureMin = temperatureMin;
    }

    public String getIcon() {
        return mIcon;
    }

    public void setIcon(String icon) {
        mIcon = icon;
    }

    public String getTimezone() {
        return mTimezone;
    }

    public void setTimezone(String timezone) {
        mTimezone = timezone;
    }
}
