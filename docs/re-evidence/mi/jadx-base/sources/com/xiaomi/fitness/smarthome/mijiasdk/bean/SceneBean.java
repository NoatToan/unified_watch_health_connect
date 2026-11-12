package com.xiaomi.fitness.smarthome.mijiasdk.bean;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/smarthome/mijiasdk/bean/SceneBean;", "", "scene_id", "", "scene_name", "", "template_id", "scene_type", "", "<init>", "(JLjava/lang/String;JI)V", "getScene_id", "()J", "setScene_id", "(J)V", "getScene_name", "()Ljava/lang/String;", "setScene_name", "(Ljava/lang/String;)V", "getTemplate_id", "setTemplate_id", "getScene_type", "()I", "setScene_type", "(I)V", "smarthome_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SceneBean {
    private long scene_id;

    @NotNull
    private String scene_name;
    private int scene_type;
    private long template_id;

    public SceneBean(long j, @NotNull String scene_name, long j2, int i) {
        Intrinsics.checkNotNullParameter(scene_name, "scene_name");
        this.scene_id = j;
        this.scene_name = scene_name;
        this.template_id = j2;
        this.scene_type = i;
    }

    public final long getScene_id() {
        return this.scene_id;
    }

    @NotNull
    public final String getScene_name() {
        return this.scene_name;
    }

    public final int getScene_type() {
        return this.scene_type;
    }

    public final long getTemplate_id() {
        return this.template_id;
    }

    public final void setScene_id(long j) {
        this.scene_id = j;
    }

    public final void setScene_name(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.scene_name = str;
    }

    public final void setScene_type(int i) {
        this.scene_type = i;
    }

    public final void setTemplate_id(long j) {
        this.template_id = j;
    }
}
