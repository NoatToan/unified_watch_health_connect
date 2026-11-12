package com.xiaomi.hm.health.device.deviceproperty;

import android.annotation.SuppressLint;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.xiaomi.hm.health.bt.profile.feature.Feature;
import com.xiaomi.hm.health.bt.profile.feature.HMFeatureProfile;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u0011\n\u0002\b\u0005\u001a\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0007\u001a\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\"\u0016\u0010\t\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b\"\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f\"\u0016\u0010\u000e\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\f\"\u0016\u0010\u0010\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\f\"\u0016\u0010\u0012\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\f\"\u0016\u0010\u0014\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\f\"\u0016\u0010\u0016\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\f\"\u0016\u0010\u0018\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\f\"\u0016\u0010\u001a\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\f\"\u0016\u0010\u001c\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\f\"\u0016\u0010\u001e\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\f\"\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020\n0\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!\"\u0016\u0010#\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\b¨\u0006$"}, d2 = {"", "propertyString", "Lcom/xiaomi/hm/health/bt/profile/feature/Feature;", "fromPropertyString", "", "c", "", "a", "Ljava/lang/String;", "TAG", "", "b", LogUtil.I, "SOURCE_FALCON", "SOURCE_HAWK", GoogleApiAvailabilityLight.a, "SOURCE_KESTREL", "e", "SOURCE_OSPREY", "f", "SOURCE_ONYX", "g", "SOURCE_KONG_MING_H", "h", "SOURCE_KONG_MING_L", "i", "SOURCE_KONG_MING_PRO", z.j, "SOURCE_CORSICA", hl.k, "SOURCE_CHOPIN", "", "l", "[Ljava/lang/Integer;", "supportSources", "PREFIX", "devicex_zeppRelease"}, k = 2, mv = {1, 5, 1})
public final class HMDevicePropertyCacheKt {

    @NotNull
    public static final String PREFIX = "huami.mifit.user.settings.device";

    @NotNull
    private static final String a = "HMDevicePropertyCache";
    private static final int b = 35;
    private static final int c = 37;
    private static final int d = 40;
    private static final int e = 56;
    private static final int f = 57;
    private static final int g = 58;
    private static final int h = 59;
    private static final int i = 60;
    private static final int j = 61;
    private static final int k = 900;

    @NotNull
    private static final Integer[] l = {35, 37, 40, 56, 57, 58, 59, 60, 61, 900};

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "fromPropertyStr: " + this.a;
        }
    }

    private static final byte a(char c2) {
        return (byte) StringsKt__StringsKt.indexOf$default((CharSequence) "0123456789ABCDEF", c2, 0, false, 6, (Object) null);
    }

    @SuppressLint({"DefaultLocale"})
    @Nullable
    public static final Feature fromPropertyString(@Nullable String str) {
        int i2 = 0;
        if (str == null || m.isBlank(str)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (str == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String upperCase = str.toUpperCase();
            if (upperCase == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            char[] charArray = upperCase.toCharArray();
            int length = str.length() / 2;
            if (length > 0) {
                while (true) {
                    int i3 = i2 + 1;
                    int i4 = i2 * 2;
                    arrayList.add(Byte.valueOf((byte) (a(charArray[i4 + 1]) | (a(charArray[i4]) << 4))));
                    if (i3 >= length) {
                        break;
                    }
                    i2 = i3;
                }
            }
            return HMFeatureProfile.fromByteArray(CollectionsKt___CollectionsKt.toByteArray(arrayList));
        } catch (Exception e2) {
            HMLog.info(a, new a(e2));
            return null;
        }
    }
}
