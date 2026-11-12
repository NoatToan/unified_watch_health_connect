package com.huami.account;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.annotations.SerializedName;
import com.huami.network.base.util.HMHttpUtils;
import com.huami.tools.log.HMLog;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001,B\t\b\u0002¢\u0006\u0004\b*\u0010+J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0007J\b\u0010\b\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002J0\u0010\u0011\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\f2\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00028\u00000\r¢\u0006\u0002\b\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0014\u001a\u00020\u00062\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00060\r¢\u0006\u0002\b\u000fH\u0002J\u0018\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015J\u000e\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\u001c\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001b\u001a\u00020\u001aJ\u0010\u0010\u001d\u001a\u00020\u001a2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u001f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u001eJ\u0006\u0010 \u001a\u00020\u0006R\u0016\u0010\"\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010!R\u0016\u0010#\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0004\u0010!R\u0016\u0010$\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010!R\u0016\u0010%\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010!R\u0018\u0010'\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0016\u0010)\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010(¨\u0006-"}, d2 = {"Lcom/huami/account/XiaoaiTokenKeeper;", "", "", "deviceId", "b", "e", "", PointCategory.INIT, GoogleApiAvailabilityLight.a, "", "previousUid", "a", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function1;", "Landroid/content/SharedPreferences;", "Lkotlin/ExtensionFunctionType;", "keeperConfiguration", "c", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Landroid/content/SharedPreferences$Editor;", "f", "Lcom/huami/account/XiaoaiTokenKeeper$DeviceToken;", "token", "saveToken", "removeToken", "getToken", "", "isSuccess", "setConvertTokenResult", "isConvertTokenFailed", "", "getAll", "removeAll", "Ljava/lang/String;", "TAG", "XML_FILE_PREFIX", "KEY_TOKEN_PREFIX", "KEY_CONVERT_FAILED", "Landroid/content/SharedPreferences;", "sp", "J", "currentUid", "<init>", "()V", "DeviceToken", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class XiaoaiTokenKeeper {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "XiaoaiTokenKeeper";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final String XML_FILE_PREFIX = "XA_Token";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final String KEY_TOKEN_PREFIX = "token";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static final String KEY_CONVERT_FAILED = "convert_failed";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private static SharedPreferences sp;

    @NotNull
    public static final XiaoaiTokenKeeper INSTANCE = new XiaoaiTokenKeeper();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private static long currentUid = -1;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b'\u0010(J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0004HÆ\u0003JM\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\n\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u000b\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001e\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u001e\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u001eR\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001c\u001a\u0004\b$\u0010\u001eR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u001c\u001a\u0004\b&\u0010\u001e¨\u0006)"}, d2 = {"Lcom/huami/account/XiaoaiTokenKeeper$DeviceToken;", "", "", "component1", "", "component2", "component3", "component4", "component5", "component6", "saveTime", "tpacType", "deviceId", "refreshToken", "accessToken", "xiaomiId", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "J", "getSaveTime", "()J", "b", "Ljava/lang/String;", "getTpacType", "()Ljava/lang/String;", "c", "getDeviceId", GoogleApiAvailabilityLight.a, "getRefreshToken", "e", "getAccessToken", "f", "getXiaomiId", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "accountui_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class DeviceToken {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @SerializedName("saveTime")
        private final long saveTime;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @SerializedName("tpacType")
        @NotNull
        private final String tpacType;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        @SerializedName("deviceId")
        @Nullable
        private final String deviceId;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
        @SerializedName("refreshToken")
        @Nullable
        private final String refreshToken;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
        @SerializedName("accessToken")
        @Nullable
        private final String accessToken;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
        @SerializedName("xiaomiId")
        @Nullable
        private final String xiaomiId;

        public DeviceToken(long j, @NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
            this.saveTime = j;
            this.tpacType = str;
            this.deviceId = str2;
            this.refreshToken = str3;
            this.accessToken = str4;
            this.xiaomiId = str5;
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getSaveTime() {
            return this.saveTime;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getTpacType() {
            return this.tpacType;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getDeviceId() {
            return this.deviceId;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getRefreshToken() {
            return this.refreshToken;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getAccessToken() {
            return this.accessToken;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getXiaomiId() {
            return this.xiaomiId;
        }

        @NotNull
        public final DeviceToken copy(long saveTime, @NotNull String tpacType, @Nullable String deviceId, @Nullable String refreshToken, @Nullable String accessToken, @Nullable String xiaomiId) {
            return new DeviceToken(saveTime, tpacType, deviceId, refreshToken, accessToken, xiaomiId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DeviceToken)) {
                return false;
            }
            DeviceToken deviceToken = (DeviceToken) other;
            return this.saveTime == deviceToken.saveTime && Intrinsics.areEqual(this.tpacType, deviceToken.tpacType) && Intrinsics.areEqual(this.deviceId, deviceToken.deviceId) && Intrinsics.areEqual(this.refreshToken, deviceToken.refreshToken) && Intrinsics.areEqual(this.accessToken, deviceToken.accessToken) && Intrinsics.areEqual(this.xiaomiId, deviceToken.xiaomiId);
        }

        @Nullable
        public final String getAccessToken() {
            return this.accessToken;
        }

        @Nullable
        public final String getDeviceId() {
            return this.deviceId;
        }

        @Nullable
        public final String getRefreshToken() {
            return this.refreshToken;
        }

        public final long getSaveTime() {
            return this.saveTime;
        }

        @NotNull
        public final String getTpacType() {
            return this.tpacType;
        }

        @Nullable
        public final String getXiaomiId() {
            return this.xiaomiId;
        }

        public int hashCode() {
            int iA = ((defpackage.b.a(this.saveTime) * 31) + this.tpacType.hashCode()) * 31;
            String str = this.deviceId;
            int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.refreshToken;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.accessToken;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.xiaomiId;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "DeviceToken(saveTime=" + this.saveTime + ", tpacType=" + this.tpacType + ", deviceId=" + this.deviceId + ", refreshToken=" + this.refreshToken + ", accessToken=" + this.accessToken + ", xiaomiId=" + this.xiaomiId + ")";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Landroid/content/SharedPreferences;", "", "Lcom/huami/account/XiaoaiTokenKeeper$DeviceToken;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<SharedPreferences, List<? extends DeviceToken>> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<DeviceToken> invoke(@NotNull SharedPreferences sharedPreferences) {
            Set<String> setKeySet = sharedPreferences.getAll().keySet();
            ArrayList arrayList = new ArrayList();
            for (Object obj : setKeySet) {
                if (kotlin.text.m.startsWith$default((String) obj, "token", false, 2, null)) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                String string = sharedPreferences.getString((String) it2.next(), null);
                if (string != null) {
                    arrayList2.add(string);
                }
            }
            ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                arrayList3.add((DeviceToken) HMHttpUtils.getGson().fromJson((String) it3.next(), DeviceToken.class));
            }
            return arrayList3;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n"}, d2 = {"Landroid/content/SharedPreferences;", "Lcom/huami/account/XiaoaiTokenKeeper$DeviceToken;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<SharedPreferences, DeviceToken> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(1);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DeviceToken invoke(@NotNull SharedPreferences sharedPreferences) {
            String string = sharedPreferences.getString(XiaoaiTokenKeeper.INSTANCE.e(this.a), null);
            if (string == null) {
                return null;
            }
            return (DeviceToken) HMHttpUtils.getGson().fromJson(string, DeviceToken.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Landroid/content/SharedPreferences;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<SharedPreferences, Boolean> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(1);
            this.a = str;
        }

        public final boolean a(@NotNull SharedPreferences sharedPreferences) {
            String str = this.a;
            if (str == null) {
                return false;
            }
            return sharedPreferences.getBoolean(XiaoaiTokenKeeper.INSTANCE.b(str), false);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(SharedPreferences sharedPreferences) {
            return Boolean.valueOf(a(sharedPreferences));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Landroid/content/SharedPreferences$Editor;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<SharedPreferences.Editor, Unit> {
        public static final d a = new d();

        public d() {
            super(1);
        }

        public final void a(@NotNull SharedPreferences.Editor editor) {
            editor.clear();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SharedPreferences.Editor editor) {
            a(editor);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Landroid/content/SharedPreferences$Editor;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function1<SharedPreferences.Editor, Unit> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str) {
            super(1);
            this.a = str;
        }

        public final void a(@NotNull SharedPreferences.Editor editor) {
            editor.remove(XiaoaiTokenKeeper.INSTANCE.e(this.a));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SharedPreferences.Editor editor) {
            a(editor);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Landroid/content/SharedPreferences$Editor;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function1<SharedPreferences.Editor, Unit> {
        public final /* synthetic */ DeviceToken a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(DeviceToken deviceToken, String str) {
            super(1);
            this.a = deviceToken;
            this.b = str;
        }

        public final void a(@NotNull SharedPreferences.Editor editor) {
            if (this.a == null) {
                editor.remove(XiaoaiTokenKeeper.INSTANCE.e(this.b));
            } else {
                editor.putString(XiaoaiTokenKeeper.INSTANCE.e(this.b), HMHttpUtils.getGson().toJson(this.a));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SharedPreferences.Editor editor) {
            a(editor);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Landroid/content/SharedPreferences$Editor;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function1<SharedPreferences.Editor, Unit> {
        public final /* synthetic */ String a;
        public final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, boolean z) {
            super(1);
            this.a = str;
            this.b = z;
        }

        public final void a(@NotNull SharedPreferences.Editor editor) {
            String str = this.a;
            if (str == null) {
                return;
            }
            editor.putBoolean(XiaoaiTokenKeeper.INSTANCE.b(str), !this.b);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SharedPreferences.Editor editor) {
            a(editor);
            return Unit.INSTANCE;
        }
    }

    private XiaoaiTokenKeeper() {
    }

    private final void a(long previousUid) {
        SharedPreferences sharedPreferences = sp;
        if (sharedPreferences == null || previousUid == -1 || sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().clear().apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String b(String deviceId) {
        return KEY_CONVERT_FAILED + deviceId;
    }

    private final <T> T c(Function1<? super SharedPreferences, ? extends T> keeperConfiguration) {
        d();
        SharedPreferences sharedPreferences = sp;
        if (sharedPreferences != null) {
            return keeperConfiguration.invoke(sharedPreferences);
        }
        HMLog.e(TAG, "请先对 Keeper 进行初始化", new Object[0]);
        return null;
    }

    private final void d() {
        Context appContext = AccountExternalsKt.getAppContext();
        long validUid = HMLoginManager.getValidUid();
        long j = currentUid;
        if (validUid != j) {
            a(j);
            sp = appContext.getSharedPreferences("XA_Token_" + validUid, 0);
            currentUid = validUid;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String e(String deviceId) {
        return "token-" + deviceId;
    }

    private final void f(Function1<? super SharedPreferences.Editor, Unit> keeperConfiguration) {
        d();
        SharedPreferences sharedPreferences = sp;
        if (sharedPreferences == null) {
            HMLog.e(TAG, "请先对 Keeper 进行初始化", new Object[0]);
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        keeperConfiguration.invoke(editorEdit);
        editorEdit.apply();
    }

    @JvmStatic
    public static final void init() {
        INSTANCE.d();
    }

    @Nullable
    public final List<DeviceToken> getAll() {
        return (List) c(a.a);
    }

    @Nullable
    public final DeviceToken getToken(@NotNull String deviceId) {
        return (DeviceToken) c(new b(deviceId));
    }

    public final boolean isConvertTokenFailed(@Nullable String deviceId) {
        Boolean bool = (Boolean) c(new c(deviceId));
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final void removeAll() {
        f(d.a);
    }

    public final void removeToken(@NotNull String deviceId) {
        f(new e(deviceId));
    }

    public final void saveToken(@NotNull String deviceId, @Nullable DeviceToken token) {
        f(new f(token, deviceId));
    }

    public final void setConvertTokenResult(@Nullable String deviceId, boolean isSuccess) {
        f(new g(deviceId, isSuccess));
    }
}
