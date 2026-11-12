package defpackage;

import android.text.TextUtils;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.health.sport.model.data.TrackDetailPoint;
import com.huawei.hwfoundationmodel.trackmodel.MotionPath;

/* JADX INFO: loaded from: classes31.dex */
public class gzn implements TrackDetailPoint {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("actionTargetType")
    protected int f36288a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Expose(deserialize = false)
    protected float f36289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName(WorkoutRecord.Extend.COURSE_TARGET_VALUE)
    protected float f36290c;

    @SerializedName("actionName")
    protected String d;

    @SerializedName("actionId")
    protected String e;

    @SerializedName("finishedAct")
    protected int h;

    @Override // com.huawei.health.sport.model.data.TrackDetailPoint
    public int estimatedSize() {
        return 50;
    }

    public String d() {
        return this.d;
    }

    public void b(String str) {
        this.d = str;
    }

    public String a() {
        return this.e;
    }

    public void c(String str) {
        this.e = str;
    }

    public int b() {
        return this.h;
    }

    public void b(int i) {
        this.h = i;
    }

    public int c() {
        return this.f36288a;
    }

    public void c(int i) {
        this.f36288a = i;
    }

    public float e() {
        return this.f36290c;
    }

    public void b(float f) {
        this.f36290c = f;
    }

    @Override // com.huawei.health.sport.model.data.TrackDetailPoint
    public void toTrackString(StringBuffer stringBuffer) {
        stringBuffer.append(MotionPath.COURSE_ACTION_LIST_TAG).append(";").append(new GsonBuilder().create().toJson(this)).append(System.lineSeparator());
    }

    @Override // com.huawei.health.sport.model.data.TrackDetailPoint
    public void fromTrackString(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        fromTrackString(str.split(";", 2));
    }

    @Override // com.huawei.health.sport.model.data.TrackDetailPoint
    public void fromTrackString(String[] strArr) {
        gzn gznVar;
        if (strArr.length < getMinFieldNum() || (gznVar = (gzn) peh.b(strArr[1], gzn.class)) == null) {
            return;
        }
        c(gznVar.a());
        b(gznVar.d());
        c(gznVar.c());
        b(gznVar.b());
        b(gznVar.e());
    }

    public String toString() {
        return "BaseRecordAction{mActionId='" + this.e + "', mActionName='" + this.d + "', mFinishedAction=" + this.h + ", mActionTargetType=" + this.f36288a + ", mActionTargetValue=" + this.f36290c + '}';
    }
}
