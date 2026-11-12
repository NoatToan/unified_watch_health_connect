package com.xiaomi.fitness.devicesettings.common.offlinemap;

import android.content.Context;
import android.content.res.AssetManager;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ \u0010\u000f\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u00112\u0006\u0010\u0012\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/common/offlinemap/DistrictManager;", "", "<init>", "()V", "TAG", "", "districts", "", "Lcom/xiaomi/fitness/devicesettings/common/offlinemap/DistrictData;", "getDistricts", "()Ljava/util/List;", "init", "", "context", "Landroid/content/Context;", "getDistrict", "data", "", "adcode", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDistrictManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DistrictManager.kt\ncom/xiaomi/fitness/devicesettings/common/offlinemap/DistrictManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,48:1\n1#2:49\n1863#3,2:50\n*S KotlinDebug\n*F\n+ 1 DistrictManager.kt\ncom/xiaomi/fitness/devicesettings/common/offlinemap/DistrictManager\n*L\n37#1:50,2\n*E\n"})
public final class DistrictManager {

    @NotNull
    public static final String TAG = "DistrictManager";

    @NotNull
    public static final DistrictManager INSTANCE = new DistrictManager();

    @NotNull
    private static final List<DistrictData> districts = new ArrayList();

    private DistrictManager() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DistrictData getDistrict$default(DistrictManager districtManager, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = districts;
        }
        return districtManager.getDistrict(list, str);
    }

    @Nullable
    public final DistrictData getDistrict(@NotNull List<DistrictData> data, @NotNull String adcode) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(adcode, "adcode");
        for (DistrictData districtData : data) {
            if (TextUtils.equals(adcode, districtData.getAdcode())) {
                return districtData;
            }
            List<DistrictData> districts2 = districtData.getDistricts();
            if (districts2 != null && (!districts2.isEmpty())) {
                return INSTANCE.getDistrict(districtData.getDistricts(), adcode);
            }
        }
        return null;
    }

    @NotNull
    public final List<DistrictData> getDistricts() {
        return districts;
    }

    public final void init(@NotNull Context context) {
        BufferedReader bufferedReader;
        String text;
        InputStream inputStreamOpen;
        Intrinsics.checkNotNullParameter(context, "context");
        AssetManager assets = context.getAssets();
        if (assets == null || (inputStreamOpen = assets.open("districts.json")) == null) {
            bufferedReader = null;
        } else {
            Reader inputStreamReader = new InputStreamReader(inputStreamOpen, Charsets.UTF_8);
            bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
        }
        if (bufferedReader != null) {
            try {
                text = TextStreamsKt.readText(bufferedReader);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(bufferedReader, th);
                    throw th2;
                }
            }
        } else {
            text = null;
        }
        CloseableKt.closeFinally(bufferedReader, null);
        FitnessLogUtils.i(RegionListFragment.TAG, "assets jsonText:" + text);
        try {
            List<DistrictData> list = districts;
            Object objFromJson = new Gson().fromJson(text, new TypeToken<List<? extends DistrictData>>() { // from class: com.xiaomi.fitness.devicesettings.common.offlinemap.DistrictManager.init.1
            }.getType());
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            list.addAll((Collection) objFromJson);
        } catch (Exception e) {
            FitnessLogUtils.e(TAG, "district init error e:" + e);
        }
    }
}
