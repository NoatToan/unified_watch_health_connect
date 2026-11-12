package com.huami.watch.dataflow.sync.bean;

import com.google.gson.annotations.Expose;
import com.huami.watch.util.ArraysUtil;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes16.dex */
public class FirstbeatData {

    @Expose(serialize = false)
    public String firstbeatconfig;
    private int updateTime;

    @Expose
    private List<Item> vo2max = new ArrayList();

    @Expose
    private List<Item> sportThaInfo = new ArrayList();

    public static class Item {

        @Expose(serialize = false)
        private String data;

        @Expose
        private String dayId;

        public String getData() {
            return this.data;
        }

        public String getDayId() {
            return this.dayId;
        }

        public void setData(String str) {
            this.data = str;
        }

        public void setDayId(String str) {
            this.dayId = str;
        }

        public String toString() {
            return "{dayId='" + this.dayId + "', data='" + this.data + "'}";
        }
    }

    public List<Item> getSportThaInfo() {
        return this.sportThaInfo;
    }

    public int getUpdateTime() {
        return this.updateTime;
    }

    public List<Item> getVo2max() {
        return this.vo2max;
    }

    public void setSportThaInfo(List<Item> list) {
        this.sportThaInfo = list;
    }

    public void setUpdateTime(int i) {
        this.updateTime = i;
    }

    public void setVo2max(List<Item> list) {
        this.vo2max = list;
    }

    public String toString() {
        return "<Config" + this.firstbeatconfig + ",\nVo2max: " + ArraysUtil.toString(this.vo2max) + ",\nSportThaInfo: " + ArraysUtil.toString(this.sportThaInfo) + Typography.greater;
    }
}
