package com.huami.watch.dataflow.exchange;

import android.util.Pair;
import androidx.annotation.NonNull;
import com.huami.watch.transport.DataBundle;
import com.huami.watch.util.ArraysUtil;
import com.huami.watch.util.Log;
import java.util.Arrays;
import java.util.Set;
import kotlin.text.Typography;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes16.dex */
public class Action {
    public static final String ADD = "Add";
    public static final String DELETE = "Delete";
    public static final String QUERY = "Query";
    public static final String UPDATE = "Update";
    private static final String a = "Target";
    private static final String b = "Action";
    private static final String c = "Timestamp";
    private static final String d = "Projection";
    private static final String e = "Where";

    @NonNull
    public String action;
    public String[] projection;

    @NonNull
    public String target;
    public long timestamp;
    public DataBundle where;

    public Action() {
        this.target = target();
        this.action = "";
        this.where = new DataBundle();
    }

    public Action add() {
        this.action = "Add";
        return this;
    }

    public Action delete() {
        this.action = "Delete";
        return this;
    }

    public Action projection(String[] strArr) {
        this.projection = strArr;
        return this;
    }

    public Action query() {
        this.action = QUERY;
        return this;
    }

    @NonNull
    public Pair<String, String[]> selectionAndArgs() {
        Set<String> setKeySet;
        int size;
        Pair<String, String[]> pair = new Pair<>(null, null);
        DataBundle dataBundle = this.where;
        if (dataBundle != null && (size = (setKeySet = dataBundle.keySet()).size()) > 0) {
            String[] strArr = new String[size];
            String[] strArr2 = new String[size];
            int i = 0;
            for (String str : setKeySet) {
                strArr[i] = str;
                strArr2[i] = this.where.getString(str);
                i++;
            }
            pair = new Pair<>(ArraysUtil.join(strArr, (CharSequence) null, (CharSequence) null, " AND "), strArr2);
        }
        Log.d(target(), "Where, Selection: " + ((String) pair.first) + ", SelectionArgs: " + ArraysUtil.toString((Object[]) pair.second), new Object[0]);
        return pair;
    }

    public String target() {
        return "";
    }

    public String toString() {
        return SearchCriteria.LT + this.target + ", " + this.action + ", Timestamp: " + this.timestamp + ", Projection: " + Arrays.toString(this.projection) + ", Where: " + this.where + Typography.greater;
    }

    public String toStringShort() {
        return SearchCriteria.LT + this.target + ", " + this.action + ", Timestamp : " + this.timestamp + SearchCriteria.GT;
    }

    public DataBundle toWatchData() {
        DataBundle dataBundle = new DataBundle();
        dataBundle.putString("Target", this.target);
        dataBundle.putString(b, this.action);
        dataBundle.putLong("Timestamp", this.timestamp);
        dataBundle.putStringArray(d, this.projection);
        dataBundle.putBundle(e, this.where);
        return dataBundle;
    }

    public Action update() {
        this.action = "Update";
        return this;
    }

    public Action where(String str, String str2) {
        this.where.putString(str, str2);
        return this;
    }

    public Action(DataBundle dataBundle) {
        this.target = target();
        this.action = "";
        this.target = dataBundle.getString("Target", "");
        this.action = dataBundle.getString(b, "");
        this.timestamp = dataBundle.getLong("Timestamp");
        this.projection = dataBundle.getStringArray(d);
        this.where = dataBundle.getBundle(e);
    }
}
