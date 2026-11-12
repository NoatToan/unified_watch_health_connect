package com.xiaomi.fitness.devicesettings.huami.healthmonitor;

import com.xiaomi.smarthome.library.apache.http.protocol.HTTP;
import defpackage.wzi;
import defpackage.xz5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\f\r\u000e\u000fB!\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0004\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/healthmonitor/HrMode;", "Lxz5;", "", "mode", "I", "getMode", "()I", "", "title", "desc", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "Auto", "Sleep", "Full", HTTP.CONN_CLOSE, "Lcom/xiaomi/fitness/devicesettings/huami/healthmonitor/HrMode$Auto;", "Lcom/xiaomi/fitness/devicesettings/huami/healthmonitor/HrMode$Close;", "Lcom/xiaomi/fitness/devicesettings/huami/healthmonitor/HrMode$Full;", "Lcom/xiaomi/fitness/devicesettings/huami/healthmonitor/HrMode$Sleep;", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public abstract class HrMode extends xz5 {
    private final int mode;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/healthmonitor/HrMode$Auto;", "Lcom/xiaomi/fitness/devicesettings/huami/healthmonitor/HrMode;", "<init>", "()V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Auto extends HrMode {

        @NotNull
        public static final Auto INSTANCE = new Auto();

        /* JADX WARN: Illegal instructions before constructor call */
        private Auto() {
            String string = HrModeKt.res.getString(wzi.a3);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String string2 = HrModeKt.res.getString(wzi.b3);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            super(2, string, string2, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/healthmonitor/HrMode$Close;", "Lcom/xiaomi/fitness/devicesettings/huami/healthmonitor/HrMode;", "<init>", "()V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Close extends HrMode {

        @NotNull
        public static final Close INSTANCE = new Close();

        /* JADX WARN: Illegal instructions before constructor call */
        private Close() {
            String string = HrModeKt.res.getString(wzi.f);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String string2 = HrModeKt.res.getString(wzi.z1);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            super(0, string, string2, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/healthmonitor/HrMode$Full;", "Lcom/xiaomi/fitness/devicesettings/huami/healthmonitor/HrMode;", "<init>", "()V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Full extends HrMode {

        @NotNull
        public static final Full INSTANCE = new Full();

        /* JADX WARN: Illegal instructions before constructor call */
        private Full() {
            String string = HrModeKt.res.getString(wzi.O4);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String string2 = HrModeKt.res.getString(wzi.P4);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            super(3, string, string2, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/healthmonitor/HrMode$Sleep;", "Lcom/xiaomi/fitness/devicesettings/huami/healthmonitor/HrMode;", "<init>", "()V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Sleep extends HrMode {

        @NotNull
        public static final Sleep INSTANCE = new Sleep();

        /* JADX WARN: Illegal instructions before constructor call */
        private Sleep() {
            String string = HrModeKt.res.getString(wzi.Q4);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String string2 = HrModeKt.res.getString(wzi.R4);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            super(1, string, string2, null);
        }
    }

    public /* synthetic */ HrMode(int i, String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2);
    }

    public final int getMode() {
        return this.mode;
    }

    private HrMode(int i, String str, String str2) {
        super(str, str2);
        this.mode = i;
        this.title = str;
        this.des = str2;
    }
}
