package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.huawei.health.device.wifi.entity.utils.JsonParser;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.privacy.template.model.bean.PageModelArgs;
import com.huawei.ui.main.stories.privacy.template.model.bean.PrivacyDataModel;
import com.huawei.ui.main.stories.privacy.template.view.showdata.PrivacyDataModelActivity;
import com.huawei.ui.main.stories.privacy.template.view.showdata.PrivacyDetailActivity;
import health.compact.a.SharedPreferenceManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class wkb {
    public static void d(final Context context, final CustomTitleBar customTitleBar, final int i) {
        customTitleBar.setRightButtonDrawable(BaseApplication.getContext().getResources().getDrawable(R.drawable.ic_more_normal_black), qre.f(R.string.accessibility_more_item));
        customTitleBar.setRightButtonClickable(true);
        customTitleBar.setRightButtonVisibility(0);
        customTitleBar.setRightButtonOnClickListener(new View.OnClickListener() { // from class: wjy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wkb.c(context, customTitleBar, i, view);
            }
        });
    }

    static /* synthetic */ void c(final Context context, CustomTitleBar customTitleBar, final int i, View view) {
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.common_toolbar_popupwindow, (ViewGroup) null);
        final qop qopVar = new qop(context, viewInflate);
        qopVar.e(customTitleBar, 17);
        viewInflate.findViewById(R.id.popup_declare_ll).setOnClickListener(new View.OnClickListener() { // from class: wkb.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                qopVar.e();
                wkb.b(i, context);
            }
        });
    }

    public static void b(int i, Context context) {
        PageModelArgs pageModelArgs = new PageModelArgs(i, "PrivacyDataConstructor", 3, 1);
        pageModelArgs.setClassType(0);
        PrivacyDataModelActivity.b(context, pageModelArgs);
    }

    public static void e(final Context context, final CustomTitleBar customTitleBar, final int i, final PrivacyDataModel privacyDataModel) {
        customTitleBar.setRightButtonDrawable(BaseApplication.getContext().getResources().getDrawable(R.drawable.ic_more_normal_black), qre.f(R.string.accessibility_more_item));
        customTitleBar.setRightButtonClickable(true);
        customTitleBar.setRightButtonVisibility(0);
        customTitleBar.setRightButtonOnClickListener(new View.OnClickListener() { // from class: wjz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wkb.d(context, customTitleBar, i, privacyDataModel, view);
            }
        });
    }

    static /* synthetic */ void d(final Context context, CustomTitleBar customTitleBar, final int i, final PrivacyDataModel privacyDataModel, View view) {
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.common_toolbar_popupwindow, (ViewGroup) null);
        final qop qopVar = new qop(context, viewInflate);
        qopVar.e(customTitleBar, 17);
        ((HealthTextView) viewInflate.findViewById(R.id.all_data_declare_text)).setText(R.string.IDS_privacy_data_detail);
        viewInflate.findViewById(R.id.popup_declare_ll).setOnClickListener(new View.OnClickListener() { // from class: wkb.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                qopVar.e();
                PageModelArgs pageModelArgs = new PageModelArgs();
                pageModelArgs.setDataSource(3);
                pageModelArgs.setPageType(i);
                Intent intent = new Intent();
                intent.putExtra("extra_privacy_data_model", privacyDataModel);
                intent.putExtra("extra_page_model_args", pageModelArgs);
                intent.setClass(context, PrivacyDetailActivity.class);
                context.startActivity(intent);
            }
        });
    }

    public static void b() {
        c(dmp.d().f(), e());
    }

    private static void c(ArrayList<ContentValues> arrayList, boolean z) {
        HiUserPreference userPreference = HiHealthManager.d(BaseApplication.getContext()).getUserPreference("privacy_data_source_device_name_4F32F873AE094ACAA75E35D53690B72C");
        Map map = new HashMap(16);
        if (userPreference == null) {
            userPreference = new HiUserPreference();
        } else {
            map = JsonParser.a(userPreference.getValue());
            if (z) {
                map.clear();
            }
            userPreference.setSyncStatus(0);
        }
        e(map, arrayList);
        userPreference.setKey("privacy_data_source_device_name_4F32F873AE094ACAA75E35D53690B72C");
        userPreference.setValue(JsonParser.a((Map<?, ?>) map).toString());
        LogUtil.a("PrivacyDataUtil", "privacy hiUserPreference set ", Boolean.valueOf(HiHealthManager.d(BaseApplication.getContext()).setUserPreference(userPreference)));
        a();
    }

    private static void e(Map<String, Object> map, ArrayList<ContentValues> arrayList) {
        elh elhVarD;
        for (ContentValues contentValues : arrayList) {
            String asString = contentValues.getAsString("productId");
            String asString2 = contentValues.getAsString("uniqueId");
            if (asString2 != null && asString != null && (elhVarD = ResourceManager.c().d(asString)) != null) {
                String asString3 = contentValues.getAsString("sn");
                String strA = elo.a(asString, elhVarD.l().d());
                if (!TextUtils.isEmpty(asString3)) {
                    String str = strA + Constants.LINK + a(asString3);
                    map.put(asString2, str);
                    map.put(asString3, str);
                } else {
                    map.put(asString2, strA + Constants.LINK + a(asString2));
                }
            }
        }
    }

    private static String a(String str) {
        String strReplaceAll = str.replaceAll(":", "");
        return strReplaceAll.length() < 3 ? strReplaceAll : strReplaceAll.substring(strReplaceAll.length() - 3);
    }

    private static void a() {
        HiUserPreference userPreference = HiHealthManager.d(BaseApplication.getContext()).getUserPreference("privacy_data_source_language_write_key_FEF629A75A8B472D886BABB73BE88952");
        if (userPreference == null) {
            userPreference = new HiUserPreference();
        } else {
            userPreference.setSyncStatus(0);
        }
        HashMap map = new HashMap(16);
        map.put("language", BaseApplication.getContext().getResources().getConfiguration().locale.toString());
        userPreference.setKey("privacy_data_source_language_write_key_FEF629A75A8B472D886BABB73BE88952");
        userPreference.setValue(JsonParser.a(map).toString());
        LogUtil.a("PrivacyDataUtil", "updata wirte and language chage flags： ", Boolean.valueOf(HiHealthManager.d(BaseApplication.getContext()).setUserPreference(userPreference)));
    }

    private static boolean e() {
        String value;
        HiUserPreference userPreference = HiHealthManager.d(BaseApplication.getContext()).getUserPreference("privacy_data_source_language_write_key_FEF629A75A8B472D886BABB73BE88952");
        if (userPreference == null || (value = userPreference.getValue()) == null) {
            return false;
        }
        Map<String, Object> mapA = JsonParser.a(value);
        String string = BaseApplication.getContext().getResources().getConfiguration().locale.toString();
        String strValueOf = String.valueOf(mapA.get("language"));
        if (com.huawei.operation.utils.Constants.NULL.equals(strValueOf)) {
            return false;
        }
        return !strValueOf.equals(string);
    }

    public static boolean d() {
        return SharedPreferenceManager.b(Integer.toString(PrebakedEffectId.RT_FLY), "is_base_service_model", false);
    }
}
