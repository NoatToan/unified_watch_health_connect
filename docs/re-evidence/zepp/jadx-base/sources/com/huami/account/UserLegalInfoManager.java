package com.huami.account;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.huami.account.UserLegalInfoManager;
import com.huami.account.api.HMAccountWebAPI;
import com.huami.account.bean.LegalInfoType;
import com.huami.account.bean.NavigateAgreementType;
import com.huami.account.keeper.HMAccountKeeper;
import com.huami.account.service.model.Area;
import com.huami.account.ui.R;
import com.huami.account.ui.areas.SelectAreaHelper;
import com.huami.account.ui.legal.UserAgreementFooterFragment;
import com.huami.account.ui.legal.UserAgreementForRegisterFragment;
import com.huami.account.ui.legal.UserAgreementFragment;
import com.huami.account.utils.AgreementDiffManager;
import com.huami.account.utils.UserLegalServiceKt;
import com.huami.mifit.analytics.Analytics;
import com.huami.network.base.handler.IHMBasicHttpResponseHandler;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.hmnetwork.config.HMAppConfig;
import com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler;
import com.huami.network.hmnetwork.properties.HMUserPropertiesAPI;
import com.huami.network.hmnetwork.properties.PropertyItem;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.network.hmnetwork.webapi.HMWebUtil;
import com.huami.network.hmnetwork.webapi.WebResponse;
import com.huami.tools.log.HMLog;
import com.huami.userproperty.UserPropertyManager;
import com.huami.userproperty.service.UserProperty;
import com.huami.userproperty.service.entity.remote.PushResult;
import com.huami.widget.toast.IconToast;
import com.xiaomi.hm.health.baseutil.NetUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class UserLegalInfoManager {
    public static final String KEY_HAD_SAVED = "had_saved";
    public static final String KEY_ITEMS = "items";
    public static final String KEY_LANGUAGE = "language";
    public static final String KEY_TIME = "time";
    public static final String KEY_VERSION = "version";
    public static final String TAG = "UserLegalInfoManager";
    private static final String a = "lang";
    private static final String b = "channel";
    private static final String c = "userId";
    private static final String d = "cv";
    private static final String e = "t";
    private static final String f = "redirectType";
    private static final String g = "appplatform";
    private static final String h = "appName";
    private static final String i = "apps/redirectPages";
    private static final String j = "true";
    private static final String k = "true";
    private static final String l = "{\"items\":[]}";

    @Deprecated
    public interface AgreementDialogCallback extends UserLegalInfoComponents.AgreementDialogCallback {
    }

    public interface OnCcpaStatusGetListener {
        void onGet(Boolean bool);
    }

    public interface OnLegalInfoEndListener {
        void onEnd();
    }

    public interface SaveVersionCallback {
        void onSaveResult(boolean z);
    }

    public class a extends IHMSimpleHttpResponseHandler {
        public final /* synthetic */ Map a;
        public final /* synthetic */ LegalInfoType b;

        public a(Map map, LegalInfoType legalInfoType) {
            this.a = map;
            this.b = legalInfoType;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onFailure(HMHttpResponseData hMHttpResponseData) {
            UserLegalInfoManager.J(this.b, this.a);
        }

        @Override // com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler
        public void onSuccess(WebResponse webResponse, HMHttpResponseData hMHttpResponseData) {
            if (hMHttpResponseData.isSuccess()) {
                UserLegalInfoManager.K(hMHttpResponseData, this.a, this.b);
            } else {
                UserLegalInfoManager.J(this.b, this.a);
            }
        }
    }

    public class b extends IHMSimpleHttpResponseHandler {
        public final /* synthetic */ SaveVersionCallback a;

        public b(SaveVersionCallback saveVersionCallback) {
            this.a = saveVersionCallback;
        }

        @Override // com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler, com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int i) {
            this.a.onSaveResult(false);
        }

        @Override // com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler, com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(Throwable th) {
            this.a.onSaveResult(false);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onFailure(HMHttpResponseData hMHttpResponseData) {
            this.a.onSaveResult(false);
        }

        @Override // com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler
        public void onSuccess(WebResponse webResponse, HMHttpResponseData hMHttpResponseData) {
            if (hMHttpResponseData.isSuccess()) {
                UserLegalInfoManager.t();
            }
            this.a.onSaveResult(hMHttpResponseData.isSuccess());
        }
    }

    public class c extends IHMSimpleHttpResponseHandler {
        public final /* synthetic */ Map a;
        public final /* synthetic */ LegalInfoType b;
        public final /* synthetic */ AtomicBoolean c;

        public c(Map map, LegalInfoType legalInfoType, AtomicBoolean atomicBoolean) {
            this.a = map;
            this.b = legalInfoType;
            this.c = atomicBoolean;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onFailure(HMHttpResponseData hMHttpResponseData) {
            UserLegalInfoManager.J(this.b, this.a);
        }

        @Override // com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler
        public void onSuccess(WebResponse webResponse, HMHttpResponseData hMHttpResponseData) {
            if (!hMHttpResponseData.isSuccess()) {
                UserLegalInfoManager.J(this.b, this.a);
            } else {
                UserLegalInfoManager.K(hMHttpResponseData, this.a, this.b);
                this.c.set(true);
            }
        }
    }

    public static /* synthetic */ class d {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[NavigateAgreementType.values().length];
            b = iArr;
            try {
                iArr[NavigateAgreementType.AGREEMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[NavigateAgreementType.EXPERIENCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[NavigateAgreementType.PRIVACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[NavigateAgreementType.USER_DATA_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[LegalInfoType.values().length];
            a = iArr2;
            try {
                iArr2[LegalInfoType.AGREEMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[LegalInfoType.PRIVACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[LegalInfoType.EXPERIENCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static class e extends AsyncTask<Void, List<LegalInfoType>, List<LegalInfoType>> {
        private Map<LegalInfoType, String> a;
        private WeakReference<AppCompatActivity> b;
        private List<LegalInfoType> c;
        private OnLegalInfoEndListener d;
        private final boolean e;

        private e(@Nullable AppCompatActivity appCompatActivity, List<LegalInfoType> list, OnLegalInfoEndListener onLegalInfoEndListener) {
            this.a = new HashMap();
            this.b = new WeakReference<>(appCompatActivity);
            this.c = list;
            this.d = onLegalInfoEndListener;
            this.e = appCompatActivity == null;
        }

        private void c(List<LegalInfoType> list) {
            AppCompatActivity appCompatActivity = this.b.get();
            if (this.e || !(appCompatActivity == null || appCompatActivity.isFinishing())) {
                boolean zContains = list.contains(LegalInfoType.AGREEMENT);
                boolean zContains2 = list.contains(LegalInfoType.PRIVACY);
                boolean zContains3 = list.contains(LegalInfoType.EXPERIENCE);
                if (zContains || zContains2) {
                    UserLegalInfoComponents.INSTANCE.showAgreementAndPrivacyDialog(appCompatActivity, this.a, zContains, zContains2, zContains3, this.d);
                    return;
                }
                if (zContains3) {
                    UserLegalInfoComponents.INSTANCE.showExperienceDialog(appCompatActivity, this.a, this.d);
                    return;
                }
                OnLegalInfoEndListener onLegalInfoEndListener = this.d;
                if (onLegalInfoEndListener != null) {
                    onLegalInfoEndListener.onEnd();
                }
                UserLegalInfoManager.saveVersionToServer();
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<LegalInfoType> doInBackground(Void... voidArr) {
            return UserLegalInfoManager.O(this.c, this.a);
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(List<LegalInfoType> list) {
            super.onPostExecute(list);
            c(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String C(Exception exc) {
        return "parse local data error:" + exc.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void E(boolean z) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Unit F(PushResult pushResult) {
        final boolean z = pushResult instanceof PushResult.Success;
        HMLog.info(TAG, new Function0() { // from class: p78
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UserLegalInfoManager.G(z);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String G(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("ccpa 标记上传 ->");
        sb.append(z ? "成功" : "失败");
        return sb.toString();
    }

    private static boolean H(String str) {
        if (TextUtils.isEmpty(str) || AccountExternalsKt.getConfigDelegate().debug()) {
            return true;
        }
        try {
            return !u(new JSONObject(str).optLong("time"), System.currentTimeMillis());
        } catch (Exception e2) {
            HMLog.debug(TAG, new Function0() { // from class: l78
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Log.getStackTraceString(e2);
                }
            });
            return true;
        }
    }

    private static List<LegalInfoType> I() {
        ArrayList arrayList = new ArrayList();
        HMAccountKeeper hMAccountKeeper = HMAccountKeeper.INSTANCE;
        if (H(hMAccountKeeper.readUpdateUserAgreement())) {
            arrayList.add(LegalInfoType.AGREEMENT);
        }
        if (H(hMAccountKeeper.readUpdateUserPrivacy())) {
            arrayList.add(LegalInfoType.PRIVACY);
        }
        if (hMAccountKeeper.readAgreeUserExperience() && H(hMAccountKeeper.readUpdateUserExperience()) && HMLoginManager.isShowExperience()) {
            arrayList.add(LegalInfoType.EXPERIENCE);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void J(LegalInfoType legalInfoType, Map<LegalInfoType, String> map) {
        String updateUserAgreement;
        int i2 = d.a[legalInfoType.ordinal()];
        if (i2 == 1) {
            updateUserAgreement = HMAccountKeeper.INSTANCE.readUpdateUserAgreement();
        } else if (i2 != 2) {
            updateUserAgreement = i2 != 3 ? null : HMAccountKeeper.INSTANCE.readUpdateUserExperience();
        } else {
            updateUserAgreement = HMAccountKeeper.INSTANCE.readUpdateUserPrivacy();
        }
        if (updateUserAgreement != null) {
            HMLog.v(TAG, String.format("[%s] 请求失败，使用本地缓存版本", legalInfoType), new Object[0]);
        } else if (UserLegalInfoFallbackKt.isFallbackResValid()) {
            String strFilterUselessProperties = UserLegalServiceKt.filterUselessProperties(UserLegalInfoFallbackKt.getAgreementLocalVersion(legalInfoType).toString());
            HMLog.v(TAG, String.format("[%s] 请求失败，使用本地预置版本", legalInfoType), new Object[0]);
            map.put(legalInfoType, strFilterUselessProperties);
            UserLegalInfoFallbackKt.setUseLocal(legalInfoType, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void K(HMHttpResponseData hMHttpResponseData, Map<LegalInfoType, String> map, LegalInfoType legalInfoType) {
        map.put(legalInfoType, UserLegalServiceKt.filterUselessProperties(new String(hMHttpResponseData.getResponseBody())));
        HMLog.v(TAG, String.format("[%s] 请求成功，使用云端最新版本", legalInfoType), new Object[0]);
        UserLegalInfoFallbackKt.setUseLocal(legalInfoType, false);
    }

    private static boolean L(String str, String str2, LegalInfoType legalInfoType) {
        return M(str, str2, legalInfoType, false);
    }

    private static boolean M(String str, String str2, LegalInfoType legalInfoType, boolean z) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        boolean zIsEmpty2 = TextUtils.isEmpty(str2);
        if (!z && zIsEmpty) {
            str = l;
        }
        if ((z && zIsEmpty) || zIsEmpty2) {
            try {
                Q(legalInfoType, zIsEmpty2 ? new JSONObject() : new JSONObject(str2));
            } catch (Exception e2) {
                HMLog.debug(TAG, new Function0() { // from class: k78
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Log.getStackTraceString(e2);
                    }
                });
            }
            return false;
        }
        try {
            String lang = HMWebUtil.getLang();
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = new JSONObject(str2);
            if (!jSONObject.has(lang)) {
                if (!jSONObject.has("items")) {
                    Q(legalInfoType, jSONObject2);
                    return false;
                }
                boolean zP = p(jSONObject, jSONObject2);
                if (!zP) {
                    R(legalInfoType, jSONObject2, false);
                }
                return zP;
            }
            JSONObject jSONObject3 = jSONObject.getJSONObject(lang);
            JSONArray jSONArray = jSONObject2.getJSONArray("items");
            long jOptLong = 0;
            long jOptLong2 = jSONObject3.optLong("version");
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject jSONObject4 = jSONArray.getJSONObject(i2);
                if (lang.equalsIgnoreCase(jSONObject4.optString(KEY_LANGUAGE))) {
                    jOptLong = jSONObject4.optLong("version");
                    break;
                }
            }
            if (jOptLong > jOptLong2) {
                return true;
            }
            Q(legalInfoType, jSONObject2);
            return false;
        } catch (Exception e3) {
            HMLog.info(TAG, new Function0() { // from class: i78
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return UserLegalInfoManager.C(e3);
                }
            });
        }
    }

    private static void N(Map<LegalInfoType, String> map, LegalInfoType legalInfoType) {
        HMAccountWebAPI.getPageVersions(legalInfoType, new a(map, legalInfoType));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<LegalInfoType> O(List<LegalInfoType> list, Map<LegalInfoType, String> map) {
        Iterator<LegalInfoType> it2 = list.iterator();
        while (it2.hasNext()) {
            N(map, it2.next());
        }
        ArrayList arrayList = new ArrayList();
        LegalInfoType legalInfoType = LegalInfoType.AGREEMENT;
        if (map.containsKey(legalInfoType) && L(q(legalInfoType), map.get(legalInfoType), legalInfoType)) {
            arrayList.add(legalInfoType);
        }
        LegalInfoType legalInfoType2 = LegalInfoType.PRIVACY;
        if (map.containsKey(legalInfoType2) && L(q(legalInfoType2), map.get(legalInfoType2), legalInfoType2)) {
            arrayList.add(legalInfoType2);
        }
        LegalInfoType legalInfoType3 = LegalInfoType.EXPERIENCE;
        if (map.containsKey(legalInfoType3) && L(q(legalInfoType3), map.get(legalInfoType3), legalInfoType3)) {
            arrayList.add(legalInfoType3);
        }
        return arrayList;
    }

    private static boolean P(Map<LegalInfoType, String> map, LegalInfoType legalInfoType, String str) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        HMAccountWebAPI.getPageVersionsForRegister(legalInfoType, str, new c(map, legalInfoType, atomicBoolean));
        if (UserLegalInfoFallbackKt.isFallbackResValid()) {
            return true;
        }
        return atomicBoolean.get();
    }

    private static void Q(LegalInfoType legalInfoType, JSONObject jSONObject) {
        R(legalInfoType, jSONObject, true);
    }

    private static void R(LegalInfoType legalInfoType, JSONObject jSONObject, boolean z) {
        if (AgreementDiffManager.isAgreementChanged(legalInfoType, jSONObject)) {
            try {
                jSONObject.put("time", System.currentTimeMillis());
                if (z) {
                    jSONObject.put(KEY_HAD_SAVED, false);
                }
            } catch (JSONException e2) {
                HMLog.debug(TAG, new Function0() { // from class: o78
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Log.getStackTraceString(e2);
                    }
                });
            }
            int i2 = d.a[legalInfoType.ordinal()];
            if (i2 == 1) {
                HMAccountKeeper.INSTANCE.keepUpdateUserAgreement(jSONObject.toString());
            } else if (i2 == 2) {
                HMAccountKeeper.INSTANCE.keepUpdateUserPrivacy(jSONObject.toString());
            } else {
                if (i2 != 3) {
                    return;
                }
                HMAccountKeeper.INSTANCE.keepUpdateUserExperience(jSONObject.toString());
            }
        }
    }

    @Deprecated
    public static void assembleAboutExperienceText(Context context, TextView textView) {
        UserLegalInfoComponents.INSTANCE.assembleAboutExperienceText(context, textView);
    }

    @Deprecated
    public static void assembleAgreementAndPrivacyText(Context context, TextView textView, String str) {
        UserLegalInfoComponents.INSTANCE.assembleAgreementAndPrivacyText(context, textView, str);
    }

    @Deprecated
    public static void assembleExperienceText(Context context, TextView textView) {
        UserLegalInfoComponents.INSTANCE.assembleExperienceText(context, textView);
    }

    @Deprecated
    public static void assembleRegisterAgreementAndPrivacyText(Context context, TextView textView, String str, String str2) {
        UserLegalInfoComponents.INSTANCE.assembleRegisterAgreementAndPrivacyText(context, textView, str, str2);
    }

    @Deprecated
    public static void assembleRegisterExperienceText(Context context, TextView textView, String str) {
        UserLegalInfoComponents.INSTANCE.assembleRegisterExperienceText(context, textView, str);
    }

    @Deprecated
    public static void assembleUpdateExperienceText(Context context, TextView textView) {
        UserLegalInfoComponents.INSTANCE.assembleUpdateExperienceText(context, textView);
    }

    public static void checkAgreementUpdate(@Nullable final AppCompatActivity appCompatActivity, boolean z, @Nullable final OnLegalInfoEndListener onLegalInfoEndListener) {
        if (UserLegalInfoExt.isCheckAfterRegister()) {
            getServerLegalInfoInner(appCompatActivity, onLegalInfoEndListener);
        } else {
            HMAccountWebAPI.getUserLegalInfoVersionInner(z, new HMAccountWebAPI.LegalInfoVersionCallback() { // from class: h78
                @Override // com.huami.account.api.HMAccountWebAPI.LegalInfoVersionCallback
                public final void onFetchSuccessOrExist() {
                    UserLegalInfoManager.getServerLegalInfoInner(appCompatActivity, onLegalInfoEndListener);
                }
            });
        }
    }

    public static String getAgreementUrl(LegalInfoType legalInfoType, String str) {
        return TextUtils.isEmpty(str) ? s(legalInfoType, SelectAreaHelper.getArea().getValue()) : s(legalInfoType, str);
    }

    @Deprecated
    public static void getServerLegalInfo(@Nullable AppCompatActivity appCompatActivity, OnLegalInfoEndListener onLegalInfoEndListener) {
        getServerLegalInfoInner(appCompatActivity, onLegalInfoEndListener);
    }

    public static void getServerLegalInfoInner(@Nullable AppCompatActivity appCompatActivity, OnLegalInfoEndListener onLegalInfoEndListener) {
        List<LegalInfoType> listI = I();
        if (!listI.isEmpty()) {
            new e(appCompatActivity, listI, onLegalInfoEndListener).execute(new Void[0]);
            return;
        }
        saveVersionToServer();
        if (onLegalInfoEndListener != null) {
            onLegalInfoEndListener.onEnd();
        }
    }

    public static void getUserStatusForCCPA(OnCcpaStatusGetListener onCcpaStatusGetListener) {
        onCcpaStatusGetListener.onGet(AccountProperties.INSTANCE.getCcpaStatus().get());
    }

    public static boolean hasMinorAgeConfirmed() {
        if (!HMLoginManager.isInMainland()) {
            return true;
        }
        Boolean bool = AccountProperties.INSTANCE.getMinorConfirmedAge().get();
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static void makeMinorAgeConfirmed() {
        if (HMLoginManager.isInMainland()) {
            AccountProperties.INSTANCE.getMinorConfirmedAge().set(Boolean.TRUE);
            UserPropertyManager.INSTANCE.schedulePushAll();
        }
    }

    private static boolean p(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("items");
            JSONArray jSONArray2 = jSONObject2.getJSONArray("items");
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i2);
                map.put(jSONObject3.getString(KEY_LANGUAGE), Long.valueOf(jSONObject3.getLong("version")));
            }
            for (int i3 = 0; i3 < jSONArray2.length(); i3++) {
                JSONObject jSONObject4 = jSONArray2.getJSONObject(i3);
                map2.put(jSONObject4.getString(KEY_LANGUAGE), Long.valueOf(jSONObject4.getLong("version")));
            }
            Set<String> setKeySet = map2.keySet();
            String value = SelectAreaHelper.getAreaBySave().getValue();
            if (value != null && map2.containsKey(value)) {
                if (!map.containsKey(value)) {
                    return true;
                }
                Long l2 = (Long) map.get(value);
                Long l3 = (Long) map2.get(value);
                if (l2 != null && l3 != null) {
                    return l3.longValue() > l2.longValue();
                }
            }
            for (String str : setKeySet) {
                if (!map.containsKey(str)) {
                    return true;
                }
                if (((Long) map2.get(str)).longValue() > ((Long) map.get(str)).longValue()) {
                    return true;
                }
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return false;
    }

    private static String q(LegalInfoType legalInfoType) {
        int i2 = d.a[legalInfoType.ordinal()];
        if (i2 == 1) {
            return HMAccountKeeper.INSTANCE.readUpdateUserAgreement();
        }
        if (i2 == 2) {
            return HMAccountKeeper.INSTANCE.readUpdateUserPrivacy();
        }
        if (i2 != 3) {
            return null;
        }
        return HMAccountKeeper.INSTANCE.readUpdateUserExperience();
    }

    private static List<PropertyItem> r() {
        ArrayList arrayList = new ArrayList();
        HMAccountKeeper hMAccountKeeper = HMAccountKeeper.INSTANCE;
        v(arrayList, hMAccountKeeper.readUpdateUserAgreement(), UserLegalInfoExt.getLegalPropKey(LegalInfoType.AGREEMENT));
        v(arrayList, hMAccountKeeper.readUpdateUserPrivacy(), UserLegalInfoExt.getLegalPropKey(LegalInfoType.PRIVACY));
        if (hMAccountKeeper.readAgreeUserExperience()) {
            v(arrayList, hMAccountKeeper.readUpdateUserExperience(), UserLegalInfoExt.getLegalPropKey(LegalInfoType.EXPERIENCE));
        }
        return arrayList;
    }

    public static boolean requestAllForRegister(boolean z, String str) {
        HashMap map = new HashMap();
        if (!P(map, LegalInfoType.AGREEMENT, str) || !P(map, LegalInfoType.PRIVACY, str)) {
            return false;
        }
        if (z && !P(map, LegalInfoType.EXPERIENCE, str)) {
            return false;
        }
        for (LegalInfoType legalInfoType : map.keySet()) {
            M(q(legalInfoType), (String) map.get(legalInfoType), legalInfoType, true);
        }
        return true;
    }

    private static String s(LegalInfoType legalInfoType, String str) {
        String str2;
        long validUid = HMLoginManager.getValidUid();
        StringBuilder sb = new StringBuilder();
        sb.append(HMServerDef.getHost());
        sb.append(i);
        sb.append("?");
        sb.append("lang");
        sb.append(SearchCriteria.EQ);
        sb.append(str);
        sb.append(com.alipay.sdk.m.s.a.l);
        if (validUid > 0) {
            str2 = "userId=" + validUid + com.alipay.sdk.m.s.a.l;
        } else {
            str2 = "";
        }
        sb.append(str2);
        sb.append("channel");
        sb.append(SearchCriteria.EQ);
        sb.append(AccountExternalsKt.getCommonDelegate().getChannelName());
        sb.append(com.alipay.sdk.m.s.a.l);
        sb.append("redirectType");
        sb.append(SearchCriteria.EQ);
        sb.append(legalInfoType.getTypeName());
        sb.append(com.alipay.sdk.m.s.a.l);
        sb.append("appName");
        sb.append(SearchCriteria.EQ);
        sb.append(HMAppConfig.getPackageName());
        sb.append(com.alipay.sdk.m.s.a.l);
        sb.append("appplatform");
        sb.append(SearchCriteria.EQ);
        sb.append(HMAppConfig.getDeviceType());
        sb.append(com.alipay.sdk.m.s.a.l);
        sb.append("cv");
        sb.append(SearchCriteria.EQ);
        sb.append(HMAppConfig.getVersionCode());
        sb.append("_");
        sb.append(HMAppConfig.getVersionName());
        sb.append(com.alipay.sdk.m.s.a.l);
        sb.append("t");
        sb.append(SearchCriteria.EQ);
        sb.append(System.currentTimeMillis());
        String string = sb.toString();
        HMLog.v(TAG, "getUrl:" + string, new Object[0]);
        return string;
    }

    public static void save(LegalInfoType legalInfoType, Map<LegalInfoType, String> map) {
        try {
            Q(legalInfoType, new JSONObject(map.get(legalInfoType)));
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public static void saveVersionToServer() {
        saveVersionToServer(new SaveVersionCallback() { // from class: f78
            @Override // com.huami.account.UserLegalInfoManager.SaveVersionCallback
            public final void onSaveResult(boolean z) {
                UserLegalInfoManager.E(z);
            }
        });
    }

    public static void setUserStatusCCPA(@NonNull Boolean bool) {
        UserProperty<Boolean> ccpaStatus = AccountProperties.INSTANCE.getCcpaStatus();
        ccpaStatus.set(bool);
        ccpaStatus.push().get(new Function1() { // from class: g78
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UserLegalInfoManager.F((PushResult) obj);
            }
        });
    }

    @Deprecated
    public static void showAgreementDialogForReg(AppCompatActivity appCompatActivity, Area area, AgreementDialogCallback agreementDialogCallback) {
        UserLegalInfoComponents.INSTANCE.showAgreementDialogForReg(appCompatActivity, area, agreementDialogCallback);
    }

    @Deprecated
    public static void showDialog(AppCompatActivity appCompatActivity, UserAgreementFragment.OnDialogListener onDialogListener) {
        UserLegalInfoComponents.INSTANCE.showDialog(appCompatActivity, onDialogListener);
    }

    public static void showPage(Context context, NavigateAgreementType navigateAgreementType) {
        showPage(context, navigateAgreementType, null);
    }

    @Deprecated
    public static UserAgreementFooterFragment showUserAgreementFooterFragment(AppCompatActivity appCompatActivity, int i2, boolean z, String str) {
        return UserLegalInfoComponents.INSTANCE.showUserAgreementFooterFragment(appCompatActivity, i2, z, str);
    }

    @Deprecated
    public static void showUserAgreementForRegisterDialog(AppCompatActivity appCompatActivity, boolean z, String str, UserAgreementForRegisterFragment.OnDialogListener onDialogListener) {
        UserLegalInfoComponents.INSTANCE.showUserAgreementForRegisterDialog(appCompatActivity, z, str, onDialogListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void t() {
        try {
            HMAccountKeeper hMAccountKeeper = HMAccountKeeper.INSTANCE;
            JSONObject jSONObject = new JSONObject(hMAccountKeeper.readUpdateUserAgreement());
            jSONObject.put(KEY_HAD_SAVED, true);
            hMAccountKeeper.keepUpdateUserAgreement(jSONObject.toString());
        } catch (Exception e2) {
            HMLog.debug(TAG, new Function0() { // from class: m78
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Log.getStackTraceString(e2);
                }
            });
        }
        try {
            HMAccountKeeper hMAccountKeeper2 = HMAccountKeeper.INSTANCE;
            JSONObject jSONObject2 = new JSONObject(hMAccountKeeper2.readUpdateUserPrivacy());
            jSONObject2.put(KEY_HAD_SAVED, true);
            hMAccountKeeper2.keepUpdateUserPrivacy(jSONObject2.toString());
        } catch (Exception e3) {
            HMLog.debug(TAG, new Function0() { // from class: n78
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Log.getStackTraceString(e3);
                }
            });
        }
        try {
            HMAccountKeeper hMAccountKeeper3 = HMAccountKeeper.INSTANCE;
            JSONObject jSONObject3 = new JSONObject(hMAccountKeeper3.readUpdateUserExperience());
            jSONObject3.put(KEY_HAD_SAVED, true);
            hMAccountKeeper3.keepUpdateUserExperience(jSONObject3.toString());
        } catch (Exception e4) {
            HMLog.debug(TAG, new Function0() { // from class: j78
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Log.getStackTraceString(e4);
                }
            });
        }
    }

    private static boolean u(long j2, long j3) {
        return (j2 + ((long) TimeZone.getDefault().getOffset(j2))) / 86400000 == (j3 + ((long) TimeZone.getDefault().getOffset(j3))) / 86400000;
    }

    private static void v(List<PropertyItem> list, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(UserLegalServiceKt.filterUselessProperties(str));
            if (!jSONObject.optBoolean(KEY_HAD_SAVED, false)) {
                jSONObject.remove(KEY_HAD_SAVED);
                jSONObject.remove("time");
                list.add(new PropertyItem(str2, jSONObject.toString()));
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    @Deprecated
    public static void getServerLegalInfo(OnLegalInfoEndListener onLegalInfoEndListener) {
        getServerLegalInfoInner(onLegalInfoEndListener);
    }

    public static void saveVersionToServer(SaveVersionCallback saveVersionCallback) {
        List<PropertyItem> listR = r();
        if (listR.size() == 0) {
            return;
        }
        HMUserPropertiesAPI.postProperty(listR, false, (IHMBasicHttpResponseHandler) new b(saveVersionCallback));
    }

    public static void showPage(Context context, NavigateAgreementType navigateAgreementType, String str) {
        if (!NetUtil.isNetworkConnected(context)) {
            IconToast.showError(context, context.getString(R.string.account_ui_no_network_connection));
            return;
        }
        int i2 = d.b[navigateAgreementType.ordinal()];
        if (i2 == 1) {
            UserLegalInfoFallbackKt.goAgreementPageWithFallback(context, LegalInfoType.AGREEMENT, str);
            Analytics.event(AccountExternalsKt.getAppContext(), "Login_ViewPrivacy", "SoftwareLicense");
            return;
        }
        if (i2 == 2) {
            UserLegalInfoFallbackKt.goAgreementPageWithFallback(context, LegalInfoType.EXPERIENCE, str);
            Analytics.event(AccountExternalsKt.getAppContext(), "Login_ViewPrivacy", "User");
        } else if (i2 == 3) {
            UserLegalInfoFallbackKt.goAgreementPageWithFallback(context, LegalInfoType.PRIVACY, str);
            Analytics.event(AccountExternalsKt.getAppContext(), "Login_ViewPrivacy", "PrivacyPolicy");
        } else {
            if (i2 != 4) {
                return;
            }
            AccountExternalsKt.getAccountDelegate().goAccountMifit(context);
        }
    }

    public static void getServerLegalInfoInner(OnLegalInfoEndListener onLegalInfoEndListener) {
        getServerLegalInfoInner(null, onLegalInfoEndListener);
    }
}
