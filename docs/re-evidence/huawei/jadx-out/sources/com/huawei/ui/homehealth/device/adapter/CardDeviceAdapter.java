package com.huawei.ui.homehealth.device.adapter;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.ContentValues;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.connectivity.comm.MeasurableDevice;
import com.huawei.health.device.manager.DeviceCloudSharePreferencesManager;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbtsdk.btcommon.BTDeviceMgrUtil;
import com.huawei.hwbtsdk.btdatatype.callback.BtSwitchStateCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwversionmgr.manager.HwVersionManager;
import com.huawei.openalliance.ad.constant.ConfigMapDefValues;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.db.bean.EventMonitorRecord;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import com.huawei.ui.device.activity.pairing.DevicePairGuideUtil;
import com.huawei.ui.device.interactors.DeviceSettingsInteractors;
import com.huawei.ui.device.utlis.BluetoothPermisionUtils;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.device.CardDeviceFragment;
import com.huawei.ui.homehealth.device.callback.BitmapCallBack;
import com.huawei.ui.homehealth.device.devicelist.DeviceMoreListActivity;
import com.huawei.ui.homehealth.device.devicelist.MoreSportDeviceActivity;
import defpackage.cha;
import defpackage.dmp;
import defpackage.dmx;
import defpackage.dru;
import defpackage.dxm;
import defpackage.dxw;
import defpackage.dxx;
import defpackage.dxy;
import defpackage.eby;
import defpackage.ecu;
import defpackage.edl;
import defpackage.eel;
import defpackage.eep;
import defpackage.eey;
import defpackage.elg;
import defpackage.elh;
import defpackage.elo;
import defpackage.lon;
import defpackage.lrd;
import defpackage.lvi;
import defpackage.lvl;
import defpackage.lwr;
import defpackage.maq;
import defpackage.mgg;
import defpackage.mgp;
import defpackage.mgt;
import defpackage.nva;
import defpackage.pig;
import defpackage.qji;
import defpackage.qqp;
import defpackage.qqs;
import defpackage.qqz;
import defpackage.qre;
import defpackage.qrs;
import defpackage.qst;
import defpackage.rct;
import defpackage.tqp;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes17.dex */
public class CardDeviceAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Map<String, Bitmap> f25235b = new HashMap(16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f25236a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f25237c;
    private DeviceMoreListActivity d;
    private LayoutInflater f;
    private HwVersionManager g;
    private CardDeviceFragment j;
    private PersonalItemReconnectListener l;
    private MoreSportDeviceActivity n;
    private BtSwitchStateCallback s;
    private List<dru> k = new ArrayList(16);
    private int p = 0;
    private boolean i = false;
    private NoTitleCustomAlertDialog m = null;
    private boolean h = false;
    private final ConcurrentHashMap<String, Boolean> q = new ConcurrentHashMap<>();
    private boolean e = qst.c();
    private int o = 1;

    public interface PersonalItemReconnectListener {
        void onMoreEquipment();

        void onPersonalEquipment(int i, View view);

        void onReconnect(dxy dxyVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return i;
    }

    public CardDeviceAdapter(Context context, CardDeviceFragment cardDeviceFragment, PersonalItemReconnectListener personalItemReconnectListener) {
        this.g = null;
        this.f25237c = context;
        this.j = cardDeviceFragment;
        this.l = personalItemReconnectListener;
        this.f = LayoutInflater.from(context);
        this.g = HwVersionManager.b(this.f25237c);
    }

    public CardDeviceAdapter(Context context, DeviceMoreListActivity deviceMoreListActivity, PersonalItemReconnectListener personalItemReconnectListener) {
        this.g = null;
        this.f25237c = context;
        this.d = deviceMoreListActivity;
        this.l = personalItemReconnectListener;
        if (context != null) {
            this.f = LayoutInflater.from(context);
        }
        this.g = HwVersionManager.b(this.f25237c);
    }

    public CardDeviceAdapter(Context context, MoreSportDeviceActivity moreSportDeviceActivity, PersonalItemReconnectListener personalItemReconnectListener) {
        this.g = null;
        this.f25237c = context;
        this.n = moreSportDeviceActivity;
        this.l = personalItemReconnectListener;
        if (context != null) {
            this.f = LayoutInflater.from(context);
        }
        this.g = HwVersionManager.b(this.f25237c);
    }

    public void c(List<dru> list) {
        ReleaseLogUtil.d("R_CardDeviceAdapter", "setDeviceList productInfoList: ", Integer.valueOf(this.k != null ? list.size() : -1));
        this.k = list;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        List<dru> list = this.k;
        if (list == null || i < 0 || i >= list.size()) {
            return 1;
        }
        dru druVar = this.k.get(i);
        LogUtil.a("CardDeviceAdapter", "getItemViewType viewType:", Integer.valueOf(druVar.e()));
        if (druVar.e() == 2) {
            return 2;
        }
        if (druVar.g() != 2 && this.k.size() <= 1) {
            return 1;
        }
        if (this.o == 2) {
            return e();
        }
        return 3;
    }

    private int e() {
        return qrs.af(this.f25237c) ? 3 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 2) {
            this.f25236a = 1;
            return new MoreViewHolder(this.f.inflate(R.layout.fragment_device_card_list_item_optimization, viewGroup, false));
        }
        if (i == 3) {
            this.f25236a = 1;
            return new CardDeviceViewHolder(this.f.inflate(R.layout.fragment_device_card_list_item_optimization, viewGroup, false));
        }
        this.f25236a = 2;
        return new CardDeviceViewHolder(this.f.inflate(R.layout.fragment_device_card_list_item, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        viewHolder.setIsRecyclable(false);
        if (viewHolder instanceof CardDeviceViewHolder) {
            e((CardDeviceViewHolder) viewHolder, i);
        } else {
            b((MoreViewHolder) viewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            ((GridLayoutManager) layoutManager).setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() { // from class: com.huawei.ui.homehealth.device.adapter.CardDeviceAdapter.2
                @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
                public int getSpanSize(int i) {
                    return (!qrs.af(CardDeviceAdapter.this.f25237c) && CardDeviceAdapter.this.k.size() == 1) ? 2 : 1;
                }
            });
        }
    }

    private void b(MoreViewHolder moreViewHolder) {
        if (moreViewHolder.d != null) {
            moreViewHolder.d.setVisibility(8);
        }
        if (moreViewHolder.f25262b != null) {
            moreViewHolder.f25262b.setVisibility(8);
        }
        if (LanguageUtil.ba(this.f25237c)) {
            moreViewHolder.e.setBackgroundResource(R.mipmap.pic_me_card_add_bg_mirror);
        } else {
            moreViewHolder.e.setBackgroundResource(R.mipmap.pic_me_card_add_bg);
        }
        moreViewHolder.f25263c.setOnClickListener(new View.OnClickListener() { // from class: roh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f47531c.e(view);
            }
        });
    }

    public /* synthetic */ void e(View view) {
        ReleaseLogUtil.d("R_CardDeviceAdapter", "refreshWatchFace enter mPageType = ", Integer.valueOf(this.o));
        this.l.onMoreEquipment();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.k.size();
    }

    private void e(CardDeviceViewHolder cardDeviceViewHolder, final int i) {
        if (i < 0 || i >= this.k.size()) {
            return;
        }
        dru druVar = this.k.get(i);
        if (cardDeviceViewHolder.e != null) {
            cardDeviceViewHolder.e.setVisibility(8);
        }
        a(cardDeviceViewHolder, druVar);
        c(cardDeviceViewHolder, druVar);
        b(cardDeviceViewHolder, druVar);
        if (qrs.ac()) {
            cardDeviceViewHolder.l.setVisibility(8);
        }
        cha chaVar = new cha(new View.OnClickListener() { // from class: com.huawei.ui.homehealth.device.adapter.CardDeviceAdapter.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ReleaseLogUtil.d("R_CardDeviceAdapter", "onClick onPersonalEquipment mPageType=", Integer.valueOf(CardDeviceAdapter.this.o));
                CardDeviceAdapter.this.l.onPersonalEquipment(i, view);
            }
        }, true, "");
        qji.a(chaVar, ((BaseActivity) this.f25237c).toString());
        cardDeviceViewHolder.s.setOnClickListener(chaVar);
    }

    private void a(final CardDeviceViewHolder cardDeviceViewHolder, dru druVar) {
        if (druVar.e() == 1) {
            if (cardDeviceViewHolder.ac != null) {
                cardDeviceViewHolder.ac.setVisibility(8);
            }
            if (cardDeviceViewHolder.ab != null) {
                cardDeviceViewHolder.ab.setVisibility(8);
            }
            if (cardDeviceViewHolder.g != null) {
                cardDeviceViewHolder.g.setVisibility(0);
            }
            cardDeviceViewHolder.an.setVisibility(0);
            cardDeviceViewHolder.f25261c.setVisibility(0);
            cardDeviceViewHolder.k.setVisibility(0);
            cardDeviceViewHolder.j.setVisibility(0);
            cardDeviceViewHolder.o.setVisibility(8);
            cardDeviceViewHolder.ag.setVisibility(8);
            Object objI = druVar.i();
            if (!(objI instanceof dxy)) {
                LogUtil.j("CardDeviceAdapter", "setWearDevice DeviceInfoForWear is null");
                return;
            }
            final dxy dxyVar = (dxy) objI;
            if (dxyVar.h()) {
                LogUtil.a("CardDeviceAdapter", "deviceInfoForWear.getIsCloudDevice");
                cardDeviceViewHolder.f25260b.setVisibility(0);
            } else {
                cardDeviceViewHolder.f25260b.setVisibility(8);
            }
            LogUtil.a("CardDeviceAdapter", "getView wear device name:", dxyVar.i());
            String strA = tqp.a(this.f25237c, dxyVar.d(), dxyVar.i(), druVar.f(), true);
            LogUtil.a("CardDeviceAdapter", "deviceNameAlias:", strA);
            cardDeviceViewHolder.f.setText(strA);
            cardDeviceViewHolder.f.setText(strA);
            c(cardDeviceViewHolder.f);
            cardDeviceViewHolder.f25259a = dxyVar;
            e(dxyVar, new BitmapCallBack() { // from class: com.huawei.ui.homehealth.device.adapter.CardDeviceAdapter.1
                @Override // com.huawei.ui.homehealth.device.callback.BitmapCallBack
                public void onCallback(Bitmap bitmap) {
                    if (!dxyVar.equals(cardDeviceViewHolder.f25259a)) {
                        if (cardDeviceViewHolder.f25259a == null) {
                            ReleaseLogUtil.d("R_CardDeviceAdapter", "setDeviceImage holder.deviceInfoForWear is null");
                            return;
                        }
                        ReleaseLogUtil.d("R_CardDeviceAdapter", "setDeviceImage deviceType:", Integer.valueOf(dxyVar.g()), "  holder.deviceType:", Integer.valueOf(cardDeviceViewHolder.f25259a.g()));
                        return;
                    }
                    cardDeviceViewHolder.j.setImageBitmap(bitmap);
                }
            });
            c(cardDeviceViewHolder, dxyVar);
        }
    }

    private void c(final CardDeviceViewHolder cardDeviceViewHolder, dru druVar) {
        if (druVar.e() == 4) {
            c(cardDeviceViewHolder);
            final List<dru> listJ = druVar.j();
            Object objI = listJ.get(0).i();
            if (!(objI instanceof dxy)) {
                LogUtil.j("CardDeviceAdapter", "!(object instanceof DeviceInfoForWear)");
                return;
            }
            final dxy dxyVar = (dxy) objI;
            String strI = dxyVar.i();
            cardDeviceViewHolder.aa.setText(strI.contains(Constants.LINK) ? strI.substring(0, strI.lastIndexOf(Constants.LINK)) : "");
            cardDeviceViewHolder.z.setText("" + listJ.size());
            c(cardDeviceViewHolder.aa);
            c(cardDeviceViewHolder.z);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(qqp.a(this.f25237c, 32.0f), qqp.a(this.f25237c, 32.0f), 1.0f);
            if (listJ.size() == 2) {
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(qqp.a(this.f25237c, 48.0f), qqp.a(this.f25237c, 48.0f));
                layoutParams2.setMarginEnd(qqp.a(this.f25237c, 16.0f));
                layoutParams = layoutParams2;
            }
            if ((this.f25236a == 2 || this.k.size() == 1) && listJ.size() > 2) {
                layoutParams = new LinearLayout.LayoutParams(qqp.a(this.f25237c, 48.0f), qqp.a(this.f25237c, 48.0f), 1.0f);
            }
            final LinearLayout.LayoutParams layoutParams3 = layoutParams;
            cardDeviceViewHolder.f25259a = dxyVar;
            e(dxyVar, new BitmapCallBack() { // from class: com.huawei.ui.homehealth.device.adapter.CardDeviceAdapter.3
                @Override // com.huawei.ui.homehealth.device.callback.BitmapCallBack
                public void onCallback(Bitmap bitmap) {
                    if (dxyVar.equals(cardDeviceViewHolder.f25259a)) {
                        CardDeviceAdapter.this.h = false;
                        cardDeviceViewHolder.ac.removeAllViews();
                        for (int i = 0; i < listJ.size(); i++) {
                            if (((dru) listJ.get(i)).i() instanceof dxy) {
                                CardDeviceAdapter.this.e((dxy) ((dru) listJ.get(i)).i(), cardDeviceViewHolder, bitmap, layoutParams3, i);
                                if (CardDeviceAdapter.this.h && i > 3) {
                                    return;
                                }
                            }
                        }
                        return;
                    }
                    if (cardDeviceViewHolder.f25259a == null) {
                        ReleaseLogUtil.d("R_CardDeviceAdapter", "setMoreSportDeviceImage holder.deviceInfoForWear is null");
                        return;
                    }
                    ReleaseLogUtil.d("R_CardDeviceAdapter", "setMoreSportDeviceImage deviceType:", Integer.valueOf(dxyVar.g()), "  holder.deviceType:", Integer.valueOf(cardDeviceViewHolder.f25259a.g()));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(dxy dxyVar, CardDeviceViewHolder cardDeviceViewHolder, Bitmap bitmap, LinearLayout.LayoutParams layoutParams, int i) {
        if (i <= 3) {
            ImageView imageView = new ImageView(this.f25237c);
            imageView.setImageBitmap(bitmap);
            if (dxyVar.b() != 2) {
                imageView.setAlpha(0.38f);
            }
            imageView.setLayoutParams(layoutParams);
            cardDeviceViewHolder.ac.addView(imageView);
        }
        if (this.h || dxyVar.b() != 2) {
            return;
        }
        this.h = this.g.o(dxyVar.d());
        if (b() == null) {
            LogUtil.j("CardDeviceAdapter", "fragment or activity is null");
        } else if (this.h) {
            cardDeviceViewHolder.af.setVisibility(0);
        } else {
            cardDeviceViewHolder.af.setVisibility(8);
        }
    }

    private void c(HealthTextView healthTextView) {
        if (this.f25236a == 1) {
            if (LanguageUtil.ag(this.f25237c)) {
                healthTextView.setTextSize(1, 10.0f);
            } else {
                healthTextView.setTextSize(1, 14.0f);
            }
        }
    }

    private void c(CardDeviceViewHolder cardDeviceViewHolder) {
        cardDeviceViewHolder.g.setVisibility(8);
        cardDeviceViewHolder.ab.setVisibility(0);
        cardDeviceViewHolder.f25261c.setVisibility(8);
        cardDeviceViewHolder.an.setVisibility(8);
        cardDeviceViewHolder.ac.setVisibility(0);
        cardDeviceViewHolder.ac.removeAllViews();
    }

    private void c(CardDeviceViewHolder cardDeviceViewHolder, dxy dxyVar) {
        if (dxyVar.b() == 2) {
            d(cardDeviceViewHolder, dxyVar);
            j(cardDeviceViewHolder, dxyVar);
            return;
        }
        if (dxyVar.b() == 1) {
            cardDeviceViewHolder.f.setAlpha(0.38f);
            cardDeviceViewHolder.j.setAlpha(0.38f);
            cardDeviceViewHolder.i.setText(R.string.IDS_myfitnesspal_logout);
            cardDeviceViewHolder.h.setVisibility(8);
            cardDeviceViewHolder.l.setVisibility(8);
            cardDeviceViewHolder.aj.setVisibility(8);
            cardDeviceViewHolder.y.setVisibility(8);
            if (cardDeviceViewHolder.u != null) {
                cardDeviceViewHolder.u.setVisibility(8);
            }
            cardDeviceViewHolder.w.setVisibility(0);
            cardDeviceViewHolder.x.setText(R.string.IDS_hw_health_wear_connect_device_connect_text);
            this.q.put(dxyVar.d(), false);
            cardDeviceViewHolder.p.setVisibility(4);
            return;
        }
        b(cardDeviceViewHolder, dxyVar);
    }

    private void b(CardDeviceViewHolder cardDeviceViewHolder, dxy dxyVar) {
        boolean z = (this.o == 1 && this.k.size() == 1) || this.o == 2;
        if (LanguageUtil.as(this.f25237c) && !qrs.ah(this.f25237c) && z) {
            cardDeviceViewHolder.y.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 2.0f));
            cardDeviceViewHolder.h.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 3.0f));
        }
        cardDeviceViewHolder.i.setText(R.string.IDS_myfitnesspal_logout);
        cardDeviceViewHolder.l.setVisibility(8);
        cardDeviceViewHolder.aj.setVisibility(8);
        cardDeviceViewHolder.w.setVisibility(8);
        cardDeviceViewHolder.h.setVisibility(0);
        int i = R.string.IDS_hw_health_wear_connect_device_connect_button;
        if (dxyVar.h()) {
            i = R.string.IDS_btsdk_confirm_connect;
        }
        a(cardDeviceViewHolder, dxyVar);
        if (cardDeviceViewHolder.u != null && !LanguageUtil.f(this.f25237c) && this.k.size() > 1) {
            cardDeviceViewHolder.u.setVisibility(0);
            cardDeviceViewHolder.u.setText(i);
            cardDeviceViewHolder.u.setTextColor(this.f25237c.getResources().getColor(R.color.home_track_starget_value_color_whole_alpha));
        } else {
            cardDeviceViewHolder.y.setVisibility(0);
            cardDeviceViewHolder.y.setText(i);
            cardDeviceViewHolder.y.setTextColor(this.f25237c.getResources().getColor(R.color.home_track_starget_value_color_whole_alpha));
        }
        this.q.put(dxyVar.d(), false);
        cardDeviceViewHolder.p.setVisibility(4);
        e(cardDeviceViewHolder, dxyVar);
        b(cardDeviceViewHolder);
    }

    private void a(CardDeviceViewHolder cardDeviceViewHolder, dxy dxyVar) {
        boolean z = LanguageUtil.f(this.f25237c) && this.f25236a == 1;
        if (dxyVar.h() && (z || this.f25236a == 2)) {
            cardDeviceViewHolder.h.setVisibility(8);
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        if (cardDeviceViewHolder.h.getVisibility() == 8 && this.f25236a == 1) {
            cardDeviceViewHolder.y.setLayoutParams(layoutParams);
        } else if (cardDeviceViewHolder.h.getVisibility() == 0 && this.f25236a == 1) {
            layoutParams.setMarginStart(qrs.d(this.f25237c, 8.0f));
            cardDeviceViewHolder.y.setLayoutParams(layoutParams);
        } else {
            LogUtil.j("CardDeviceAdapter", "setCloudRetryConnectTv retryConnectTextView other");
        }
    }

    private void e(CardDeviceViewHolder cardDeviceViewHolder, dxy dxyVar) {
        if (!this.i) {
            if (cardDeviceViewHolder.u != null && !LanguageUtil.f(this.f25237c) && this.k.size() > 1) {
                d(cardDeviceViewHolder.h, cardDeviceViewHolder.u, cardDeviceViewHolder.w, dxyVar);
                return;
            } else {
                d(cardDeviceViewHolder.h, cardDeviceViewHolder.y, cardDeviceViewHolder.w, dxyVar);
                return;
            }
        }
        if (cardDeviceViewHolder.u != null && !LanguageUtil.f(this.f25237c) && this.k.size() > 1) {
            cardDeviceViewHolder.u.setTextColor(this.f25237c.getResources().getColor(R.color.emui_color_list_divider));
            cardDeviceViewHolder.u.setClickable(false);
        } else {
            cardDeviceViewHolder.y.setTextColor(this.f25237c.getResources().getColor(R.color.emui_color_list_divider));
            cardDeviceViewHolder.y.setClickable(false);
        }
    }

    private void b(CardDeviceViewHolder cardDeviceViewHolder, dru druVar) {
        int iE = druVar.e();
        if (iE == 0 || iE == 3 || iE == 6) {
            if (qqs.e(this.f25237c)) {
                cardDeviceViewHolder.d.setBackground(this.f25237c.getResources().getDrawable(R.drawable.card_device_item_gradient_darkmode_bg));
                cardDeviceViewHolder.ai.setTextColor(this.f25237c.getResources().getColor(R.color.emui_toolbar_text_dark));
                cardDeviceViewHolder.ae.setTextColor(this.f25237c.getResources().getColor(R.color.textColorSecondaryInverse));
            }
            cardDeviceViewHolder.ah.setVisibility(4);
            cardDeviceViewHolder.k.setVisibility(8);
            cardDeviceViewHolder.j.setVisibility(8);
            cardDeviceViewHolder.o.setVisibility(0);
            cardDeviceViewHolder.ag.setVisibility(0);
            if (cardDeviceViewHolder.f25260b != null) {
                cardDeviceViewHolder.f25260b.setVisibility(8);
            }
            Object objI = druVar.i();
            if (!(objI instanceof elh)) {
                LogUtil.j("CardDeviceAdapter", "setThreeWayDevice ProductInfo is null");
                return;
            }
            elh elhVar = (elh) objI;
            ContentValues contentValuesD = druVar.d();
            a(cardDeviceViewHolder, iE, elhVar, c(contentValuesD));
            if (!dxm.ab(elhVar.t())) {
                LogUtil.j("CardDeviceAdapter", "is not Honour weight device");
            } else if (contentValuesD != null) {
                c(cardDeviceViewHolder, elhVar.t(), contentValuesD.getAsString("uniqueId"));
            } else {
                LogUtil.j("CardDeviceAdapter", "CardDeviceAdapter isShowNewVersion deviceInfo is null");
            }
            e(cardDeviceViewHolder, druVar);
        }
    }

    private void e(CardDeviceViewHolder cardDeviceViewHolder, dru druVar) {
        LogUtil.a("CardDeviceAdapter", "enter showCloudDevice...");
        if ("0".equals(druVar.d().getAsString(EventMonitorRecord.ADD_TIME))) {
            LogUtil.a("CardDeviceAdapter", "device is CloudDevice");
            cardDeviceViewHolder.f25260b.setVisibility(0);
            cardDeviceViewHolder.ai.setAlpha(0.38f);
            cardDeviceViewHolder.o.setAlpha(0.38f);
            cardDeviceViewHolder.ae.setAlpha(0.38f);
        }
    }

    private String c(ContentValues contentValues) {
        if (contentValues == null) {
            LogUtil.j("CardDeviceAdapter", "getThreeWayDeviceName deviceInfo is null.");
            return "";
        }
        String asString = contentValues.getAsString("sn");
        String asString2 = contentValues.getAsString("uniqueId");
        if (TextUtils.isEmpty(asString)) {
            asString = dxm.l(asString2);
        }
        return TextUtils.isEmpty(asString) ? asString2 : asString;
    }

    private void a(CardDeviceViewHolder cardDeviceViewHolder, int i, elh elhVar, String str) {
        if (elhVar.d().size() <= 0) {
            LogUtil.a("CardDeviceAdapter", "item.getDescriptions().size() <= 0");
            if (i == 3 || i == 6) {
                cardDeviceViewHolder.p.setVisibility(4);
                cardDeviceViewHolder.ae.setVisibility(4);
                cardDeviceViewHolder.ai.setText(a(elo.a(elhVar.t(), elhVar.l().d()), str));
                cardDeviceViewHolder.o.setImageBitmap(elo.c(elg.e().d(elhVar.t(), elhVar.l().b())));
            } else {
                cardDeviceViewHolder.ai.setText(a(elhVar.l().d(), str));
                cardDeviceViewHolder.ae.setText(elhVar.l().e());
                cardDeviceViewHolder.o.setImageResource(elo.a(elhVar.l().b()));
            }
        } else {
            LogUtil.a("CardDeviceAdapter", "item.getDescriptions().size() > 0");
            if ("9bf158ba-49b0-46aa-9fdf-ed75da1569cf".equals(elhVar.t())) {
                str = "";
            }
            if (!TextUtils.isEmpty(str)) {
                cardDeviceViewHolder.ai.setText(a(elo.a(elhVar.t(), elhVar.l().d()), str));
            } else {
                cardDeviceViewHolder.ai.setText(elo.a(elhVar.t(), elhVar.l().d()));
            }
            cardDeviceViewHolder.ae.setText(elo.a(elhVar.t(), elhVar.l().e()));
            cardDeviceViewHolder.o.setImageBitmap(elo.c(elg.e().d(elhVar.t(), elhVar.l().b())));
        }
        c(cardDeviceViewHolder.ai);
    }

    private void c(CardDeviceViewHolder cardDeviceViewHolder, String str, String str2) {
        if (!dxm.v(str)) {
            LogUtil.j("CardDeviceAdapter", "CardDeviceAdapter is not new hag");
            return;
        }
        if (TextUtils.isEmpty(nva.a(this.f25237c, str2))) {
            String strM = dxm.m(str2);
            LogUtil.a("CardDeviceAdapter", "processNotifyRed currentVersion:", strM);
            nva.b(strM, this.f25237c, str2);
        }
        if (TextUtils.isEmpty(nva.j(this.f25237c, str2))) {
            String strC = nva.c(this.f25237c, str);
            LogUtil.a("CardDeviceAdapter", "isShowNewVersion scaleCheckNewVersion:", strC);
            nva.g(strC, this.f25237c, str2);
        }
        boolean zF = nva.f(this.f25237c, str2);
        LogUtil.a("CardDeviceAdapter", "CardDeviceAdapter isShowNewVersion isNewVersion:", Boolean.valueOf(zF));
        LogUtil.a("CardDeviceAdapter", "CardDeviceAdapter isShowNewVersion code:", CommonUtil.n(str2), ",productId:" + str);
        if (!e(str2) && zF) {
            cardDeviceViewHolder.ah.setVisibility(0);
            LogUtil.a("CardDeviceAdapter", "CardDeviceAdapter isShowNewVersion not Manager && isNewVersion");
            return;
        }
        MeasurableDevice measurableDeviceB = dmp.d().b(str2, false);
        if (measurableDeviceB != null) {
            if (measurableDeviceB instanceof eby) {
                boolean z = ((eby) measurableDeviceB).a().m() == 1;
                LogUtil.a("CardDeviceAdapter", "CardDeviceAdapter is new isMainUser:", Boolean.valueOf(z));
                if (z && zF) {
                    cardDeviceViewHolder.ah.setVisibility(0);
                    return;
                } else {
                    cardDeviceViewHolder.ah.setVisibility(4);
                    return;
                }
            }
            LogUtil.j("CardDeviceAdapter", "CardDeviceAdapter device not WiFiDevice");
            return;
        }
        LogUtil.j("CardDeviceAdapter", "CardDeviceAdapter device is null");
    }

    private boolean e(String str) {
        DeviceCloudSharePreferencesManager deviceCloudSharePreferencesManager = new DeviceCloudSharePreferencesManager(dxw.d());
        StringBuffer stringBuffer = new StringBuffer(16);
        stringBuffer.append("device_has_manager");
        stringBuffer.append(str);
        return deviceCloudSharePreferencesManager.d(stringBuffer.toString());
    }

    private String a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("CardDeviceAdapter", "name is empty");
            return "";
        }
        if (str.toUpperCase().contains(b(str2).toUpperCase())) {
            return str;
        }
        return str + b(str2).toUpperCase();
    }

    private void d(CardDeviceViewHolder cardDeviceViewHolder, dxy dxyVar) {
        if (maq.b().c(dxyVar.d()) == 6) {
            cardDeviceViewHolder.h.setVisibility(8);
            cardDeviceViewHolder.l.setVisibility(8);
            cardDeviceViewHolder.y.setVisibility(8);
            if (cardDeviceViewHolder.u != null) {
                cardDeviceViewHolder.u.setVisibility(8);
            }
            cardDeviceViewHolder.w.setVisibility(0);
            cardDeviceViewHolder.x.setText(R.string.IDS_ota_update_state_upgrading);
            LogUtil.a("CardDeviceAdapter", "wear device is OTAing");
            return;
        }
        e(cardDeviceViewHolder);
        cardDeviceViewHolder.i.setText(R.string.IDS_myfitnesspal_login);
        cardDeviceViewHolder.h.setVisibility(0);
        int iB = mgt.b(dxyVar.d());
        DeviceInfo deviceInfoD = d(dxyVar);
        a(cardDeviceViewHolder, iB, deviceInfoD);
        if (eey.d(deviceInfoD, 78)) {
            d(cardDeviceViewHolder, lwr.e().e(dxyVar.d()));
        }
        b(cardDeviceViewHolder, deviceInfoD);
        cardDeviceViewHolder.y.setVisibility(8);
        if (cardDeviceViewHolder.u != null) {
            cardDeviceViewHolder.u.setVisibility(8);
        }
        cardDeviceViewHolder.w.setVisibility(8);
    }

    private void b(CardDeviceViewHolder cardDeviceViewHolder, DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            cardDeviceViewHolder.aj.setVisibility(8);
            return;
        }
        if ("41bfc883-69f1-494e-8f6a-8e545202565c".equals(lvi.j(deviceInfo.getProductType()))) {
            dmx<Long> matterTimeInfo = ecu.d().getMatterTimeInfo(deviceInfo, 1);
            if (matterTimeInfo.a().intValue() == 0) {
                Long lC = matterTimeInfo.c();
                LogUtil.a("CardDeviceAdapter", "updateMatterTime getMatterTime:", lC);
                if (lC != null && lC.longValue() >= 0 && lC.longValue() < 2147483647L) {
                    cardDeviceViewHolder.aj.setText(e(lC.intValue()));
                    cardDeviceViewHolder.aj.setVisibility(0);
                    return;
                }
            }
        }
        cardDeviceViewHolder.aj.setVisibility(8);
    }

    private String e(int i) {
        if (i < 60) {
            return this.f25237c.getResources().getQuantityString(R.plurals.IDS_device_remain_time_minute, i, Integer.valueOf(i));
        }
        if (i < 1440) {
            int i2 = i / 60;
            return this.f25237c.getResources().getQuantityString(R.plurals.IDS_device_remain_time_hours, i2, Integer.valueOf(i2));
        }
        return this.f25237c.getResources().getQuantityString(R.plurals.IDS_device_remain_time_day, b(i, ConfigMapDefValues.DEFAULT_APPLIST_INTERVAL), Integer.valueOf(b(i, ConfigMapDefValues.DEFAULT_APPLIST_INTERVAL)));
    }

    private int b(int i, int i2) {
        return ((i + i2) - 1) / i2;
    }

    private DeviceInfo d(dxy dxyVar) {
        DeviceInfo deviceInfoE = dxyVar.e();
        return deviceInfoE != null ? deviceInfoE : mgg.c(dxyVar.d(), "CardDeviceAdapter");
    }

    private void d(CardDeviceViewHolder cardDeviceViewHolder, int i) {
        String strD = lwr.e().d(i);
        cardDeviceViewHolder.aj.setVisibility(0);
        cardDeviceViewHolder.aj.setText(strD);
    }

    private void a(CardDeviceViewHolder cardDeviceViewHolder, int i, DeviceInfo deviceInfo) {
        LogUtil.a("CardDeviceAdapter", "updatePower battery is ", Integer.valueOf(i));
        if (i >= 0) {
            cardDeviceViewHolder.h.setVisibility(8);
            cardDeviceViewHolder.l.setVisibility(0);
            double d2 = i;
            cardDeviceViewHolder.n.setText(UnitUtil.e(d2, 2, 0));
            if (lrd.d()) {
                lrd.b(cardDeviceViewHolder.n, qre.a(R.string.accessibility_battery_percent, UnitUtil.e(d2, 2, 0)));
            }
            if (this.f25236a == 1) {
                cardDeviceViewHolder.n.setTextSize(1, 12.0f);
            } else {
                cardDeviceViewHolder.n.setTextSize(2, 14.0f);
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(qqp.a(this.f25237c, 16.0f), qqp.a(this.f25237c, 16.0f));
            if (eey.d(deviceInfo, 112)) {
                layoutParams = new LinearLayout.LayoutParams(qqp.a(this.f25237c, 10.0f), qqp.a(this.f25237c, 10.0f));
                if (this.f25236a == 1) {
                    cardDeviceViewHolder.n.setTextSize(1, 9.0f);
                } else {
                    cardDeviceViewHolder.n.setTextSize(2, 12.0f);
                }
                cardDeviceViewHolder.m.setImageDrawable(this.f25237c.getResources().getDrawable(R.drawable.watch_battery_icon));
            } else if (LanguageUtil.ba(this.f25237c)) {
                cardDeviceViewHolder.m.setImageDrawable(qqz.e(this.f25237c, qrs.d(i)));
            } else {
                cardDeviceViewHolder.m.setImageDrawable(qrs.d(i));
            }
            cardDeviceViewHolder.m.setLayoutParams(layoutParams);
            a(cardDeviceViewHolder, deviceInfo);
            return;
        }
        cardDeviceViewHolder.l.setVisibility(8);
        cardDeviceViewHolder.t.setVisibility(8);
        cardDeviceViewHolder.ad.setVisibility(8);
    }

    private void a(CardDeviceViewHolder cardDeviceViewHolder, DeviceInfo deviceInfo) {
        if (eey.d(deviceInfo, 112)) {
            cardDeviceViewHolder.t.setVisibility(0);
            cardDeviceViewHolder.ad.setVisibility(0);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            if (this.f25236a == 2) {
                layoutParams.topMargin = qqp.a(this.f25237c, 4.0f);
            }
            if (LanguageUtil.ba(this.f25237c)) {
                if (this.f25236a == 1) {
                    layoutParams.setMarginEnd(qqp.a(this.f25237c, 8.0f));
                } else {
                    layoutParams.setMarginEnd(qqp.a(this.f25237c, 12.0f));
                }
            }
            cardDeviceViewHolder.ad.setLayoutParams(layoutParams);
            mgp mgpVarA = mgt.a(deviceInfo.getDeviceIdentify());
            int iB = mgpVarA.b();
            int iE = mgpVarA.e();
            if (iB == -1) {
                cardDeviceViewHolder.r.setText("--");
            } else {
                cardDeviceViewHolder.r.setText(UnitUtil.e(iB, 2, 0));
            }
            if (iE == -1) {
                cardDeviceViewHolder.v.setText("--");
                return;
            } else {
                cardDeviceViewHolder.v.setText(UnitUtil.e(iE, 2, 0));
                return;
            }
        }
        cardDeviceViewHolder.t.setVisibility(8);
        cardDeviceViewHolder.ad.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Activity b() {
        int i = this.o;
        if (i == 1) {
            CardDeviceFragment cardDeviceFragment = this.j;
            if (cardDeviceFragment != null && cardDeviceFragment.getActivity() != null) {
                return this.j.getActivity();
            }
        } else if (i == 2) {
            DeviceMoreListActivity deviceMoreListActivity = this.d;
            if (deviceMoreListActivity instanceof Activity) {
                return deviceMoreListActivity;
            }
        } else if (i == 3) {
            MoreSportDeviceActivity moreSportDeviceActivity = this.n;
            if (moreSportDeviceActivity instanceof Activity) {
                return moreSportDeviceActivity;
            }
        } else {
            LogUtil.j("CardDeviceAdapter", "activity else branch");
            return null;
        }
        return null;
    }

    private void j(final CardDeviceViewHolder cardDeviceViewHolder, final dxy dxyVar) {
        if (Boolean.TRUE.equals(this.q.get(dxyVar.d()))) {
            cardDeviceViewHolder.p.setVisibility(0);
        }
        ThreadPoolManager.c().a("CardDeviceAdapter", new Runnable() { // from class: com.huawei.ui.homehealth.device.adapter.CardDeviceAdapter.5
            @Override // java.lang.Runnable
            public void run() {
                final boolean zO = CardDeviceAdapter.this.g.o(dxyVar.d());
                Activity activityB = CardDeviceAdapter.this.b();
                if (activityB == null) {
                    LogUtil.j("CardDeviceAdapter", "fragment or activity is null");
                    return;
                }
                final boolean zD = eey.d(mgg.b(dxyVar.d(), "CardDeviceAdapter"), 58);
                final DeviceCapability deviceCapabilityE = DeviceSettingsInteractors.e(CardDeviceAdapter.this.f25237c).e(dxyVar.d());
                LogUtil.a("CardDeviceAdapter", "haveNewVersionTip isNew:", Boolean.valueOf(zO), " isSupportDetect ", Boolean.valueOf(zD));
                activityB.runOnUiThread(new Runnable() { // from class: com.huawei.ui.homehealth.device.adapter.CardDeviceAdapter.5.4
                    @Override // java.lang.Runnable
                    public void run() {
                        DeviceCapability deviceCapability = deviceCapabilityE;
                        if (deviceCapability != null && !deviceCapability.isOtaUpdate() && !zD) {
                            cardDeviceViewHolder.p.setVisibility(4);
                            CardDeviceAdapter.this.q.put(dxyVar.d(), false);
                            LogUtil.j("CardDeviceAdapter", "deviceCapability.isOtaUpdate():", Boolean.valueOf(deviceCapabilityE.isOtaUpdate()));
                        } else if (maq.b().c(dxyVar.d()) == 6) {
                            CardDeviceAdapter.this.q.put(dxyVar.d(), false);
                            cardDeviceViewHolder.p.setVisibility(4);
                        } else if (zO) {
                            CardDeviceAdapter.this.q.put(dxyVar.d(), true);
                            cardDeviceViewHolder.p.setVisibility(0);
                        } else {
                            CardDeviceAdapter.this.q.put(dxyVar.d(), false);
                            cardDeviceViewHolder.p.setVisibility(4);
                        }
                    }
                });
            }
        });
    }

    private void e(dxy dxyVar, BitmapCallBack bitmapCallBack) {
        int iG = dxyVar.g();
        LogUtil.a("CardDeviceAdapter", "getView wear device deviceType is : ", Integer.valueOf(iG));
        if (lvi.n(iG)) {
            LogUtil.a("CardDeviceAdapter", "is plugin download");
            String strJ = lvi.j(iG);
            LogUtil.a("CardDeviceAdapter", "is plugin download uuid:", strJ);
            boolean zIsResourcesAvailable = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).isResourcesAvailable(strJ);
            ReleaseLogUtil.d("R_CardDeviceAdapter", "download isPluginAvailable:", Boolean.valueOf(zIsResourcesAvailable), "  deviceType:", Integer.valueOf(dxyVar.g()));
            if (zIsResourcesAvailable) {
                a(iG, strJ, dxyVar, bitmapCallBack);
                return;
            } else if (lvi.f(iG)) {
                bitmapCallBack.onCallback(BitmapFactory.decodeResource(this.f25237c.getResources(), R.mipmap.device_icon_band_default));
                return;
            } else {
                bitmapCallBack.onCallback(BitmapFactory.decodeResource(this.f25237c.getResources(), R.mipmap.device_icon_watch_default));
                return;
            }
        }
        ReleaseLogUtil.d("R_CardDeviceAdapter", "set imageView default. deviceType:", Integer.valueOf(dxyVar.g()));
        if (!TextUtils.isEmpty(dxyVar.i()) && dxyVar.i().contains("HUAWEI CM-R1P")) {
            bitmapCallBack.onCallback(BitmapFactory.decodeResource(this.f25237c.getResources(), R.mipmap.id_devicemanager_r1_pro));
        } else {
            b(iG, dxyVar, bitmapCallBack);
        }
    }

    private void b(int i, dxy dxyVar, BitmapCallBack bitmapCallBack) {
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(this.f25237c.getResources(), CommonUtil.j(dxyVar.n()));
        if (bitmapDecodeResource != null) {
            bitmapCallBack.onCallback(bitmapDecodeResource);
        } else if (lvi.f(i)) {
            bitmapCallBack.onCallback(BitmapFactory.decodeResource(this.f25237c.getResources(), R.mipmap.device_icon_band_default));
        } else {
            bitmapCallBack.onCallback(BitmapFactory.decodeResource(this.f25237c.getResources(), R.mipmap.device_icon_watch_default));
        }
    }

    private void a(final int i, final String str, final dxy dxyVar, final BitmapCallBack bitmapCallBack) {
        final String str2 = str + dxyVar.d();
        if (f25235b.containsKey(str2) && f25235b.get(str2) != null) {
            LogUtil.j("CardDeviceAdapter", "sBitmapList containsKey");
            bitmapCallBack.onCallback(f25235b.get(str2));
        }
        ThreadPoolManager.c().execute(new Runnable() { // from class: rol
            @Override // java.lang.Runnable
            public final void run() {
                this.f47539b.e(str, dxyVar, i, str2, bitmapCallBack);
            }
        });
    }

    public /* synthetic */ void e(String str, dxy dxyVar, int i, String str2, final BitmapCallBack bitmapCallBack) {
        final Bitmap bitmapDecodeResource;
        String strE;
        edl pluginInfoByUuid = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getPluginInfoByUuid(str);
        if (pluginInfoByUuid == null || pluginInfoByUuid.i() == null) {
            bitmapDecodeResource = null;
        } else {
            DeviceInfo deviceInfoD = d(dxyVar);
            if (this.e && deviceInfoD == null) {
                strE = eep.c(pluginInfoByUuid, 1, dxyVar.a());
            } else {
                strE = eep.e(pluginInfoByUuid, 1, deviceInfoD);
            }
            LogUtil.a("CardDeviceAdapter", "setWearDevicePluginImage image:", strE, " code:", CommonUtil.n(dxyVar.d()), "version:", pluginInfoByUuid.b());
            bitmapDecodeResource = e(pluginInfoByUuid, strE, i);
            if (bitmapDecodeResource != null) {
                f25235b.put(str2, bitmapDecodeResource);
            }
        }
        if (bitmapDecodeResource == null) {
            ReleaseLogUtil.d("R_CardDeviceAdapter", "setWearDevicePluginImage loadImageForWear bitmap is null");
            if (lvi.f(i)) {
                bitmapDecodeResource = BitmapFactory.decodeResource(this.f25237c.getResources(), R.mipmap.device_icon_band_default);
            } else {
                bitmapDecodeResource = BitmapFactory.decodeResource(this.f25237c.getResources(), R.mipmap.device_icon_watch_default);
            }
        }
        if (bitmapDecodeResource == null) {
            ReleaseLogUtil.d("R_CardDeviceAdapter", "setWearDevicePluginImage bitmap==null");
            return;
        }
        Activity activityB = b();
        if (activityB == null) {
            ReleaseLogUtil.d("R_CardDeviceAdapter", "setWearDevicePluginImage activity==null");
        } else {
            activityB.runOnUiThread(new Runnable() { // from class: roe
                @Override // java.lang.Runnable
                public final void run() {
                    bitmapCallBack.onCallback(bitmapDecodeResource);
                }
            });
        }
    }

    private Bitmap e(edl edlVar, String str, int i) {
        LogUtil.a("CardDeviceAdapter", "loadImageForWear enter loadImageForWear");
        if (edlVar != null) {
            try {
                String str2 = pig.c().e(edlVar.c()) + File.separator + edlVar.c() + File.separator + "img" + File.separator + str + ".png";
                if (new File(str2).exists()) {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                    options.inInputShareable = true;
                    LogUtil.a("CardDeviceAdapter", "enter loadImageForWear have bitmap imageKey:", str, " fetchPluginUuid:", edlVar.c());
                    return BitmapFactory.decodeFile(str2, options);
                }
            } catch (Resources.NotFoundException unused) {
                LogUtil.e("CardDeviceAdapter", "loadImageForWear loadImage NotFoundException");
            }
        }
        if (lvi.f(i)) {
            return BitmapFactory.decodeResource(this.f25237c.getResources(), R.mipmap.device_icon_band_default);
        }
        return BitmapFactory.decodeResource(this.f25237c.getResources(), R.mipmap.device_icon_watch_default);
    }

    private String b(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.a("CardDeviceAdapter", "getDeviceIdentification identification is null");
            return "";
        }
        if (str.replace(":", "").length() < 3) {
            LogUtil.a("CardDeviceAdapter", "identification's length less than 3");
            return Constants.LINK + str.replace(":", "");
        }
        return Constants.LINK + str.replace(":", "").substring(str.replace(":", "").length() - 3);
    }

    private void d(LinearLayout linearLayout, HealthTextView healthTextView, LinearLayout linearLayout2, dxy dxyVar) {
        LogUtil.a("CardDeviceAdapter", "enter initReconnect");
        healthTextView.setClickable(true);
        if (!(this.f25237c instanceof BaseActivity)) {
            LogUtil.j("CardDeviceAdapter", "initReconnect mContext not instanceof BaseActivity");
            return;
        }
        cha chaVar = new cha(new d(this, linearLayout, healthTextView, linearLayout2, dxyVar), true, "");
        qji.a(chaVar, ((BaseActivity) this.f25237c).toString());
        healthTextView.setOnClickListener(chaVar);
    }

    static class d implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<dxy> f25264a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<LinearLayout> f25265b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<CardDeviceAdapter> f25266c;
        private WeakReference<LinearLayout> d;
        private WeakReference<HealthTextView> e;

        public d(CardDeviceAdapter cardDeviceAdapter, LinearLayout linearLayout, HealthTextView healthTextView, LinearLayout linearLayout2, dxy dxyVar) {
            this.f25266c = new WeakReference<>(cardDeviceAdapter);
            this.f25265b = new WeakReference<>(linearLayout);
            this.e = new WeakReference<>(healthTextView);
            this.d = new WeakReference<>(linearLayout2);
            this.f25264a = new WeakReference<>(dxyVar);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (qrs.r()) {
                LogUtil.j("CardDeviceAdapter", "onClick isFastClick");
                return;
            }
            if (maq.b().f()) {
                CardDeviceAdapter cardDeviceAdapter = this.f25266c.get();
                if (cardDeviceAdapter != null) {
                    cardDeviceAdapter.f();
                    return;
                }
                return;
            }
            CardDeviceAdapter cardDeviceAdapter2 = this.f25266c.get();
            LinearLayout linearLayout = this.f25265b.get();
            HealthTextView healthTextView = this.e.get();
            LinearLayout linearLayout2 = this.d.get();
            dxy dxyVar = this.f25264a.get();
            if (cardDeviceAdapter2 == null || linearLayout == null || healthTextView == null || linearLayout2 == null || dxyVar == null) {
                return;
            }
            cardDeviceAdapter2.e(linearLayout, healthTextView, linearLayout2, dxyVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final LinearLayout linearLayout, final HealthTextView healthTextView, final LinearLayout linearLayout2, final dxy dxyVar) {
        if (Build.VERSION.SDK_INT > 30) {
            PermissionUtil.d(this.f25237c, PermissionUtil.PermissionType.SCAN, new BluetoothPermisionUtils.NearbyPermissionAction(this.f25237c) { // from class: com.huawei.ui.homehealth.device.adapter.CardDeviceAdapter.8
                @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onGranted() {
                    LogUtil.a("CardDeviceAdapter", "nearby permission granted");
                    CardDeviceAdapter.this.a(linearLayout, healthTextView, linearLayout2, dxyVar);
                }
            });
        } else if (lvi.a(dxyVar.g()).b() == 2) {
            PermissionUtil.d(this.f25237c, PermissionUtil.PermissionType.LOCATION, new CustomPermissionAction(this.f25237c) { // from class: com.huawei.ui.homehealth.device.adapter.CardDeviceAdapter.9
                @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onGranted() {
                    LogUtil.a("CardDeviceAdapter", "location permission ok.");
                    if (!rct.e(CardDeviceAdapter.this.f25237c)) {
                        CardDeviceAdapter.this.j();
                    } else {
                        CardDeviceAdapter.this.a(linearLayout, healthTextView, linearLayout2, dxyVar);
                    }
                }
            });
        } else {
            a(linearLayout, healthTextView, linearLayout2, dxyVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.homehealth.device.adapter.CardDeviceAdapter.6
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.a("CardDeviceAdapter", "getHarmonyStatus getValue");
                String strD = lon.c().d("scale_share_harmony_tips");
                DevicePairGuideUtil.e(strD);
                LogUtil.a("CardDeviceAdapter", "getHarmonyStatus scale_share_harmony_tips: ", strD);
                Activity activityB = CardDeviceAdapter.this.b();
                if (activityB == null) {
                    return;
                }
                activityB.runOnUiThread(new Runnable() { // from class: com.huawei.ui.homehealth.device.adapter.CardDeviceAdapter.6.5
                    @Override // java.lang.Runnable
                    public void run() {
                        String string;
                        if ("on".equals(DevicePairGuideUtil.b())) {
                            string = BaseApplication.getContext().getString(R.string.IDS_btsdk_turn_on_location_harmony);
                        } else {
                            string = BaseApplication.getContext().getString(R.string.IDS_btsdk_turn_on_location);
                        }
                        tqp.e(CardDeviceAdapter.this.f25237c, string);
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final LinearLayout linearLayout, final HealthTextView healthTextView, final LinearLayout linearLayout2, final dxy dxyVar) {
        if (BluetoothAdapter.getDefaultAdapter() != null && !BluetoothAdapter.getDefaultAdapter().isEnabled()) {
            LogUtil.a("CardDeviceAdapter", "reConnect blue state: ", Integer.valueOf(BluetoothAdapter.getDefaultAdapter().getState()));
            NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this.f25237c).a(this.f25237c.getResources().getString(R.string.IDS_device_bluetooth_open_request)).c(R.string.IDS_device_bt_right_btn_info, new View.OnClickListener() { // from class: roi
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f47533b.e(linearLayout, healthTextView, linearLayout2, dxyVar, view);
                }
            }).a(R.string.IDS_device_bt_left_btn_info, new View.OnClickListener() { // from class: rof
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f47530a.b(view);
                }
            }).c();
            this.m = noTitleCustomAlertDialogC;
            noTitleCustomAlertDialogC.setCancelable(false);
            this.m.show();
            return;
        }
        a(linearLayout, healthTextView, linearLayout2, dxyVar, false);
    }

    public /* synthetic */ void e(final LinearLayout linearLayout, final HealthTextView healthTextView, final LinearLayout linearLayout2, final dxy dxyVar, View view) {
        LogUtil.a("CardDeviceAdapter", "user choose open BT");
        this.s = new BtSwitchStateCallback() { // from class: com.huawei.ui.homehealth.device.adapter.CardDeviceAdapter.10
            @Override // com.huawei.hwbtsdk.btdatatype.callback.BtSwitchStateCallback
            public void onBtSwitchStateCallback(int i) {
                LogUtil.a("CardDeviceAdapter", "reconnect bluetoothSwitchState :", Integer.valueOf(i));
                if (i == 3) {
                    BTDeviceMgrUtil.c().e(CardDeviceAdapter.this.s);
                    Activity activityB = CardDeviceAdapter.this.b();
                    if (activityB == null) {
                        ReleaseLogUtil.e("R_CardDeviceAdapter", "reConnect onBtSwitchStateCallback activity is null mPageType: ", Integer.valueOf(CardDeviceAdapter.this.o));
                        return;
                    }
                    if (activityB.isFinishing()) {
                        ReleaseLogUtil.e("R_CardDeviceAdapter", "reConnect onBtSwitchStateCallback activity is Finishing mPageType: ", Integer.valueOf(CardDeviceAdapter.this.o));
                    } else if (!activityB.isDestroyed()) {
                        CardDeviceAdapter.this.a(linearLayout, healthTextView, linearLayout2, dxyVar, true);
                    } else {
                        ReleaseLogUtil.e("R_CardDeviceAdapter", "reConnect onBtSwitchStateCallback activity is Destroyed mPageType: ", Integer.valueOf(CardDeviceAdapter.this.o));
                    }
                }
            }
        };
        BTDeviceMgrUtil.c().c(this.s);
    }

    public /* synthetic */ void b(View view) {
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.m;
        if (noTitleCustomAlertDialog != null) {
            noTitleCustomAlertDialog.dismiss();
            this.m = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(LinearLayout linearLayout, HealthTextView healthTextView, LinearLayout linearLayout2, dxy dxyVar, boolean z) {
        if (z) {
            this.p = 0;
        }
        c(linearLayout, dxyVar, healthTextView, linearLayout2);
        int i = this.o;
        if (i == 1) {
            this.j.f();
        } else if (i == 2) {
            this.d.a();
        } else if (i == 3) {
            this.n.a(false);
        } else {
            LogUtil.j("CardDeviceAdapter", "initDeviceList else branch");
        }
        notifyDataSetChanged();
    }

    private void c(LinearLayout linearLayout, dxy dxyVar, HealthTextView healthTextView, LinearLayout linearLayout2) {
        LogUtil.a("CardDeviceAdapter", "onclickReconnect deviceInfoForWear ：", dxyVar.toString());
        if (dxx.d().e(dxyVar.d()) || dxx.d().b().isEmpty()) {
            e(dxyVar, linearLayout, healthTextView, linearLayout2);
        } else {
            c(dxyVar);
            e(dxyVar, linearLayout, healthTextView, linearLayout2);
        }
    }

    private void c(dxy dxyVar) {
        if (dxyVar == null) {
            LogUtil.j("CardDeviceAdapter", "handleWorkMode deviceInfoForWear is null");
            return;
        }
        List<DeviceInfo> listD = lvl.d();
        if (listD == null) {
            LogUtil.j("CardDeviceAdapter", "handleWorkMode deviceInfoList is null");
            return;
        }
        boolean zD = eel.d(dxyVar.g());
        LogUtil.a("CardDeviceAdapter", "handleWorkMode goingReConnected is not AW70");
        Iterator<DeviceInfo> it = listD.iterator();
        while (it.hasNext()) {
            a(dxyVar, it.next(), zD);
        }
        dxx.d().j();
    }

    private void a(dxy dxyVar, DeviceInfo deviceInfo, boolean z) {
        if (deviceInfo == null) {
            LogUtil.j("CardDeviceAdapter", "deviceInfoList info is null");
            return;
        }
        if (dxyVar.d().equalsIgnoreCase(deviceInfo.getDeviceIdentify())) {
            LogUtil.a("CardDeviceAdapter", "set device enable identify ", BTDeviceMgrUtil.c().e(dxyVar.d()));
            deviceInfo.setDeviceActiveState(1);
            deviceInfo.setDeviceConnectState(1);
        } else {
            if (z) {
                if (eel.d(deviceInfo.getProductType()) && deviceInfo.getDeviceActiveState() == 1) {
                    LogUtil.a("CardDeviceAdapter", "set aw70 device disable identify ", BTDeviceMgrUtil.c().e(deviceInfo.getDeviceIdentify()));
                    deviceInfo.setDeviceActiveState(0);
                    deviceInfo.setDeviceConnectState(3);
                    return;
                }
                return;
            }
            if (deviceInfo.getAutoDetectSwitchStatus() == 1 || deviceInfo.getDeviceActiveState() != 1) {
                return;
            }
            LogUtil.a("CardDeviceAdapter", "set band mode device disable identify ", BTDeviceMgrUtil.c().e(deviceInfo.getDeviceIdentify()));
            deviceInfo.setDeviceActiveState(0);
            deviceInfo.setDeviceConnectState(3);
        }
    }

    private void e(dxy dxyVar, LinearLayout linearLayout, HealthTextView healthTextView, LinearLayout linearLayout2) {
        LogUtil.a("CardDeviceAdapter", "startReconnect mReconnectCount:", Integer.valueOf(this.p), "deviceInfoForWear.getIsCloudDevice:", Boolean.valueOf(dxyVar.h()));
        if (dxyVar.h()) {
            d(dxyVar, linearLayout, healthTextView, linearLayout2);
        } else if (dxyVar.h() || this.p >= 3) {
            LogUtil.j("CardDeviceAdapter", "startReconnect else, mReconnectCount = ", Integer.valueOf(this.p));
        } else {
            d(dxyVar, linearLayout, healthTextView, linearLayout2);
            this.p++;
        }
    }

    private void d(dxy dxyVar, LinearLayout linearLayout, HealthTextView healthTextView, LinearLayout linearLayout2) {
        int i = this.o;
        if (i == 1) {
            this.j.d(dxyVar.d());
        } else if (i == 2) {
            this.d.d(dxyVar.d());
        } else if (i == 3) {
            this.n.b(dxyVar.d());
        } else {
            LogUtil.j("CardDeviceAdapter", "setReconnectDevice else");
        }
        c(true);
        ReleaseLogUtil.d("R_CardDeviceAdapter", "connectDeviceView mPageType = ", Integer.valueOf(this.o));
        this.l.onReconnect(dxyVar);
        healthTextView.setVisibility(8);
        linearLayout.setVisibility(8);
        linearLayout2.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this.f25237c).a(this.f25237c.getResources().getString(R.string.IDS_main_device_ota_error_message)).c(R.string.IDS_user_permission_know, new View.OnClickListener() { // from class: rog
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogUtil.a("CardDeviceAdapter", "showTipDialog，click known button");
            }
        }).c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    public void c() {
        LogUtil.a("CardDeviceAdapter", "mReconnectCount = ", Integer.valueOf(this.p));
        this.p = 0;
    }

    public int a() {
        LogUtil.a("CardDeviceAdapter", "mReconnectCount = ", Integer.valueOf(this.p));
        return this.p;
    }

    public void c(boolean z) {
        this.i = z;
        LogUtil.a("CardDeviceAdapter", "enter mIsConnecting ", Boolean.valueOf(z));
    }

    public boolean d() {
        return this.i;
    }

    public static class CardDeviceViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public dxy f25259a;
        HealthTextView aa;
        RelativeLayout ab;
        LinearLayout ac;
        LinearLayout ad;
        HealthTextView ae;
        ImageView af;
        RelativeLayout ag;
        ImageView ah;
        HealthTextView ai;
        HealthTextView aj;
        LinearLayout an;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ImageView f25260b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        RelativeLayout f25261c;
        RelativeLayout d;
        HealthCardView e;
        HealthTextView f;
        RelativeLayout g;
        LinearLayout h;
        HealthTextView i;
        ImageView j;
        RelativeLayout k;
        LinearLayout l;
        ImageView m;
        HealthTextView n;
        ImageView o;
        ImageView p;
        HealthProgressBar q;
        HealthTextView r;
        RelativeLayout s;
        LinearLayout t;
        HealthTextView u;
        HealthTextView v;
        LinearLayout w;
        HealthTextView x;
        HealthTextView y;
        HealthTextView z;

        public CardDeviceViewHolder(View view) {
            super(view);
            this.j = (ImageView) view.findViewById(R.id.equipment_image);
            this.f25260b = (ImageView) view.findViewById(R.id.equipment_image_cloud);
            this.o = (ImageView) view.findViewById(R.id.equipment_three_image);
            this.p = (ImageView) view.findViewById(R.id.achieve_user_device_red_dot);
            this.af = (ImageView) view.findViewById(R.id.sport_equipment_red_dot);
            this.f = (HealthTextView) view.findViewById(R.id.equipment_name);
            this.i = (HealthTextView) view.findViewById(R.id.equipment_connect_state);
            this.ai = (HealthTextView) view.findViewById(R.id.tripartite_equipment_name);
            this.ae = (HealthTextView) view.findViewById(R.id.tripartite_equipment_Describe);
            this.ah = (ImageView) view.findViewById(R.id.tripartite_device_red_dot);
            this.w = (LinearLayout) view.findViewById(R.id.reconnect_loading_layout);
            this.x = (HealthTextView) view.findViewById(R.id.reconnect_loading_text);
            HealthProgressBar healthProgressBar = (HealthProgressBar) view.findViewById(R.id.reconnect_loading_img);
            this.q = healthProgressBar;
            healthProgressBar.setLayerType(1, null);
            this.y = (HealthTextView) view.findViewById(R.id.retry_connect);
            this.u = (HealthTextView) view.findViewById(R.id.retry_connect_oversea);
            this.l = (LinearLayout) view.findViewById(R.id.equipment_power);
            this.t = (LinearLayout) view.findViewById(R.id.left_earphone_power_layout);
            this.ad = (LinearLayout) view.findViewById(R.id.right_earphone_power_layout);
            this.r = (HealthTextView) view.findViewById(R.id.left_earphone_power_size);
            this.v = (HealthTextView) view.findViewById(R.id.right_earphone_power_size);
            this.n = (HealthTextView) view.findViewById(R.id.equipment_power_size);
            this.m = (ImageView) view.findViewById(R.id.equipment_power_pic);
            this.s = (RelativeLayout) view.findViewById(R.id.personal_equipment_layout);
            this.d = (RelativeLayout) view.findViewById(R.id.card_equipment_layout);
            this.k = (RelativeLayout) view.findViewById(R.id.equipment_layout);
            this.h = (LinearLayout) view.findViewById(R.id.equipment_connect);
            this.ag = (RelativeLayout) view.findViewById(R.id.tripartite_equipment_layout);
            this.e = (HealthCardView) view.findViewById(R.id.device_card_more_card_view);
            this.f25261c = (RelativeLayout) view.findViewById(R.id.device_left_icon);
            this.an = (LinearLayout) view.findViewById(R.id.wear_status_layout);
            this.aa = (HealthTextView) view.findViewById(R.id.sport_equipment_name);
            this.z = (HealthTextView) view.findViewById(R.id.sport_num_tv);
            this.ac = (LinearLayout) view.findViewById(R.id.sport_equipment_bg_layout);
            this.g = (RelativeLayout) view.findViewById(R.id.equipment_name_layout);
            this.ab = (RelativeLayout) view.findViewById(R.id.sport_equipment_name_layout);
            this.aj = (HealthTextView) view.findViewById(R.id.wear_place);
        }
    }

    public static class MoreViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        RelativeLayout f25262b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        LinearLayout f25263c;
        RelativeLayout d;
        ImageView e;

        public MoreViewHolder(View view) {
            super(view);
            this.f25263c = (LinearLayout) view.findViewById(R.id.device_card_more_layout);
            this.e = (ImageView) view.findViewById(R.id.device_card_more_img);
            this.d = (RelativeLayout) view.findViewById(R.id.device_equipment_layout);
            this.f25262b = (RelativeLayout) view.findViewById(R.id.device_left_icon);
        }
    }

    private void b(CardDeviceViewHolder cardDeviceViewHolder) {
        LogUtil.a("CardDeviceAdapter", "updateResourceInfoUnEnable disconnected");
        cardDeviceViewHolder.i.setAlpha(0.38f);
        cardDeviceViewHolder.f.setAlpha(0.38f);
        cardDeviceViewHolder.j.setAlpha(0.38f);
    }

    private void e(CardDeviceViewHolder cardDeviceViewHolder) {
        LogUtil.a("CardDeviceAdapter", "updateResourceInfoEnable connected");
        cardDeviceViewHolder.i.setAlpha(1.0f);
        cardDeviceViewHolder.f.setAlpha(1.0f);
        cardDeviceViewHolder.j.setAlpha(1.0f);
    }
}
