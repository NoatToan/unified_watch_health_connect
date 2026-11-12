package defpackage;

import android.content.ContentValues;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.ViewModelProvider;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.device.callback.BitmapCallBack;
import com.huawei.ui.homehealth.devicearkui.delegate.DeviceViewDelegate;
import com.huawei.ui.homehealth.devicearkui.viewmodel.DeviceListViewModel;
import com.huawei.ui.homehealth.devicearkui.viewmodel.DeviceProtectViewModel;
import health.compact.a.UnitUtil;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: classes17.dex */
public class ryd extends DeviceViewDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LinearLayout f47836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DeviceListViewModel f47837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final DeviceProtectViewModel f47838c;
    private DeviceInfo d;
    private List<dru> e;
    private HealthTextView f;
    private LinearLayout g;
    private LinearLayout h;

    public ryd(ComponentActivity componentActivity) {
        super(componentActivity);
        this.e = new ArrayList();
        this.f47838c = (DeviceProtectViewModel) new ViewModelProvider(componentActivity).get(DeviceProtectViewModel.class);
        this.f47837b = (DeviceListViewModel) new ViewModelProvider(componentActivity).get(DeviceListViewModel.class);
    }

    @Override // com.huawei.ui.homehealth.devicearkui.delegate.BaseViewDelegate
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.custom_list_item_device_choice, viewGroup, false);
        this.g = (LinearLayout) viewInflate.findViewById(R.id.tab_all_device_layout);
        this.h = (LinearLayout) viewInflate.findViewById(R.id.tab_device_item_layout);
        this.f = (HealthTextView) viewInflate.findViewById(R.id.tab_title);
        this.f47836a = (LinearLayout) viewInflate.findViewById(R.id.device_icon_layout);
        a();
        return viewInflate;
    }

    private void a() {
        this.f47838c.e(new DeviceProtectViewModel.DeviceListUpdateCallback() { // from class: ryd.4
            @Override // com.huawei.ui.homehealth.devicearkui.viewmodel.DeviceProtectViewModel.DeviceListUpdateCallback
            public void onDeviceListUpdate(List<dru> list) {
                ryd.this.a(list);
            }
        });
        this.h.setOnClickListener(new View.OnClickListener() { // from class: ryd.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ryd.this.f47837b.e();
            }
        });
        this.f47838c.e();
    }

    @Override // com.huawei.ui.homehealth.devicearkui.delegate.DeviceViewDelegate
    public void updateDevice(DeviceInfo deviceInfo) {
        this.d = deviceInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final List<dru> list) {
        this.activity.runOnUiThread(new Runnable() { // from class: ryd.3
            @Override // java.lang.Runnable
            public void run() {
                List listE = ryd.this.e((List<dru>) list);
                if (CollectionUtils.a(listE)) {
                    LogUtil.j("DeviceListDelegate", "refreshView topProductInfoList isEmpty.");
                    ryd.this.e = listE;
                    ryd.this.g.setVisibility(8);
                    ryd.this.f47837b.a(false);
                    return;
                }
                LogUtil.a("DeviceListDelegate", "refreshView productInfoList:", Integer.valueOf(listE.size()));
                ryd.this.g.setVisibility(0);
                ryd.this.f47837b.a(true);
                ryd.this.f.setText(qre.a(R.string.IDS_all_devices_num, UnitUtil.e(list.size(), 1, 0)));
                if (ryd.this.c((List<dru>) listE)) {
                    ryd.this.e = listE;
                    ryd.this.d((List<dru>) listE);
                } else {
                    LogUtil.a("DeviceListDelegate", "refreshView isNeedRefresh return false");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(List<dru> list) {
        if (this.e.size() != list.size()) {
            return true;
        }
        for (int i = 0; i < list.size(); i++) {
            dru druVar = list.get(i);
            dru druVar2 = this.e.get(i);
            if (druVar.a() != null) {
                if (mig.c(druVar2.a(), druVar.a())) {
                    return true;
                }
            } else if (druVar.d() != null && (!mig.b(druVar2.d(), druVar.d()) || !Objects.equals(Long.valueOf(druVar2.c()), Long.valueOf(druVar.c())))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<dru> e(List<dru> list) {
        ArrayList arrayList = new ArrayList();
        if (!CollectionUtils.a(list)) {
            for (dru druVar : list) {
                if (!d(druVar)) {
                    arrayList.add(druVar);
                    if (arrayList.size() >= 3) {
                        break;
                    }
                }
            }
        }
        return arrayList;
    }

    private boolean d(dru druVar) {
        if (druVar.a() != null) {
            return mig.d(this.d, druVar.a());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(List<dru> list) {
        final List list2 = (List) list.stream().map(new Function() { // from class: rye
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f47845a.e((dru) obj);
            }
        }).collect(Collectors.toList());
        CompletableFuture.allOf((CompletableFuture[]) list2.toArray(new CompletableFuture[0])).thenApplyAsync(new Function() { // from class: ryh
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ryd.a(list2, (Void) obj);
            }
        }, (Executor) ThreadPoolManager.c()).thenAccept((Consumer<? super U>) new Consumer<List<Map.Entry<dru, Bitmap>>>() { // from class: ryd.5
            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void accept(List<Map.Entry<dru, Bitmap>> list3) {
                ryd.this.b(list3);
            }
        });
    }

    static /* synthetic */ List a(List list, Void r1) {
        return (List) list.stream().map(new Function() { // from class: ryf
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (Map.Entry) ((CompletableFuture) obj).join();
            }
        }).collect(Collectors.toList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public CompletableFuture<Map.Entry<dru, Bitmap>> e(final dru druVar) {
        final CompletableFuture<Map.Entry<dru, Bitmap>> completableFuture = new CompletableFuture<>();
        this.f47837b.e(druVar, new BitmapCallBack() { // from class: ryi
            @Override // com.huawei.ui.homehealth.device.callback.BitmapCallBack
            public final void onCallback(Bitmap bitmap) {
                completableFuture.complete(new AbstractMap.SimpleEntry(druVar, bitmap));
            }
        });
        return completableFuture;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final List<Map.Entry<dru, Bitmap>> list) {
        LogUtil.a("DeviceListDelegate", "enter showDeviceIcons");
        HandlerExecutor.b(new Runnable() { // from class: ryd.2
            @Override // java.lang.Runnable
            public void run() {
                ryd.this.f47836a.removeAllViews();
                if (CollectionUtils.a(list)) {
                    LogUtil.a("DeviceListDelegate", " showDeviceIcons infoItems is empty");
                    return;
                }
                for (Map.Entry entry : list) {
                    ryd.this.f47836a.addView(ryd.this.b((dru) entry.getKey(), (Bitmap) entry.getValue()));
                }
            }
        });
    }

    protected View b(final dru druVar, Bitmap bitmap) {
        View viewInflate = LayoutInflater.from(BaseApplication.b()).inflate(R.layout.device_icon_item_layout, (ViewGroup) null);
        FrameLayout frameLayout = (FrameLayout) viewInflate.findViewById(R.id.device_icon_layout);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.device_icon);
        ImageView imageView2 = (ImageView) viewInflate.findViewById(R.id.device_round_point);
        imageView.setImageBitmap(bitmap);
        if (b(druVar)) {
            imageView2.setBackground(qre.c(R.drawable.device_point_bg_connect));
        }
        if (c(druVar)) {
            imageView2.setVisibility(8);
        }
        LogUtil.a("DeviceListDelegate", "enter createItemView:", Integer.valueOf(druVar.e()));
        frameLayout.setOnClickListener(new View.OnClickListener() { // from class: ryd.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (!LoginInit.checkBaseServiceModel()) {
                    ryd.this.f47837b.d(ryd.this.activity, druVar);
                } else {
                    LogUtil.j("DeviceListDelegate", "onClick checkBaseServiceModel");
                }
            }
        });
        return viewInflate;
    }

    private boolean c(dru druVar) {
        ContentValues contentValuesD = druVar.d();
        if (contentValuesD == null) {
            LogUtil.a("DeviceListDelegate", "isScale contentValues is null");
            return false;
        }
        String asString = contentValuesD.getAsString("name");
        String asString2 = contentValuesD.getAsString("kind");
        boolean zEqualsIgnoreCase = "HDK_WEIGHT".equalsIgnoreCase(asString2);
        LogUtil.a("DeviceListDelegate", "isScale name:", asString, " deviceKind:", asString2, "  isScale:", Boolean.valueOf(zEqualsIgnoreCase));
        return zEqualsIgnoreCase;
    }

    private boolean b(dru druVar) {
        if (druVar == null) {
            return false;
        }
        if (druVar.a() != null) {
            return druVar.a().getDeviceConnectState() == 2;
        }
        druVar.d();
        return false;
    }
}
