package com.huami.watch.dataflow.exchange;

import androidx.annotation.NonNull;
import com.huami.watch.transport.DataBundle;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes16.dex */
public class ActionResult {
    public static final int FAIL_NO_CONNECT = -11;
    public static final int FAIL_UNFINISHED = -12;
    private static final String a = "StatusCode";
    private static final String b = "Data";
    private static final int c = 1;
    private static final int d = -1;
    private static final int e = 0;
    public Action action;
    public String resultData;
    public int statusCode;

    public ActionResult(@NonNull Action action) {
        this.statusCode = 0;
        this.action = action;
    }

    private ActionResult a(boolean z, int i) {
        if (z) {
            i = 1;
        }
        this.statusCode = i;
        return this;
    }

    public ActionResult fail() {
        return success(false);
    }

    public boolean isFinish() {
        return this.statusCode != 0;
    }

    public boolean isSuccess() {
        return this.statusCode == 1;
    }

    public ActionResult success() {
        return success(true);
    }

    public String toString() {
        return SearchCriteria.LT + this.action.toStringShort() + ", Success : " + isSuccess() + ", StatusCode : " + this.statusCode + ", ResultData : " + this.resultData + SearchCriteria.GT;
    }

    public String toStringShort() {
        return "<Success : " + isSuccess() + ", StatusCode : " + this.statusCode + ", ResultData : " + this.resultData + SearchCriteria.GT;
    }

    public DataBundle toWatchData() {
        DataBundle watchData = this.action.toWatchData();
        watchData.putInt(a, this.statusCode);
        watchData.putString("Data", this.resultData);
        return watchData;
    }

    public ActionResult fail(int i) {
        return a(false, i);
    }

    public ActionResult success(boolean z) {
        return a(z, -1);
    }

    public ActionResult(DataBundle dataBundle, Action action) {
        this.statusCode = 0;
        this.action = action;
        this.statusCode = dataBundle.getInt(a);
        this.resultData = dataBundle.getString("Data");
    }
}
