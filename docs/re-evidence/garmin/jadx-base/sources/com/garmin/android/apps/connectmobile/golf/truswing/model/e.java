package com.garmin.android.apps.connectmobile.golf.truswing.model;

import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00018\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/garmin/android/apps/connectmobile/golf/truswing/model/e;", "", "", "patchOperation", "path", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "a", "Ljava/lang/String;", "getPatchOperation", "()Ljava/lang/String;", "b", "getPath", "c", "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "gcm-golf_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("op")
    private final String patchOperation;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("path")
    private final String path;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("value")
    private final Object value;

    public e(String str, String str2, Object obj) {
        str.getClass();
        str2.getClass();
        obj.getClass();
        this.patchOperation = str;
        this.path = str2;
        this.value = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return s.g(this.patchOperation, eVar.patchOperation) && s.g(this.path, eVar.path) && s.g(this.value, eVar.value);
    }

    public final int hashCode() {
        return this.value.hashCode() + wr.g.j(this.patchOperation.hashCode() * 31, 31, this.path);
    }

    public final String toString() {
        return am.j.k(this.value, ")", p6.b.i("PatchOperationDTO(patchOperation=", this.patchOperation, ", path=", this.path, ", value="));
    }
}
