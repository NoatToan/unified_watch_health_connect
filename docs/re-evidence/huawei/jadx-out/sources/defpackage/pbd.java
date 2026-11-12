package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import com.huawei.health.h5pro.utils.GeneralUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.R;
import com.huawei.pluginachievement.manager.model.MedalConfigInfo;
import com.huawei.pluginachievement.manager.model.MedalInfo;
import com.huawei.pluginachievement.manager.model.MedalInfoDesc;
import com.huawei.pluginachievement.manager.model.NewMedalTabDataBean;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import com.huawei.pluginachievement.manager.model.PersonalData;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.columnsystem.HealthColumnSystem;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class pbd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Drawable f45110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Map<Integer, String> f45111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Context f45112c;
    protected Map<String, ArrayList<MedalInfoDesc>> d;
    protected Drawable e;
    private Pair<Integer, Integer> f = BaseActivity.getSafeRegionWidth();
    private boolean h;
    private Map<String, MedalInfo> i;

    public pbd(Context context, Map<String, ArrayList<MedalInfoDesc>> map, Map<Integer, String> map2, Map<String, MedalInfo> map3) {
        if (context == null) {
            this.f45112c = BaseApplication.getContext();
        } else {
            this.f45112c = context;
        }
        this.f45111b = map2;
        this.d = map;
        this.i = map3;
        b();
    }

    private void b() {
        this.f45110a = ContextCompat.getDrawable(this.f45112c, R.drawable.medal_black_background_up);
        this.e = ContextCompat.getDrawable(this.f45112c, R.drawable.medal_black_background);
        this.h = Build.VERSION.SDK_INT == 26 || Build.VERSION.SDK_INT == 27;
    }

    protected View e(ArrayList<MedalInfoDesc> arrayList, final int i) {
        View viewInflate = LayoutInflater.from(this.f45112c).inflate(R.layout.medal_item, (ViewGroup) null);
        HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.gridview_medal_tv);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.gridview_medal_iv);
        final HealthTextView healthTextView2 = (HealthTextView) viewInflate.findViewById(R.id.gridview_medal_jincheng);
        HealthTextView healthTextView3 = (HealthTextView) viewInflate.findViewById(R.id.gridview_medal_num);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.medal_item_layout);
        if (njy.e(arrayList, i)) {
            return viewInflate;
        }
        final MedalInfoDesc medalInfoDesc = arrayList.get(i);
        d(medalInfoDesc, healthTextView, healthTextView2, linearLayout, imageView);
        if (medalInfoDesc.acquireGainCount() > 1 && pax.n(medalInfoDesc.acquireMedalType())) {
            healthTextView3.setText(b(medalInfoDesc.acquireGainCount()));
            healthTextView3.setVisibility(0);
        } else {
            healthTextView3.setVisibility(4);
        }
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: pbd.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (pax.b()) {
                    LogUtil.j("PLGACHIEVE_MedalExpandableBase", "showAchieveMedalDetail isMedalFastClick!");
                } else {
                    view.getLocationOnScreen(new int[2]);
                    pbd.this.c(healthTextView2, medalInfoDesc, i);
                }
            }
        });
        linearLayout.setLayoutParams(a());
        return viewInflate;
    }

    private String b(int i) {
        if (LanguageUtil.l(this.f45112c)) {
            return UnitUtil.e(i, 1, 0) + this.f45112c.getString(R.string.IDS_awake_times);
        }
        return UnitUtil.e(i, 1, 0);
    }

    private LinearLayout.LayoutParams a() {
        int iC = 0;
        if (qrs.af(this.f45112c)) {
            HealthColumnSystem healthColumnSystem = new HealthColumnSystem(this.f45112c, 0);
            iC = (int) (healthColumnSystem.c() + healthColumnSystem.f() + healthColumnSystem.b());
        }
        return new LinearLayout.LayoutParams(((pbn.g(this.f45112c) - ((this.f45112c.getResources().getDimensionPixelSize(R.dimen.cardMarginStart) + ((Integer) this.f.first).intValue()) * 2)) - (iC * 2)) / 3, -2);
    }

    private void d(MedalInfoDesc medalInfoDesc, HealthTextView healthTextView, HealthTextView healthTextView2, LinearLayout linearLayout, ImageView imageView) {
        String strE;
        boolean z = true;
        if (medalInfoDesc.acquireGainCount() >= 1) {
            strE = pax.e(medalInfoDesc.acquireMedalId(), ParsedFieldTag.LIGHT_LIST_STYLE);
        } else {
            strE = pax.e(medalInfoDesc.acquireMedalId(), ParsedFieldTag.GRAY_LIST_STYLE);
            z = false;
        }
        String strE2 = pax.e(medalInfoDesc.acquireMedalId());
        String str = pax.d(strE2) + File.separator + strE + ".png";
        healthTextView.setText(medalInfoDesc.acquireText());
        if (medalInfoDesc.acquireIsNewConfig() > 0) {
            healthTextView2.setVisibility(0);
        } else {
            healthTextView2.setVisibility(4);
        }
        healthTextView2.setText(this.f45112c.getResources().getString(R.string.IDS_plugin_achievement_tab_new));
        Bitmap bitmapD = d(str, strE2);
        if (bitmapD != null) {
            LogUtil.a("PLGACHIEVE_MedalExpandableBase", "bitmap not null");
            linearLayout.setVisibility(0);
            if (this.h && !z) {
                imageView.setImageDrawable(qqf.c(qqf.d(bitmapD), this.f45112c.getResources().getColor(R.color.color_ccffffff)));
                return;
            } else {
                imageView.setImageBitmap(bitmapD);
                return;
            }
        }
        d(medalInfoDesc, z, linearLayout, imageView);
    }

    public Bitmap d(String str, String str2) {
        Bitmap bitmapDecodeFile = null;
        if (!GeneralUtil.isSafePath(str)) {
            LogUtil.j("PLGACHIEVE_MedalExpandableBase", "loadImage: untrusted -> " + str);
            return null;
        }
        if (new File(str).exists()) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inPreferredConfig = Bitmap.Config.RGB_565;
            try {
                bitmapDecodeFile = BitmapFactory.decodeFile(str, options);
            } catch (OutOfMemoryError unused) {
                LogUtil.e("PLGACHIEVE_MedalExpandableBase", "loadImage:OutOfMemoryError");
            }
        }
        if (bitmapDecodeFile == null) {
            LogUtil.j("PLGACHIEVE_MedalExpandableBase", "showMedalBitmap loadImage is null! medal ", str2);
        }
        return bitmapDecodeFile;
    }

    private void d(MedalInfoDesc medalInfoDesc, boolean z, LinearLayout linearLayout, ImageView imageView) {
        Bitmap bitmapA = pax.a(medalInfoDesc.acquireMedalId(), z, false);
        if (bitmapA != null) {
            LogUtil.a("PLGACHIEVE_MedalExpandableBase", "bmp not null");
            linearLayout.setVisibility(0);
            imageView.setImageBitmap(bitmapA);
            return;
        }
        String strAcquireMedalTypeLevel = medalInfoDesc.acquireMedalTypeLevel();
        LogUtil.a("PLGACHIEVE_MedalExpandableBase", "typeLevel is ", strAcquireMedalTypeLevel);
        MedalInfo medalInfo = this.i.get(strAcquireMedalTypeLevel);
        if (medalInfo == null) {
            LogUtil.a("PLGACHIEVE_MedalExpandableBase", "medalInfo medalMessage is ", medalInfoDesc.acquireMedalId());
            MedalConfigInfo medalConfigInfo = new MedalConfigInfo();
            medalConfigInfo.saveMedalID(medalInfoDesc.acquireMedalId());
            medalConfigInfo.saveIsNewConfig(0);
            medalConfigInfo.saveEventStatus(1);
            otl.b(this.f45112c).a((osf) medalConfigInfo);
            imageView.setVisibility(4);
            return;
        }
        if (medalInfoDesc.acquireGainCount() >= 1) {
            LogUtil.a("PLGACHIEVE_MedalExpandableBase", "medalInfo getEnableResId is ", Integer.valueOf(medalInfo.getEnableResId()));
            imageView.setImageResource(medalInfo.getEnableResId());
        } else {
            LogUtil.a("PLGACHIEVE_MedalExpandableBase", "medalInfo getDisableResId is ", Integer.valueOf(medalInfo.getDisableResId()));
            imageView.setImageResource(medalInfo.getDisableResId());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(HealthTextView healthTextView, MedalInfoDesc medalInfoDesc, int i) {
        Intent intent = new Intent();
        intent.setClassName(this.f45112c, PersonalData.CLASS_NAME_PERSONAL_MEDAL_DETAIL);
        String strAcquireMedalId = medalInfoDesc.acquireMedalId();
        MedalConfigInfo medalConfigInfo = new MedalConfigInfo();
        medalConfigInfo.saveMedalID(strAcquireMedalId);
        medalConfigInfo.saveIsNewConfig(0);
        intent.putExtra("medal_res_id", String.valueOf(strAcquireMedalId));
        if (medalInfoDesc.acquireGainCount() > 0) {
            intent.putExtra("medal_des_id", String.valueOf(medalInfoDesc.acquireLightDescription()));
        } else {
            intent.putExtra("medal_des_id", String.valueOf(medalInfoDesc.acquireGrayDescription()));
        }
        intent.putExtra("medal_content_id", String.valueOf(medalInfoDesc.acquireText()));
        intent.putExtra("medal_type_level", String.valueOf(medalInfoDesc.acquireMedalTypeLevel()));
        intent.putExtra("medal_gain_time", String.valueOf(medalInfoDesc.acquireGainTime()));
        intent.putExtra("medal_gain_count", medalInfoDesc.acquireGainCount());
        intent.putExtra("click_x", pbn.g(this.f45112c) / 2);
        intent.putExtra("click_y", pbn.j(this.f45112c) / 2);
        intent.putExtra("medal_type", medalInfoDesc.acquireMedalType());
        if (medalInfoDesc.acquireGainCount() >= 1) {
            intent.putExtra("medal_obtain_id", "true");
        } else {
            intent.putExtra("medal_obtain_id", "false");
        }
        intent.putExtra("promotion_name", String.valueOf(medalInfoDesc.acquirePromotionName()));
        intent.putExtra("promotion_url", String.valueOf(medalInfoDesc.acquirePromotionURL()));
        this.f45112c.startActivity(intent);
        a(medalInfoDesc, this.f45111b.get(Integer.valueOf(i)));
        if (medalInfoDesc.acquireIsNewConfig() > 0) {
            healthTextView.setText("");
            healthTextView.setVisibility(4);
            medalInfoDesc.saveIsNewConfig(0);
            otl.b(this.f45112c).a((osf) medalConfigInfo);
            b(medalInfoDesc.acquireMedalId());
        }
    }

    private void b(String str) {
        Map<String, ArrayList<MedalInfoDesc>> secondTabRelationship;
        LogUtil.a("PLGACHIEVE_MedalExpandableBase", "changeOneData enter");
        NewMedalTabDataBean newMedalTabDataBeanA = ozd.a();
        if (TextUtils.isEmpty(str) || newMedalTabDataBeanA == null || (secondTabRelationship = newMedalTabDataBeanA.getSecondTabRelationship()) == null) {
            return;
        }
        LogUtil.a("PLGACHIEVE_MedalExpandableBase", "changeOneData medalId =", str);
        for (Map.Entry<String, ArrayList<MedalInfoDesc>> entry : secondTabRelationship.entrySet()) {
            String key = entry.getKey();
            ArrayList<MedalInfoDesc> value = entry.getValue();
            for (int i = 0; i < value.size(); i++) {
                MedalInfoDesc medalInfoDesc = value.get(i);
                if (str.equals(medalInfoDesc.acquireMedalId()) && medalInfoDesc.acquireIsNewConfig() > 0) {
                    LogUtil.a("PLGACHIEVE_MedalExpandableBase", "changeOneData secondTab =", key, " medalId=", str);
                    medalInfoDesc.saveIsNewConfig(0);
                    value.set(i, medalInfoDesc);
                    secondTabRelationship.put(key, value);
                    break;
                }
            }
        }
        newMedalTabDataBeanA.setSecondTabRelationship(secondTabRelationship);
        ozd.e(newMedalTabDataBeanA);
    }

    protected View d() {
        View viewInflate = LayoutInflater.from(this.f45112c).inflate(R.layout.medal_item, (ViewGroup) null);
        viewInflate.setLayoutParams(new GridLayout.LayoutParams(GridLayout.spec(Integer.MIN_VALUE, 1.0f), GridLayout.spec(Integer.MIN_VALUE, 1.0f)));
        viewInflate.setVisibility(4);
        return viewInflate;
    }

    private void a(MedalInfoDesc medalInfoDesc, String str) {
        HashMap map = new HashMap(8);
        map.put("cilck", 1);
        map.put("name", medalInfoDesc.acquireText());
        map.put("type", medalInfoDesc.acquireMedalType());
        map.put("className", str);
        map.put("label", Integer.valueOf(medalInfoDesc.acquireMedalLabel()));
        map.put("from", "1");
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.SUCCESSES_REPORT_1100010.value(), map, 0);
    }

    static class e {
        GridLayout e;

        e() {
        }
    }
}
