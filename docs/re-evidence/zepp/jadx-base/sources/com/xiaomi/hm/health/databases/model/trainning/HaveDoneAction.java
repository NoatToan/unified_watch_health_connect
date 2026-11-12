package com.xiaomi.hm.health.databases.model.trainning;

import com.google.gson.annotations.SerializedName;
import com.ingenic.iwds.HardwareList;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public class HaveDoneAction implements Serializable {
    public static final String ACTION_TYPE_COUNT = "COUNT";
    public static final String ACTION_TYPE_TIME = "TIME";
    private static final long serialVersionUID = 1;

    @SerializedName("id_")
    private Long a;

    @SerializedName("actionVideoId")
    public Long actionAudioId;

    @SerializedName("duration")
    public String duration;

    @SerializedName("group")
    public Integer group;

    @SerializedName("name")
    public String name;

    @SerializedName("nextRestTime")
    public Integer nextRestTime;

    @SerializedName("repeatNumber")
    public Integer repeatNumber;

    @SerializedName(HardwareList.VALUE_LCD_EXTERIOR_ROUND)
    public Integer round;

    @SerializedName("id")
    public Long trainingId;

    @SerializedName("trainingPlanId")
    public Long trainingPlanId;

    @SerializedName("trainingStartTime")
    public Long trainingStartTime;

    @SerializedName("type")
    public String type;

    public HaveDoneAction(Long l, Long l2, Long l3, Long l4, String str, Integer num, Integer num2, String str2, Integer num3, String str3, Long l5, Integer num4) {
        this.round = 0;
        this.group = 0;
        this.nextRestTime = 0;
        this.repeatNumber = 0;
        this.a = l;
        this.trainingId = l2;
        this.trainingStartTime = l3;
        this.actionAudioId = l4;
        this.name = str;
        this.round = num;
        this.group = num2;
        this.duration = str2;
        this.nextRestTime = num3;
        this.type = str3;
        this.trainingPlanId = l5;
        this.repeatNumber = num4;
    }

    private static boolean a(Number number, Number number2) {
        return (number == null && number2 == null) || !(number == null || number2 == null || !number.equals(number2));
    }

    private static boolean b(CharSequence charSequence, CharSequence charSequence2) {
        int length;
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || (length = charSequence.length()) != charSequence2.length()) {
            return false;
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return charSequence.equals(charSequence2);
        }
        for (int i = 0; i < length; i++) {
            if (charSequence.charAt(i) != charSequence2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof HaveDoneAction)) {
            return false;
        }
        HaveDoneAction haveDoneAction = (HaveDoneAction) obj;
        return a(this.trainingId, haveDoneAction.trainingId) && a(this.trainingStartTime, haveDoneAction.trainingStartTime) && a(this.group, haveDoneAction.group) && a(this.round, haveDoneAction.round) && b(this.type, haveDoneAction.type);
    }

    public Long getActionAudioId() {
        return this.actionAudioId;
    }

    public String getDuration() {
        return this.duration;
    }

    public Integer getGroup() {
        return this.group;
    }

    public Long getId() {
        return this.a;
    }

    public String getName() {
        return this.name;
    }

    public Integer getNextRestTime() {
        return this.nextRestTime;
    }

    public Integer getRepeatNumber() {
        return this.repeatNumber;
    }

    public Integer getRound() {
        return this.round;
    }

    public Long getTrainingId() {
        return this.trainingId;
    }

    public Long getTrainingPlanId() {
        return this.trainingPlanId;
    }

    public Long getTrainingStartTime() {
        return this.trainingStartTime;
    }

    public String getType() {
        return this.type;
    }

    public void setActionAudioId(Long l) {
        this.actionAudioId = l;
    }

    public void setDuration(String str) {
        this.duration = str;
    }

    public void setGroup(Integer num) {
        this.group = num;
    }

    public void setId(Long l) {
        this.a = l;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setNextRestTime(Integer num) {
        this.nextRestTime = num;
    }

    public void setRepeatNumber(Integer num) {
        this.repeatNumber = num;
    }

    public void setRound(Integer num) {
        this.round = num;
    }

    public void setTrainingId(Long l) {
        this.trainingId = l;
    }

    public void setTrainingPlanId(Long l) {
        this.trainingPlanId = l;
    }

    public void setTrainingStartTime(Long l) {
        this.trainingStartTime = l;
    }

    public void setType(String str) {
        this.type = str;
    }

    public HaveDoneAction() {
        this.round = 0;
        this.group = 0;
        this.nextRestTime = 0;
        this.repeatNumber = 0;
    }
}
