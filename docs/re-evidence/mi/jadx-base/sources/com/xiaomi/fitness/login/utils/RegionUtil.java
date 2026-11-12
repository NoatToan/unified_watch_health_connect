package com.xiaomi.fitness.login.utils;

import android.content.Context;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\b\u0010\u0006\u001a\u00020\u0005H\u0007J\b\u0010\u0007\u001a\u00020\u0005H\u0007J\b\u0010\b\u001a\u00020\tH\u0007J\u0006\u0010\n\u001a\u00020\u0005J\u0006\u0010\u000b\u001a\u00020\u0005J\u0006\u0010\f\u001a\u00020\u0005J\u0018\u0010\r\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\tJ\u0018\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\tH\u0002¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/login/utils/RegionUtil;", "", "<init>", "()V", "isMedalSupport", "", "isInnerCN", "isInTaiWan", "getCurrentLocalCountry", "", "isInvokeAuthSupport", "isSupportAliPaySmartSet", "isSupportWechatPay", "findRegionByCountry", "context", "Landroid/content/Context;", "countyCode", "readJsonFromAsset", "assetFileName", "login-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRegionUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RegionUtil.kt\ncom/xiaomi/fitness/login/utils/RegionUtil\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,81:1\n1#2:82\n108#3:83\n80#3,22:84\n*S KotlinDebug\n*F\n+ 1 RegionUtil.kt\ncom/xiaomi/fitness/login/utils/RegionUtil\n*L\n72#1:83\n72#1:84,22\n*E\n"})
public final class RegionUtil {

    @NotNull
    public static final RegionUtil INSTANCE = new RegionUtil();

    private RegionUtil() {
    }

    @JvmStatic
    @NotNull
    public static final String getCurrentLocalCountry() {
        return RegionExtKt.getInstance(RegionManager.INSTANCE).getLocalCountry();
    }

    @JvmStatic
    public static final boolean isInTaiWan() {
        return RegionExtKt.isInTaiwan(RegionExtKt.getInstance(RegionManager.INSTANCE));
    }

    @JvmStatic
    public static final boolean isInnerCN() {
        return RegionExtKt.isInland(RegionExtKt.getInstance(RegionManager.INSTANCE));
    }

    private final String readJsonFromAsset(Context context, String assetFileName) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getAssets().open(assetFileName), StandardCharsets.UTF_8));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                int length = line.length() - 1;
                int i = 0;
                boolean z = false;
                while (i <= length) {
                    boolean z2 = Intrinsics.compare((int) line.charAt(!z ? i : length), 32) <= 0;
                    if (z) {
                        if (!z2) {
                            break;
                        }
                        length--;
                    } else if (z2) {
                        i++;
                    } else {
                        z = true;
                    }
                }
                sb.append(line.subSequence(i, length + 1).toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @Nullable
    public final String findRegionByCountry(@NotNull Context context, @NotNull String countyCode) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(countyCode, "countyCode");
        try {
            JSONObject jSONObject = new JSONObject(readJsonFromAsset(context, "region.json"));
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
            String upperCase = countyCode.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            return jSONObject.getString(upperCase);
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public final boolean isInvokeAuthSupport() {
        return !isInnerCN();
    }

    public final boolean isMedalSupport() {
        return !AppUtil.INSTANCE.isPlayChannel() && isInnerCN();
    }

    public final boolean isSupportAliPaySmartSet() {
        return isInnerCN();
    }

    public final boolean isSupportWechatPay() {
        return isInnerCN();
    }
}
