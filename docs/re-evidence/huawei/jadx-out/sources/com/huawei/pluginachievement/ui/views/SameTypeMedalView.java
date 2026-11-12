package com.huawei.pluginachievement.ui.views;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.R;
import com.huawei.pluginachievement.manager.model.MedalConfigInfo;
import com.huawei.pluginachievement.manager.model.MedalInfoDesc;
import com.huawei.pluginachievement.manager.model.MedalLocation;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import com.huawei.pluginachievement.ui.AchieveMedalDetailActivity;
import defpackage.iov;
import defpackage.jhl;
import defpackage.lsy;
import defpackage.osf;
import defpackage.osv;
import defpackage.otl;
import defpackage.pax;
import defpackage.pbn;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes41.dex */
public class SameTypeMedalView extends LinearLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TextView f22308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ImageView f22309c;
    private final View d;
    private final LinearLayout e;

    public SameTypeMedalView(Context context) {
        this(context, null);
    }

    public SameTypeMedalView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SameTypeMedalView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View viewInflate = View.inflate(context, R.layout.view_same_type_medal, null);
        this.d = viewInflate.findViewById(R.id.rl_single_root);
        this.f22309c = (ImageView) viewInflate.findViewById(R.id.iv_medal_image);
        this.f22308b = (TextView) viewInflate.findViewById(R.id.htv_medal_name);
        this.e = (LinearLayout) viewInflate.findViewById(R.id.ll_multi_root);
        addView(viewInflate);
        setVisibility(8);
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void e(final String str, final String str2, final boolean z) {
        if (HandlerExecutor.c()) {
            lsy.a(new Runnable() { // from class: pbi
                @Override // java.lang.Runnable
                public final void run() {
                    this.f45126c.e(str, str2, z);
                }
            });
            return;
        }
        final List<MedalInfoDesc> listC = c(str, str2, z);
        LogUtil.a("PLGACHIEVE_SameTypeMedalView", "showSameTypeMedals: medalInfoList -> " + listC.size());
        HandlerExecutor.b(new Runnable() { // from class: pbj
            @Override // java.lang.Runnable
            public final void run() {
                this.d.b(listC);
            }
        });
    }

    private List<MedalInfoDesc> c(String str, String str2, boolean z) {
        ArrayList arrayList = new ArrayList(2);
        otl otlVarB = otl.b(getContext());
        HashMap map = new HashMap(2);
        map.put(ParsedFieldTag.MEDAL_TYPE, str2);
        List<osf> listD = otlVarB.d(9, map);
        if (CollectionUtils.a(listD)) {
            LogUtil.j("PLGACHIEVE_SameTypeMedalView", "initMedalData: medalConfigInfoList is null");
            return arrayList;
        }
        for (osf osfVar : listD) {
            if (osfVar instanceof MedalConfigInfo) {
                MedalConfigInfo medalConfigInfo = (MedalConfigInfo) osfVar;
                if (TextUtils.equals(str, medalConfigInfo.acquireMedalID())) {
                    LogUtil.a("PLGACHIEVE_SameTypeMedalView", "initMedalData: do not show! medalId -> " + str);
                } else {
                    HashMap map2 = new HashMap(2);
                    map2.put("medalID", medalConfigInfo.acquireMedalID());
                    osf osfVarB = otlVarB.b(8, map2);
                    if (osfVarB instanceof MedalLocation) {
                        MedalLocation medalLocation = (MedalLocation) osfVarB;
                        if (!z && medalLocation.acquireGainedCount() <= 0) {
                            LogUtil.a("PLGACHIEVE_SameTypeMedalView", "initMedalData: gray medals don't show. medalId -> " + medalLocation.acquireMedalID());
                        } else {
                            b(arrayList, medalConfigInfo, medalLocation);
                        }
                    }
                }
            }
        }
        arrayList.sort(new Comparator() { // from class: pbk
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Long.compare(qrs.f(((MedalInfoDesc) obj2).acquireGainTime()), qrs.f(((MedalInfoDesc) obj).acquireGainTime()));
            }
        });
        return arrayList;
    }

    private void b(List<MedalInfoDesc> list, MedalConfigInfo medalConfigInfo, MedalLocation medalLocation) {
        MedalInfoDesc medalInfoDesc = new MedalInfoDesc(medalConfigInfo.acquireMedalID());
        medalInfoDesc.saveLightDescription(medalConfigInfo.acquireLightDescription());
        medalInfoDesc.saveText(medalConfigInfo.acquireMedalName());
        medalInfoDesc.saveMedalTypeLevel(osv.e(medalConfigInfo.acquireMedalType(), String.valueOf(medalConfigInfo.acquireMedalLevel())));
        medalInfoDesc.saveMedalType(medalConfigInfo.acquireMedalType());
        medalInfoDesc.savePromotionName(medalConfigInfo.acquireLightPromotionName());
        medalInfoDesc.savePromotionURL(medalConfigInfo.acquireLightPromotionUrl());
        medalInfoDesc.saveGainCount(medalLocation.acquireGainedCount());
        medalInfoDesc.saveGainTime(medalLocation.acquireMedalGainedTime());
        medalInfoDesc.saveMessage(medalConfigInfo.acquireMessage());
        list.add(medalInfoDesc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void b(List<MedalInfoDesc> list) {
        if (CollectionUtils.a(list)) {
            LogUtil.j("PLGACHIEVE_SameTypeMedalView", "showMedalView: medalInfoList is empty");
            return;
        }
        if (this.d == null || this.e == null) {
            LogUtil.j("PLGACHIEVE_SameTypeMedalView", "showMedalView: mSingleRootView/mMultiRootView is null");
            return;
        }
        if (list.size() == 1) {
            this.e.setVisibility(8);
            this.d.setVisibility(0);
            a(list.get(0), this.d, this.f22309c, this.f22308b);
            setVisibility(0);
            return;
        }
        this.d.setVisibility(8);
        this.e.setVisibility(0);
        this.e.removeAllViews();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, jhl.c(getContext(), 135.0f));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -1);
        layoutParams2.weight = 1.0f;
        LinearLayout linearLayout = null;
        for (int i = 0; i < list.size(); i++) {
            if (i % 3 == 0) {
                linearLayout = new LinearLayout(getContext());
                linearLayout.setOrientation(0);
                linearLayout.setWeightSum(3.0f);
                linearLayout.setLayoutParams(layoutParams);
                linearLayout.removeAllViews();
                this.e.addView(linearLayout);
            }
            LinearLayout linearLayout2 = (LinearLayout) View.inflate(getContext(), R.layout.view_item_same_type_medal, null);
            linearLayout2.setOrientation(1);
            linearLayout2.setLayoutParams(layoutParams2);
            a(list.get(i), linearLayout2, (ImageView) linearLayout2.findViewById(R.id.iv_medal_image), (TextView) linearLayout2.findViewById(R.id.htv_medal_name));
            linearLayout.addView(linearLayout2);
        }
        setVisibility(0);
    }

    private void a(final MedalInfoDesc medalInfoDesc, View view, ImageView imageView, TextView textView) {
        Bitmap bitmapA = pax.a(medalInfoDesc.acquireMedalId(), medalInfoDesc.acquireGainCount() > 0, false);
        if (bitmapA != null) {
            imageView.setImageBitmap(bitmapA);
        } else {
            LogUtil.j("PLGACHIEVE_SameTypeMedalView", "setMedalViewData: medalBitmap is null");
        }
        textView.setText(medalInfoDesc.acquireText());
        view.setOnClickListener(new View.OnClickListener() { // from class: pbl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f45127b.c(medalInfoDesc, view2);
            }
        });
    }

    public /* synthetic */ void c(MedalInfoDesc medalInfoDesc, View view) {
        b(medalInfoDesc);
    }

    private void b(MedalInfoDesc medalInfoDesc) {
        Context context = getContext();
        if (context == null) {
            LogUtil.j("PLGACHIEVE_SameTypeMedalView", "jumpToMedalDetailActivity: context is null");
            return;
        }
        Intent intent = new Intent(context, (Class<?>) AchieveMedalDetailActivity.class);
        intent.putExtra("medal_res_id", medalInfoDesc.acquireMedalId());
        intent.putExtra("medal_des_id", medalInfoDesc.acquireLightDescription());
        intent.putExtra("medal_content_id", medalInfoDesc.acquireText());
        intent.putExtra("medal_type_level", medalInfoDesc.acquireMedalTypeLevel());
        intent.putExtra("medal_type", medalInfoDesc.acquireMedalType());
        intent.putExtra("promotion_name", medalInfoDesc.acquirePromotionName());
        intent.putExtra("promotion_url", medalInfoDesc.acquirePromotionURL());
        intent.putExtra("medal_gain_time", medalInfoDesc.acquireGainTime());
        intent.putExtra("medal_gain_count", medalInfoDesc.acquireGainCount());
        intent.putExtra("KEY_IS_SAME_TYPE_MEDAL_VIEW", true);
        intent.putExtra("medal_obtain_id", String.valueOf(medalInfoDesc.acquireGainCount() > 0));
        intent.putExtra("click_x", pbn.g(context) / 2);
        intent.putExtra("click_y", pbn.j(context) / 2);
        intent.addFlags(268435456);
        iov.d(context, intent);
    }
}
