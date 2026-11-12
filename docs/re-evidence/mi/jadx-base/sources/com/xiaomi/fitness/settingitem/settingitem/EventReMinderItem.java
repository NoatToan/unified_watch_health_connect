package com.xiaomi.fitness.settingitem.settingitem;

import android.text.TextUtils;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes8.dex */
public class EventReMinderItem implements Cloneable, Serializable {
    public static final String MI_FEET_TYPE = "0";

    @SerializedName("createDate")
    @Expose
    private String createDate;

    @SerializedName("id")
    @Expose
    private int id;

    @SerializedName("loop")
    @Expose
    private String loop;

    @SerializedName("op")
    @Expose
    private int op;

    @SerializedName("startDate")
    @Expose
    private String startDate;

    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("from")
    @Expose
    private String from = Constants.CODE_SHARE_EXCEPTION;

    @SerializedName("repeat")
    @Expose
    private int repeat = -1;

    private String getStartDate() {
        return this.startDate;
    }

    private void setStartDate(String str) {
        this.startDate = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof EventReMinderItem) && this.id == ((EventReMinderItem) obj).id;
    }

    public String getCreateDate() {
        return this.createDate;
    }

    public String getFrom() {
        return this.from;
    }

    public int getId() {
        return this.id;
    }

    public String getLoop() {
        return this.loop;
    }

    public int getOp() {
        return this.op;
    }

    public int getRepeat() {
        return this.repeat;
    }

    public long getStartDateLong() {
        long jCurrentTimeMillis;
        if (!TextUtils.isEmpty(this.startDate) && this.startDate.length() == 16) {
            try {
                return new SimpleDateFormat("yyyy-MM-dd HH:mm").parse(this.startDate).getTime();
            } catch (ParseException e) {
                e.printStackTrace();
                jCurrentTimeMillis = System.currentTimeMillis();
            }
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        return jCurrentTimeMillis - 10000000;
    }

    public String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int i = (this.op + 31) * 31;
        String str = this.loop;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.from;
        int iHashCode2 = (((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.id) * 31;
        String str3 = this.title;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.startDate;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.createDate;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public void setCreateDate(String str) {
        this.createDate = str;
    }

    public void setCreateDateLong(long j) {
        this.createDate = String.valueOf(j);
    }

    public void setFrom(String str) {
        this.from = str;
    }

    public void setId(int i) {
        this.id = i;
    }

    public void setLoop(String str) {
        this.loop = str;
    }

    public void setOp(int i) {
        this.op = i;
    }

    public void setRepeat(int i) {
        this.repeat = i;
    }

    public void setStartDateLong(long j) {
        this.startDate = TimeDateUtil.getDateFormated(j, "yyyy-MM-dd HH:mm");
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EventReMinderItem.class.getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        sb.append("createDate");
        sb.append('=');
        String str = this.createDate;
        if (str == null) {
            str = "<null>";
        }
        sb.append(str);
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(this.id);
        sb.append(',');
        sb.append("from");
        sb.append('=');
        String str2 = this.from;
        if (str2 == null) {
            str2 = "<null>";
        }
        sb.append(str2);
        sb.append(',');
        sb.append("loop");
        sb.append('=');
        String str3 = this.loop;
        if (str3 == null) {
            str3 = "<null>";
        }
        sb.append(str3);
        sb.append(',');
        sb.append("op");
        sb.append('=');
        sb.append(this.op);
        sb.append(',');
        sb.append("startDate");
        sb.append('=');
        String str4 = this.startDate;
        if (str4 == null) {
            str4 = "<null>";
        }
        sb.append(str4);
        sb.append(',');
        sb.append("title");
        sb.append('=');
        String str5 = this.title;
        sb.append(str5 != null ? str5 : "<null>");
        sb.append(',');
        if (sb.charAt(sb.length() - 1) == ',') {
            sb.setCharAt(sb.length() - 1, AbstractJsonLexerKt.END_LIST);
        } else {
            sb.append(AbstractJsonLexerKt.END_LIST);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public EventReMinderItem m557clone() {
        try {
            return (EventReMinderItem) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            EventReMinderItem eventReMinderItem = new EventReMinderItem();
            eventReMinderItem.setOp(this.op);
            eventReMinderItem.setId(this.id);
            eventReMinderItem.setStartDate(this.startDate);
            eventReMinderItem.setCreateDate(this.createDate);
            eventReMinderItem.setFrom(this.from);
            eventReMinderItem.setLoop(this.loop);
            eventReMinderItem.setTitle(this.title);
            return eventReMinderItem;
        }
    }
}
