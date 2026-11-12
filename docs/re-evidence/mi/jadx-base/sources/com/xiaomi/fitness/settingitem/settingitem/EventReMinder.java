package com.xiaomi.fitness.settingitem.settingitem;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes8.dex */
public class EventReMinder {

    @SerializedName("supportMaxNum")
    @Expose
    private int supportMaxNum = 50;

    @SerializedName("mindItems")
    @Expose
    private List<EventReMinderItem> mindItems = new ArrayList();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EventReMinder)) {
            return false;
        }
        EventReMinder eventReMinder = (EventReMinder) obj;
        if (this.supportMaxNum == eventReMinder.supportMaxNum) {
            List<EventReMinderItem> list = this.mindItems;
            List<EventReMinderItem> list2 = eventReMinder.mindItems;
            if (list == list2) {
                return true;
            }
            if (list != null && list.equals(list2)) {
                return true;
            }
        }
        return false;
    }

    public List<EventReMinderItem> getMindItems() {
        return this.mindItems;
    }

    public int getSupportMaxNum() {
        return this.supportMaxNum;
    }

    public int hashCode() {
        int i = (this.supportMaxNum + 31) * 31;
        List<EventReMinderItem> list = this.mindItems;
        return i + (list == null ? 0 : list.hashCode());
    }

    public void setMindItems(List<EventReMinderItem> list) {
        this.mindItems = list;
    }

    public void setSupportMaxNum(int i) {
        this.supportMaxNum = i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EventReMinder.class.getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        sb.append("supportMaxNum");
        sb.append('=');
        sb.append(this.supportMaxNum);
        sb.append(',');
        sb.append("mindItems");
        sb.append('=');
        Object obj = this.mindItems;
        if (obj == null) {
            obj = "<null>";
        }
        sb.append(obj);
        sb.append(',');
        if (sb.charAt(sb.length() - 1) == ',') {
            sb.setCharAt(sb.length() - 1, AbstractJsonLexerKt.END_LIST);
        } else {
            sb.append(AbstractJsonLexerKt.END_LIST);
        }
        return sb.toString();
    }
}
