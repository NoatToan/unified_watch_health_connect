package com.huami.watch.dataflow.model.health.process;

import android.text.TextUtils;
import com.alipay.sdk.m.u.i;

/* JADX INFO: loaded from: classes16.dex */
public class PersonInfo {
    public int age;
    public int gender;
    public int goalCalories;
    public int goalSteps;
    public int height;
    public String userid;
    public float weight;

    public PersonInfo() {
        this.userid = "";
        this.gender = 1;
        this.height = 172;
        this.weight = 65.0f;
        this.goalSteps = 8000;
        this.goalCalories = Const.GOAL_CALORIES_DEF;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PersonInfo)) {
            return false;
        }
        PersonInfo personInfo = (PersonInfo) obj;
        return this.userid.equals(personInfo.userid) && this.gender == personInfo.gender && this.height == personInfo.height && this.weight == personInfo.weight && this.goalSteps == personInfo.goalSteps && this.goalCalories == personInfo.goalCalories && this.age == personInfo.age;
    }

    public boolean isAdd(PersonInfo personInfo) {
        return !isValid() && personInfo.isValid();
    }

    public boolean isSwitch(PersonInfo personInfo) {
        return personInfo != null && personInfo.isValid() && isValid() && !this.userid.equals(personInfo.userid);
    }

    public boolean isUpdateGoal(PersonInfo personInfo) {
        if (personInfo != null && personInfo.isValid() && this.userid.equals(personInfo.userid)) {
            return (this.goalSteps == personInfo.goalSteps && this.goalCalories == personInfo.goalCalories) ? false : true;
        }
        return false;
    }

    public boolean isUpdateInfo(PersonInfo personInfo) {
        if (personInfo != null && personInfo.isValid() && this.userid.equals(personInfo.userid)) {
            return (this.gender == personInfo.gender && this.height == personInfo.height && this.weight == personInfo.weight && this.age == personInfo.age) ? false : true;
        }
        return false;
    }

    public boolean isValid() {
        return !TextUtils.isEmpty(this.userid);
    }

    public String toString() {
        return "PersonInfo {id:" + this.userid + ",gender:" + this.gender + ",height:" + this.height + ",weight:" + this.weight + ",goal:" + this.goalSteps + ",calories:" + this.goalCalories + ",age:" + this.age + i.d;
    }

    public PersonInfo(String str) {
        this.userid = "";
        this.gender = 1;
        this.height = 172;
        this.weight = 65.0f;
        this.goalSteps = 8000;
        this.goalCalories = Const.GOAL_CALORIES_DEF;
        this.userid = str;
    }
}
