package com.huami.account.ui.areas;

import android.text.TextUtils;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huami.account.AccountExternalsKt;
import com.huami.account.selectArea.datasource.AreaMapper;
import com.huami.account.service.model.Area;
import com.huami.account.service.model.UnknownArea;
import com.huami.passport.AccountManager;
import com.huami.watch.companion.ui.activity.BaseDeviceStatusActivity;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0019\n\u0002\u0010!\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b;\u0010<J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\b\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\t\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\n\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u000b\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\f\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\r\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u000e\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u000f\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0010\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0011\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0012\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0013\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002J\u0006\u0010\u0014\u001a\u00020\u0002J\u001a\u0010\u0018\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0015J\u0010\u0010\u0019\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002J\u0006\u0010\u001a\u001a\u00020\u0002J\u0006\u0010\u001b\u001a\u00020\u0002J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015J\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001dR\u0016\u0010\u001f\u001a\u00020\u00158\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u00020\u00158\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010 R\u0016\u0010\"\u001a\u00020\u00158\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010 R\u0016\u0010#\u001a\u00020\u00158\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010 R\u0016\u0010$\u001a\u00020\u00158\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010 R\u0016\u0010%\u001a\u00020\u00158\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010 R\u0016\u0010&\u001a\u00020\u00158\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010 R\u0016\u0010'\u001a\u00020\u00158\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010 R\u0016\u0010(\u001a\u00020\u00158\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010 R\u0016\u0010)\u001a\u00020\u00158\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010 R\u0016\u0010*\u001a\u00020\u00158\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010 R\u0016\u0010+\u001a\u00020\u00158\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b+\u0010 R\u0016\u0010,\u001a\u00020\u00158\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b,\u0010 R\u0016\u0010-\u001a\u00020\u00158\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010 R\u0016\u0010/\u001a\u00020\u00158\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010 R\u0016\u00101\u001a\u00020\u00158\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b0\u0010 R\u0016\u00103\u001a\u00020\u00158\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b2\u0010 R\u0016\u00106\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u001c\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109¨\u0006="}, d2 = {"Lcom/huami/account/ui/areas/SelectAreaManager;", "", "Lcom/huami/account/service/model/Area;", "getDefaultArea", BaseDeviceStatusActivity.KEY_AREA, "", "a", "isEU", "isUS", "isCN", "isHK", "isMO", "isTW", "isKR", "isIN", "isRU", "isUA", "isBY", "isSG", "isGB", "getUnknownArea", "", "countryCode", "stateCode", "isUsCalifornia", "isUnknown", "getAreaBySave", "getArea", "getAreaByCountryCode", "", "getAll", "EU", "Ljava/lang/String;", "US", "CN", "HK", "MO", "TW", "KR", "IN", "RU", "UA", "BY", "SG", SelectAreaManager.GB, "STATE_US_CA", "b", "UNKNOWN", "c", "ASSET_REGION", GoogleApiAvailabilityLight.a, "ASSET_EU", "e", "Lcom/huami/account/service/model/Area;", "UNKNOWN_AREA", "", "f", "Ljava/util/List;", "mAreas", "<init>", "()V", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class SelectAreaManager {

    @NotNull
    public static final String BY = "BY";

    @NotNull
    public static final String CN = "CN";

    @NotNull
    public static final String EU = "EU";

    @NotNull
    public static final String GB = "GB";

    @NotNull
    public static final String HK = "HK";

    @NotNull
    public static final String IN = "IN";

    @NotNull
    public static final String KR = "KR";

    @NotNull
    public static final String MO = "MO";

    @NotNull
    public static final String RU = "RU";

    @NotNull
    public static final String SG = "SG";

    @NotNull
    public static final String TW = "TW";

    @NotNull
    public static final String UA = "UA";

    @NotNull
    public static final String US = "US";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String STATE_US_CA = "US-CA";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final String UNKNOWN = "unknown";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final String ASSET_REGION = "region.json";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static final String ASSET_EU = "eu.json";

    @NotNull
    public static final SelectAreaManager INSTANCE = new SelectAreaManager();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private static final Area UNKNOWN_AREA = new UnknownArea();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private static List<Area> mAreas = new ArrayList();

    private SelectAreaManager() {
    }

    private final boolean a(Area area) {
        return Locale.getDefault().getCountry().equals(area.getValue());
    }

    @JvmStatic
    @NotNull
    public static final Area getDefaultArea() {
        String country = Locale.getDefault().getCountry();
        SelectAreaManager selectAreaManager = INSTANCE;
        Area unknownArea = selectAreaManager.getUnknownArea();
        for (Area area : selectAreaManager.getAll()) {
            if (Intrinsics.areEqual(area.getValue(), country) && !Intrinsics.areEqual(area.getValue(), unknownArea.getValue())) {
                unknownArea = area;
            }
        }
        return unknownArea;
    }

    @NotNull
    public final synchronized List<Area> getAll() {
        if (mAreas.size() > 0) {
            return mAreas;
        }
        InputStream inputStreamOpen = AccountExternalsKt.getAppContext().getAssets().open(ASSET_REGION);
        Charset charset = Charsets.UTF_8;
        String text = TextStreamsKt.readText(new InputStreamReader(inputStreamOpen, charset));
        String text2 = TextStreamsKt.readText(new InputStreamReader(AccountExternalsKt.getAppContext().getAssets().open(ASSET_EU), charset));
        List<String> list = (List) new Gson().fromJson(text, new TypeToken<List<? extends String>>() { // from class: com.huami.account.ui.areas.SelectAreaManager$getAll$regions$1
        }.getType());
        Object objFromJson = new Gson().fromJson(text2, new TypeToken<List<? extends String>>() { // from class: com.huami.account.ui.areas.SelectAreaManager$getAll$euSets$1
        }.getType());
        if (objFromJson == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
        }
        Set set = CollectionsKt___CollectionsKt.toSet((List) objFromJson);
        for (String str : list) {
            mAreas.add(new Area(null, AreaMapper.INSTANCE.exec(str), str, null, set.contains(str) ? "EU" : null, null));
        }
        return mAreas;
    }

    @NotNull
    public final Area getArea() {
        String countryCode = AccountManager.getDefault(AccountExternalsKt.getAppContext()).getCountryCode();
        String country = Locale.getDefault().getCountry();
        Area unknownArea = getUnknownArea();
        for (Area area : getAll()) {
            if (Intrinsics.areEqual(area.getValue(), countryCode)) {
                return area;
            }
            if (Intrinsics.areEqual(area.getValue(), country)) {
                unknownArea = area;
            }
        }
        return unknownArea;
    }

    @Nullable
    public final Area getAreaByCountryCode(@Nullable String countryCode) {
        if (TextUtils.isEmpty(countryCode)) {
            return null;
        }
        for (Area area : getAll()) {
            if (Intrinsics.areEqual(area.getValue(), countryCode)) {
                return area;
            }
        }
        return null;
    }

    @NotNull
    public final Area getAreaBySave() {
        String countryCode = AccountManager.getDefault(AccountExternalsKt.getAppContext()).getCountryCode();
        Area unknownArea = getUnknownArea();
        for (Area area : getAll()) {
            if (Intrinsics.areEqual(area.getValue(), countryCode)) {
                return area;
            }
        }
        return unknownArea;
    }

    @NotNull
    public final Area getUnknownArea() {
        return UNKNOWN_AREA;
    }

    public final boolean isBY(@Nullable Area area) {
        return area != null && Intrinsics.areEqual("BY", area.getValue());
    }

    public final boolean isCN(@Nullable Area area) {
        return area != null && Intrinsics.areEqual("CN", area.getValue());
    }

    public final boolean isEU(@Nullable Area area) {
        return area != null && Intrinsics.areEqual("EU", area.getAlliance());
    }

    public final boolean isGB(@Nullable Area area) {
        return area != null && Intrinsics.areEqual(GB, area.getValue());
    }

    public final boolean isHK(@Nullable Area area) {
        return area != null && Intrinsics.areEqual("HK", area.getValue());
    }

    public final boolean isIN(@Nullable Area area) {
        return area != null && Intrinsics.areEqual("IN", area.getValue());
    }

    public final boolean isKR(@Nullable Area area) {
        return area != null && Intrinsics.areEqual("KR", area.getValue());
    }

    public final boolean isMO(@Nullable Area area) {
        return area != null && Intrinsics.areEqual("MO", area.getValue());
    }

    public final boolean isRU(@Nullable Area area) {
        return area != null && Intrinsics.areEqual("RU", area.getValue());
    }

    public final boolean isSG(@Nullable Area area) {
        return area != null && Intrinsics.areEqual("SG", area.getValue());
    }

    public final boolean isTW(@Nullable Area area) {
        return area != null && Intrinsics.areEqual("TW", area.getValue());
    }

    public final boolean isUA(@Nullable Area area) {
        return area != null && Intrinsics.areEqual("UA", area.getValue());
    }

    public final boolean isUS(@Nullable Area area) {
        return area != null && Intrinsics.areEqual("US", area.getValue());
    }

    public final boolean isUnknown(@Nullable Area area) {
        return area == null || Intrinsics.areEqual("unknown", area.getValue());
    }

    public final boolean isUsCalifornia(@Nullable String countryCode, @Nullable String stateCode) {
        return Intrinsics.areEqual("US", countryCode) && Intrinsics.areEqual("US-CA", stateCode);
    }
}
