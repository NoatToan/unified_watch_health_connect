package com.xiaomi.fitness.about.version;

import android.os.Bundle;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import com.xiaomi.wearable.yrn.export.YRNDebugHelperExtKt;
import com.xiaomi.wearable.yrn.export.YRNHelper;
import com.xiaomi.wearable.yrn.export.YRNHelperExtKt;
import com.xiaomi.wearable.yrn.export.data.YRNBundleData;
import com.xiaomi.wearable.yrn.export.debug.YRNDebugHelper;
import defpackage.uqi;
import defpackage.yti;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\b\u0010\u0012\u001a\u00020\u000fH\u0002J\b\u0010\u0013\u001a\u00020\u000fH\u0002J\u001c\u0010\u0014\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00160\u0015H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/about/version/YRNPluginVersionActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "<init>", "()V", "rvVersions", "Landroidx/recyclerview/widget/RecyclerView;", "versionAdapter", "Lcom/xiaomi/fitness/about/version/VersionAdapter;", "isDarkMode", "", "layoutId", "", "getLayoutId", "()I", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "initViews", "loadVersionInfo", "getAllRnVersion", "", "", "", "", "about_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nYRNPluginVersionActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 YRNPluginVersionActivity.kt\ncom/xiaomi/fitness/about/version/YRNPluginVersionActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,180:1\n1#2:181\n216#3,2:182\n*S KotlinDebug\n*F\n+ 1 YRNPluginVersionActivity.kt\ncom/xiaomi/fitness/about/version/YRNPluginVersionActivity\n*L\n87#1:182,2\n*E\n"})
public final class YRNPluginVersionActivity extends BaseActivity {
    private boolean isDarkMode;
    private RecyclerView rvVersions;

    @NotNull
    private final VersionAdapter versionAdapter = new VersionAdapter();

    private final List<Map<String, Object>> getAllRnVersion() {
        ArrayList arrayList = new ArrayList();
        Map<String, YRNBundleData> loadedBundleInfoMap = YRNDebugHelperExtKt.getInstance(YRNDebugHelper.INSTANCE).getLoadedBundleInfoMap(YRNHelperExtKt.getInstance(YRNHelper.INSTANCE).appName());
        if (loadedBundleInfoMap != null) {
            Iterator<Map.Entry<String, YRNBundleData>> it = loadedBundleInfoMap.entrySet().iterator();
            while (it.hasNext()) {
                YRNBundleData value = it.next().getValue();
                try {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    String version = value.getVersion();
                    String str = "";
                    if (version == null) {
                        version = "";
                    }
                    linkedHashMap.put("version", version);
                    String module = value.getModule();
                    if (module == null) {
                        module = "";
                    }
                    linkedHashMap.put(RnReportConst.ApiReport.PARAM_MODULE, module);
                    String maketime = value.getMaketime();
                    if (maketime == null) {
                        maketime = "";
                    }
                    linkedHashMap.put("maketime", maketime);
                    String md5 = value.getMd5();
                    if (md5 == null) {
                        md5 = "";
                    }
                    linkedHashMap.put("md5", md5);
                    String bundlePath = value.getBundlePath();
                    if (bundlePath != null) {
                        str = bundlePath;
                    }
                    linkedHashMap.put("bundlePath", str);
                    Integer maxNativeApiLevel = value.getMaxNativeApiLevel();
                    linkedHashMap.put("maxNativeApiLevel", Integer.valueOf(maxNativeApiLevel != null ? maxNativeApiLevel.intValue() : 0));
                    Integer maxCommonJSApiLevel = value.getMaxCommonJSApiLevel();
                    linkedHashMap.put("maxCommonJSApiLevel", Integer.valueOf(maxCommonJSApiLevel != null ? maxCommonJSApiLevel.intValue() : 0));
                    linkedHashMap.put("moduleIdMapVersion", value.getModuleIdMapVersion());
                    Integer updateStrategy = value.getUpdateStrategy();
                    linkedHashMap.put("updateStrategy", Integer.valueOf(updateStrategy != null ? updateStrategy.intValue() : 1));
                    Boolean boolIsResidentMemory = value.isResidentMemory();
                    linkedHashMap.put("residentMemory", Boolean.valueOf(boolIsResidentMemory != null ? boolIsResidentMemory.booleanValue() : false));
                    arrayList.add(linkedHashMap);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return arrayList;
    }

    private final void initViews() {
        RecyclerView recyclerView = (RecyclerView) findViewById(uqi.E);
        this.rvVersions = recyclerView;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rvVersions");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        VersionAdapter versionAdapter = this.versionAdapter;
        versionAdapter.setDarkMode(this.isDarkMode);
        recyclerView.setAdapter(versionAdapter);
        recyclerView.setBackgroundColor(this.isDarkMode ? -16777216 : -657931);
        TextView textView = (TextView) findViewById(uqi.U);
        textView.setBackgroundColor(this.isDarkMode ? -13421773 : -1);
        textView.setTextColor(this.isDarkMode ? -1 : -16777216);
    }

    private final void loadVersionInfo() {
        try {
            List<Map<String, Object>> allRnVersion = getAllRnVersion();
            ArrayList arrayList = new ArrayList();
            for (Map<String, Object> map : allRnVersion) {
                try {
                    Object obj = map.get("version");
                    String str = obj instanceof String ? (String) obj : null;
                    String str2 = str == null ? "" : str;
                    Object obj2 = map.get(RnReportConst.ApiReport.PARAM_MODULE);
                    String str3 = obj2 instanceof String ? (String) obj2 : null;
                    String str4 = str3 == null ? "" : str3;
                    Object obj3 = map.get("maketime");
                    String str5 = obj3 instanceof String ? (String) obj3 : null;
                    String str6 = str5 == null ? "" : str5;
                    Object obj4 = map.get("md5");
                    String str7 = obj4 instanceof String ? (String) obj4 : null;
                    String str8 = str7 == null ? "" : str7;
                    Object obj5 = map.get("bundlePath");
                    String str9 = obj5 instanceof String ? (String) obj5 : null;
                    String str10 = str9 == null ? "" : str9;
                    Object obj6 = map.get("maxNativeApiLevel");
                    Integer num = obj6 instanceof Integer ? (Integer) obj6 : null;
                    int iIntValue = num != null ? num.intValue() : 0;
                    Object obj7 = map.get("maxCommonJSApiLevel");
                    Integer num2 = obj7 instanceof Integer ? (Integer) obj7 : null;
                    int iIntValue2 = num2 != null ? num2.intValue() : 0;
                    Object obj8 = map.get("moduleIdMapVersion");
                    String str11 = obj8 instanceof String ? (String) obj8 : null;
                    Object obj9 = map.get("updateStrategy");
                    Integer num3 = obj9 instanceof Integer ? (Integer) obj9 : null;
                    int iIntValue3 = num3 != null ? num3.intValue() : 1;
                    Object obj10 = map.get("residentMemory");
                    Boolean bool = obj10 instanceof Boolean ? (Boolean) obj10 : null;
                    arrayList.add(new BundleInfo(str2, str4, str6, str8, str10, iIntValue, iIntValue2, str11, iIntValue3, bool != null ? bool.booleanValue() : false));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            try {
                this.versionAdapter.submitList(arrayList);
            } catch (Exception e2) {
                e = e2;
                e.printStackTrace();
            }
        } catch (Exception e3) {
            e = e3;
            e.printStackTrace();
        }
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return yti.h;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(yti.h);
        this.isDarkMode = (getResources().getConfiguration().uiMode & 48) == 32;
        initViews();
        loadVersionInfo();
    }
}
