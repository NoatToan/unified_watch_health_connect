package com.xiaomi.hm.health.speech.entity;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes21.dex */
public class SmartMiotSkill extends BaseSkill {
    private SmartMiotStatusExtend a;
    private ArrayList<SmartMiotAnswer> b;

    public ArrayList<SmartMiotAnswer> getSmartMiotAnswerArr() {
        return this.b;
    }

    public SmartMiotStatusExtend getStatusExtend() {
        return this.a;
    }

    public void setSmartMiotAnswerArr(ArrayList<SmartMiotAnswer> smartMiotAnswerArr) {
        this.b = smartMiotAnswerArr;
    }

    public void setStatusExtend(SmartMiotStatusExtend statusExtend) {
        this.a = statusExtend;
    }
}
