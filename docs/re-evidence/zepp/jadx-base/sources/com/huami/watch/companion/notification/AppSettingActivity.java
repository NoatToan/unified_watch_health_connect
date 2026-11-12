package com.huami.watch.companion.notification;

import android.R;
import android.app.Activity;
import android.app.LoaderManager;
import android.content.AsyncTaskLoader;
import android.content.Context;
import android.content.Loader;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.config.Config;
import com.huami.watch.companion.event.NotificationBlacklistChangedEvent;
import com.huami.watch.companion.notification.AppSettingActivity;
import com.huami.watch.companion.ui.view.ActionbarLayout;
import com.huami.watch.companion.util.AlphaPinYinComparator;
import com.huami.watch.companion.util.BitmapUtil;
import com.huami.watch.hmwatchmanager.view.AlertDialogFragment;
import com.huami.watch.util.DeviceCompatibility;
import com.huami.watch.util.Log;
import com.huami.watch.util.Rx;
import com.huami.watch.util.RxBus;
import com.xiaomi.mipush.sdk.Constants;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes16.dex */
public class AppSettingActivity extends Activity implements LoaderManager.LoaderCallbacks<List<ApplicationInfo>> {
    private static final String q = "Noti-SettingActivity";
    private static final int r = 0;
    private static final int s = 1;
    private static final int t = 3;
    private static final int u = 4;
    private static final int v = 5;
    private static final int w = 6;
    private static final int x = 7;
    private RecyclerView a;
    private AlertDialogFragment b;
    private c c;
    private int d;
    private int e;
    private int f;
    private PackageManager g;
    private NotificationManager h;
    private AlphaPinYinComparator k;
    private Disposable m;
    private Disposable n;
    private boolean o;
    private boolean p;
    private final List<ApplicationInfo> i = new ArrayList();
    private final List<ApplicationInfo> j = new ArrayList();
    private final Object l = new Object();

    public static class AppEntry {
        private final Context a;
        private final PackageManager b;
        private final ApplicationInfo c;
        private final File d;
        private String e;
        private Drawable f;
        private boolean g;

        public AppEntry(Context context, PackageManager packageManager, ApplicationInfo applicationInfo) {
            this.a = context;
            this.b = packageManager;
            this.c = applicationInfo;
            this.d = new File(applicationInfo.sourceDir);
        }

        public void b() {
            if (this.e == null || !this.g) {
                if (this.d.exists()) {
                    this.g = true;
                    this.e = this.c.loadLabel(this.b).toString();
                } else {
                    this.g = false;
                    this.e = this.c.packageName;
                }
            }
        }

        public Drawable getIcon() {
            Drawable drawable = this.f;
            if (drawable == null) {
                if (this.d.exists()) {
                    Drawable drawableLoadIcon = this.c.loadIcon(this.b);
                    this.f = drawableLoadIcon;
                    return drawableLoadIcon;
                }
                this.g = false;
            } else {
                if (this.g) {
                    return drawable;
                }
                if (this.d.exists()) {
                    this.g = true;
                    Drawable drawableLoadIcon2 = this.c.loadIcon(this.b);
                    this.f = drawableLoadIcon2;
                    return drawableLoadIcon2;
                }
            }
            return this.a.getResources().getDrawable(R.drawable.sym_def_app_icon);
        }

        public String getLabel() {
            return this.e;
        }

        public String getPackageName() {
            return this.c.packageName;
        }

        @NonNull
        public String toString() {
            return this.e;
        }
    }

    public static class AppListLoader extends AsyncTaskLoader<List<ApplicationInfo>> {
        private static final String c = "Noti-SettingActivity-Loader";
        public final PackageManager a;
        public List<ApplicationInfo> b;

        public AppListLoader(Context context) {
            super(context);
            this.a = getContext().getPackageManager();
        }

        public void a() {
        }

        @Override // android.content.Loader
        public void onReset() {
            Log.d(c, "OnRest", new Object[0]);
            onStopLoading();
            if (this.b != null) {
                a();
                this.b = null;
            }
        }

        @Override // android.content.Loader
        public void onStartLoading() {
            Log.d(c, "OnStartLoading!!", new Object[0]);
            List<ApplicationInfo> installedPackages = NotificationManager.getInstalledPackages(getContext(), 0);
            this.b = installedPackages;
            if (installedPackages != null) {
                if (Config.isTestMode()) {
                    try {
                        StringBuilder sb = new StringBuilder();
                        for (ApplicationInfo applicationInfo : this.b) {
                            sb.append(applicationInfo.packageName);
                            sb.append(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                            sb.append(applicationInfo.loadLabel(this.a));
                            sb.append(",");
                        }
                        Log.f().d(c, "Load All Apps : " + sb.toString(), new Object[0]);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                Log.d(c, "Load All Apps Count : " + this.b.size(), new Object[0]);
                deliverResult(this.b);
            }
            if (takeContentChanged() || this.b == null) {
                forceLoad();
            }
        }

        @Override // android.content.Loader
        public void onStopLoading() {
            Log.d(c, "OnStopLoading!!", new Object[0]);
            cancelLoad();
        }

        @Override // android.content.Loader
        public void deliverResult(List<ApplicationInfo> list) {
            Log.d(c, "DeliverResult, isRest : " + isReset() + ", isStarted : " + isStarted(), new Object[0]);
            if (isReset() && list != null) {
                a();
            }
            this.b = list;
            if (isStarted()) {
                super.deliverResult(list);
            }
            if (list != null) {
                a();
            }
        }

        @Override // android.content.AsyncTaskLoader
        public List<ApplicationInfo> loadInBackground() throws Throwable {
            Log.d(c, "LoadInBackground!!", new Object[0]);
            List<ApplicationInfo> installedPackagesFallback = NotificationManager.getInstalledPackagesFallback(getContext(), 0);
            Log.d(c, "Load All Apps(fallback) Count : " + installedPackagesFallback.size(), new Object[0]);
            return installedPackagesFallback;
        }

        @Override // android.content.AsyncTaskLoader
        public void onCanceled(List<ApplicationInfo> list) {
            Log.d(c, "OnCanceled!!", new Object[0]);
            a();
        }
    }

    public class a extends b {
        public ImageView c;
        public TextView d;
        public Switch e;
        public View f;

        public a(View view) {
            super(view);
            this.c = (ImageView) view.findViewById(com.huami.watch.companion.R.id.app_icon);
            this.d = (TextView) view.findViewById(com.huami.watch.companion.R.id.app_name);
            this.e = (Switch) view.findViewById(com.huami.watch.companion.R.id.app_switch);
            this.f = view.findViewById(com.huami.watch.companion.R.id.click_area);
        }
    }

    public class b extends RecyclerView.ViewHolder {
        private String a;

        public b(View view) {
            super(view);
        }

        public String a() {
            return this.a;
        }

        public void b(String str) {
            this.a = str;
        }
    }

    public class c extends RecyclerView.Adapter<b> {
        private PackageManager a;

        public c() {
            this.a = AppSettingActivity.this.getPackageManager();
        }

        private boolean e(AppEntry appEntry) {
            return appEntry.c.icon != 0;
        }

        private Uri f(AppEntry appEntry) {
            Uri uri;
            try {
                if (e(appEntry)) {
                    uri = Uri.parse("android.resource://" + appEntry.c.packageName + "/drawable/" + appEntry.c.icon);
                } else {
                    uri = Uri.parse("android.resource://" + appEntry.c.packageName + "/drawable/" + R.drawable.sym_def_app_icon);
                }
                return uri;
            } catch (Exception e) {
                e.printStackTrace();
                return Uri.EMPTY;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void g(int i, b bVar, View view) {
            if (i == 5) {
                int iD = d(bVar.getAdapterPosition(), 5);
                if (iD < 0 || iD > AppSettingActivity.this.e - 1 || !((ApplicationInfo) AppSettingActivity.this.i.get(iD)).packageName.equals(bVar.a())) {
                    Log.d(AppSettingActivity.q, "You may click one of the item more than once!", new Object[0]);
                    return;
                }
                ApplicationInfo applicationInfo = (ApplicationInfo) AppSettingActivity.this.i.get(iD);
                if (AppSettingActivity.this.h.isInUserWhitelist(applicationInfo.packageName)) {
                    AppSettingActivity.this.h.removeApp(applicationInfo.packageName);
                } else {
                    NotificationApp notificationApp = new NotificationApp();
                    notificationApp.packageName = applicationInfo.packageName;
                    AppSettingActivity.this.h.addApp(notificationApp);
                }
                AppSettingActivity.this.j.add(applicationInfo);
                Collections.sort(AppSettingActivity.this.j, AppSettingActivity.this.k);
                AppSettingActivity.this.i.remove(iD);
                AppSettingActivity.this.e--;
                notifyDataSetChanged();
                return;
            }
            int iD2 = d(bVar.getAdapterPosition(), 1);
            if (iD2 < 0 || iD2 > AppSettingActivity.this.j.size() - 1 || !((ApplicationInfo) AppSettingActivity.this.j.get(iD2)).packageName.equals(bVar.a())) {
                Log.d(AppSettingActivity.q, "You may click one of the item more than once!", new Object[0]);
                return;
            }
            ApplicationInfo applicationInfo2 = (ApplicationInfo) AppSettingActivity.this.j.get(iD2);
            if ((AppSettingActivity.this.h.isInUserBlacklist(applicationInfo2.packageName) && AppSettingActivity.this.h.isInSmartFilterWhitelist(applicationInfo2.packageName)) || "com.huami.watch.hmwatchmanager".equals(applicationInfo2.packageName)) {
                AppSettingActivity.this.h.removeApp(applicationInfo2.packageName);
            } else {
                NotificationApp notificationApp2 = new NotificationApp();
                notificationApp2.packageName = applicationInfo2.packageName;
                notificationApp2.on = true;
                AppSettingActivity.this.h.addApp(notificationApp2);
            }
            AppSettingActivity.this.i.add(applicationInfo2);
            Collections.sort(AppSettingActivity.this.i, AppSettingActivity.this.k);
            AppSettingActivity.this.j.remove(iD2);
            AppSettingActivity.this.e++;
            notifyDataSetChanged();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void h(boolean z, View view) {
            AppSettingActivity.this.h.setSmartFilterON(!z);
            AppSettingActivity.this.J();
            AppSettingActivity.this.getLoaderManager().restartLoader(0, null, AppSettingActivity.this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void i(View view) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (ApplicationInfo applicationInfo : AppSettingActivity.this.i) {
                if (AppSettingActivity.this.h.isInUserWhitelist(applicationInfo.packageName)) {
                    arrayList2.add(applicationInfo.packageName);
                } else {
                    NotificationApp notificationApp = new NotificationApp();
                    notificationApp.packageName = applicationInfo.packageName;
                    arrayList.add(notificationApp);
                }
            }
            AppSettingActivity.this.h.removeAllApps(arrayList2);
            AppSettingActivity.this.h.addAllApps(arrayList);
            AppSettingActivity.this.j.addAll(AppSettingActivity.this.i);
            AppSettingActivity.this.i.clear();
            AppSettingActivity.this.e = 0;
            Collections.sort(AppSettingActivity.this.j, AppSettingActivity.this.k);
            notifyDataSetChanged();
        }

        public int d(int i, int i2) {
            if (i2 == 5) {
                return i - 1;
            }
            if (i2 == 1) {
                return AppSettingActivity.this.e == 0 ? i - 3 : (i - AppSettingActivity.this.e) - 2;
            }
            return 0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: getItemCount */
        public int getPagerCount() {
            if (AppSettingActivity.this.d == 0) {
                return 5;
            }
            return (AppSettingActivity.this.e == 0 || AppSettingActivity.this.e == AppSettingActivity.this.d) ? AppSettingActivity.this.d + 4 : AppSettingActivity.this.d + 3;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            if (i == 0) {
                return 4;
            }
            if (i == getPagerCount() - 1) {
                return 7;
            }
            if (AppSettingActivity.this.e != 0) {
                AppSettingActivity appSettingActivity = AppSettingActivity.this;
                appSettingActivity.f = appSettingActivity.e + 1;
            } else {
                AppSettingActivity.this.f = 2;
            }
            if (i < AppSettingActivity.this.f) {
                return AppSettingActivity.this.e != 0 ? 5 : 6;
            }
            if (i == AppSettingActivity.this.f) {
                return 0;
            }
            return AppSettingActivity.this.d - AppSettingActivity.this.e > 0 ? 1 : 3;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NonNull final b bVar, int i) {
            AppEntry appEntry;
            final int itemViewType = getItemViewType(i);
            if (itemViewType != 1 && itemViewType != 5) {
                if (itemViewType == 7) {
                    final boolean zIsSmartFilterON = AppSettingActivity.this.h.isSmartFilterON();
                    d dVar = (d) bVar;
                    dVar.c.setChecked(zIsSmartFilterON);
                    dVar.d.setOnClickListener(new View.OnClickListener() { // from class: com.huami.watch.companion.notification.c
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.a.h(zIsSmartFilterON, view);
                        }
                    });
                    return;
                }
                if (itemViewType == 4) {
                    View view = ((e) bVar).c;
                    if (AppSettingActivity.this.i.size() == 0) {
                        view.setEnabled(false);
                        view.setAlpha(0.36f);
                        return;
                    } else {
                        view.setEnabled(true);
                        view.setAlpha(0.87f);
                        view.setOnClickListener(new View.OnClickListener() { // from class: com.huami.watch.companion.notification.a
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                this.a.i(view2);
                            }
                        });
                        return;
                    }
                }
                return;
            }
            if (itemViewType == 1) {
                appEntry = new AppEntry(AppSettingActivity.this, this.a, (ApplicationInfo) AppSettingActivity.this.j.get(d(i, 1)));
            } else {
                int iD = d(i, 5);
                if (iD >= AppSettingActivity.this.i.size()) {
                    return;
                }
                AppSettingActivity appSettingActivity = AppSettingActivity.this;
                appEntry = new AppEntry(appSettingActivity, this.a, (ApplicationInfo) appSettingActivity.i.get(iD));
            }
            appEntry.b();
            bVar.b(appEntry.getPackageName());
            if (AppSettingActivity.this.o || AppSettingActivity.this.p) {
                Drawable drawableH = null;
                try {
                    drawableH = AppSettingActivity.H(AppSettingActivity.this, appEntry);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                ((a) bVar).c.setImageDrawable(drawableH);
            } else {
                Glide.with((Activity) AppSettingActivity.this).load(f(appEntry)).apply(new RequestOptions().diskCacheStrategy(DiskCacheStrategy.NONE).skipMemoryCache(false)).into(((a) bVar).c);
            }
            a aVar = (a) bVar;
            aVar.d.setText(appEntry.getLabel());
            Switch r1 = aVar.e;
            r1.setChecked(itemViewType != 1);
            r1.setEnabled(false);
            aVar.f.setOnClickListener(new View.OnClickListener() { // from class: com.huami.watch.companion.notification.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.a.g(itemViewType, bVar, view2);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public b onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            if (i == 0) {
                return AppSettingActivity.this.new b(LayoutInflater.from(viewGroup.getContext()).inflate(com.huami.watch.companion.R.layout.item_blacklist_black_title, viewGroup, false));
            }
            if (i != 1) {
                if (i != 3) {
                    if (i == 4) {
                        return AppSettingActivity.this.new e(LayoutInflater.from(viewGroup.getContext()).inflate(com.huami.watch.companion.R.layout.item_blacklist_white_title, viewGroup, false));
                    }
                    if (i != 5) {
                        if (i != 6) {
                            if (i != 7) {
                                return null;
                            }
                            return AppSettingActivity.this.new d(LayoutInflater.from(viewGroup.getContext()).inflate(com.huami.watch.companion.R.layout.item_blacklist_smart_filter, viewGroup, false));
                        }
                    }
                }
                return AppSettingActivity.this.new b(LayoutInflater.from(viewGroup.getContext()).inflate(com.huami.watch.companion.R.layout.item_blacklist_no_app, viewGroup, false));
            }
            return AppSettingActivity.this.new a(LayoutInflater.from(viewGroup.getContext()).inflate(com.huami.watch.companion.R.layout.list_item_notification_setting, viewGroup, false));
        }
    }

    public class d extends b {
        public Switch c;
        public View d;

        public d(View view) {
            super(view);
            this.c = (Switch) view.findViewById(com.huami.watch.companion.R.id.app_switch);
            this.d = view.findViewById(com.huami.watch.companion.R.id.click_area);
        }
    }

    public class e extends b {
        public View c;

        public e(View view) {
            super(view);
            this.c = view.findViewById(com.huami.watch.companion.R.id.disallow_all);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A() throws Exception {
        w();
        c cVar = this.c;
        if (cVar != null) {
            cVar.notifyDataSetChanged();
            return;
        }
        c cVar2 = new c();
        this.c = cVar2;
        this.a.setAdapter(cVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B(View view) {
        onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C() {
        this.o = DeviceCompatibility.isSamsungPhone();
        this.p = DeviceCompatibility.isO();
        getLoaderManager().initLoader(0, null, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D() {
        this.a.post(new Runnable() { // from class: yh
            @Override // java.lang.Runnable
            public final void run() {
                this.a.C();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E(Object obj) throws Exception {
        if (obj instanceof NotificationBlacklistChangedEvent) {
            I((NotificationBlacklistChangedEvent) obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String F() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void G(Throwable th) throws Exception {
        HMLog.warn(q, th, new Function0() { // from class: bi
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AppSettingActivity.F();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public static Drawable H(Context context, AppEntry appEntry) {
        Drawable icon = appEntry.getIcon();
        RoundedBitmapDrawable roundedBitmapDrawableCreate = RoundedBitmapDrawableFactory.create(context.getResources(), BitmapUtil.drawableToBitmap(icon));
        roundedBitmapDrawableCreate.setCornerRadius(roundedBitmapDrawableCreate.getIntrinsicHeight() / 2.0f);
        return icon;
    }

    private void I(NotificationBlacklistChangedEvent notificationBlacklistChangedEvent) {
        Log.d(q, "OnBlacklistAddedEvent Received : " + notificationBlacklistChangedEvent.mPkgName, new Object[0]);
        getLoaderManager().restartLoader(0, null, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        w();
        AlertDialogFragment alertDialogFragmentNewInstance = AlertDialogFragment.newInstance(2);
        this.b = alertDialogFragmentNewInstance;
        alertDialogFragmentNewInstance.setMessage(getString(com.huami.watch.companion.R.string.noti_loading_app_list));
        this.b.setCancelable(false);
        this.b.show(getFragmentManager(), "LoadingAppList");
    }

    private Disposable v(final List<ApplicationInfo> list) {
        return Rx.io(new Runnable() { // from class: ai
            @Override // java.lang.Runnable
            public final void run() {
                this.a.z(list);
            }
        }).safeSubscribe(new Action() { // from class: vh
            @Override // io.reactivex.functions.Action
            public final void run() throws Exception {
                this.a.A();
            }
        });
    }

    private void w() {
        AlertDialogFragment alertDialogFragment = this.b;
        if (alertDialogFragment != null) {
            try {
                alertDialogFragment.dismissAllowingStateLoss();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            this.b = null;
        }
    }

    private List<ApplicationInfo> x(List<ApplicationInfo> list) {
        ArrayList arrayList = new ArrayList();
        List<NotificationApp> allApps = this.h.getAllApps();
        boolean z = false;
        for (ApplicationInfo applicationInfo : list) {
            if (!this.h.isInSmartFilterBlacklist(applicationInfo.packageName)) {
                Iterator<NotificationApp> it2 = allApps.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        if (!z && "com.huami.watch.hmwatchmanager".equals(applicationInfo.packageName)) {
                            z = true;
                            break;
                        }
                        if (!this.h.isInSmartFilterWhitelist(applicationInfo.packageName)) {
                            if (this.h.isSmartFilterON()) {
                                if (this.g.getLaunchIntentForPackage(applicationInfo.packageName) == null) {
                                    break;
                                }
                            }
                            arrayList.add(applicationInfo);
                            break;
                        }
                        break;
                    }
                    NotificationApp next = it2.next();
                    if (applicationInfo.packageName.startsWith(next.packageName)) {
                        if (!next.on) {
                            arrayList.add(applicationInfo);
                            break;
                        }
                        break;
                    }
                }
            }
        }
        return arrayList;
    }

    private List<ApplicationInfo> y(List<ApplicationInfo> list) {
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (ApplicationInfo applicationInfo : list) {
            if (!z && "com.huami.watch.hmwatchmanager".equals(applicationInfo.packageName)) {
                z = true;
            } else if (!this.h.isAppFiltered(applicationInfo.packageName, null, false)) {
                arrayList.add(applicationInfo);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z(List list) {
        synchronized (this.l) {
            if (this.k == null) {
                this.k = new AlphaPinYinComparator(getPackageManager());
            }
            List<ApplicationInfo> listY = y(list);
            Collections.sort(listY, this.k);
            this.i.clear();
            this.i.addAll(listY);
            List<ApplicationInfo> listX = x(list);
            Collections.sort(listX, this.k);
            this.j.clear();
            this.j.addAll(listX);
            this.e = this.i.size();
            this.d = this.i.size() + this.j.size();
            Log.d(q, "AllApps Count : " + this.d + ", W : " + this.e + ", B : " + this.j.size(), new Object[0]);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(com.huami.watch.companion.R.layout.activity_app_setting);
        DeviceCompatibility.setStatusBarDarkMode(this, true);
        ActionbarLayout actionbarLayout = (ActionbarLayout) findViewById(com.huami.watch.companion.R.id.actionbar);
        actionbarLayout.setBackArrowClickListener(new View.OnClickListener() { // from class: uh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.B(view);
            }
        });
        actionbarLayout.setTitleText(getString(com.huami.watch.companion.R.string.noti_app_blacklist_setting));
        RecyclerView recyclerView = (RecyclerView) findViewById(com.huami.watch.companion.R.id.app_list);
        this.a = recyclerView;
        recyclerView.setHasFixedSize(true);
        this.a.setLayoutManager(new LinearLayoutManager(this));
        this.a.addItemDecoration(new RecyclerViewDivider(this, this, 0, com.huami.watch.companion.R.drawable.divider_settings_item));
        this.g = getPackageManager();
        this.h = NotificationManager.getManager(this);
        J();
        this.a.post(new Runnable() { // from class: zh
            @Override // java.lang.Runnable
            public final void run() {
                this.a.D();
            }
        });
        this.n = RxBus.get().toObservable().subscribe(new Consumer() { // from class: wh
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.E(obj);
            }
        }, new Consumer() { // from class: xh
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                AppSettingActivity.G((Throwable) obj);
            }
        });
    }

    @Override // android.app.LoaderManager.LoaderCallbacks
    public Loader<List<ApplicationInfo>> onCreateLoader(int i, Bundle bundle) {
        Log.d(q, "AsyncTaskLoader Callback : OnCreateLoader!!", new Object[0]);
        return new AppListLoader(this);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        Disposable disposable = this.m;
        if (disposable != null) {
            disposable.dispose();
            this.m = null;
        }
        Disposable disposable2 = this.n;
        if (disposable2 != null) {
            disposable2.dispose();
            this.n = null;
        }
        super.onDestroy();
    }

    @Override // android.app.LoaderManager.LoaderCallbacks
    public void onLoaderReset(Loader<List<ApplicationInfo>> loader) {
        Log.d(q, "AsyncTaskLoader Callback : OnLoaderReset!!", new Object[0]);
        c cVar = this.c;
        if (cVar != null) {
            cVar.notifyDataSetChanged();
        }
    }

    @Override // android.app.LoaderManager.LoaderCallbacks
    public void onLoadFinished(Loader<List<ApplicationInfo>> loader, List<ApplicationInfo> list) {
        Log.i(q, "AsyncTaskLoader Callback : OnLoadFinished!!", new Object[0]);
        Disposable disposable = this.m;
        if (disposable != null) {
            disposable.dispose();
            this.m = null;
        }
        this.m = v(list);
    }

    public class RecyclerViewDivider extends RecyclerView.ItemDecoration {
        private Drawable a;
        private int b;
        private int c;
        private final int[] d;

        public RecyclerViewDivider(Context context, int i) {
            this.b = 1;
            int[] iArr = {R.attr.listDivider};
            this.d = iArr;
            if (i != 1 && i != 0) {
                throw new IllegalArgumentException("请输入正确的参数！");
            }
            this.c = i;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
            this.a = typedArrayObtainStyledAttributes.getDrawable(0);
            typedArrayObtainStyledAttributes.recycle();
        }

        private void drawHorizontal(Canvas canvas, RecyclerView recyclerView) {
            int paddingLeft = recyclerView.getPaddingLeft();
            int measuredWidth = recyclerView.getMeasuredWidth() - recyclerView.getPaddingRight();
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (i != childCount - 2 && i != AppSettingActivity.this.f - 1) {
                    View childAt = recyclerView.getChildAt(i);
                    int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) childAt.getLayoutParams())).bottomMargin;
                    int i2 = this.b + bottom;
                    if (i == childCount - 1) {
                        Drawable drawable = ContextCompat.getDrawable(AppSettingActivity.this, com.huami.watch.companion.R.drawable.divider_width_match_parent);
                        if (drawable != null) {
                            drawable.setBounds(paddingLeft, bottom, measuredWidth, i2);
                        }
                        if (drawable != null) {
                            drawable.draw(canvas);
                            return;
                        }
                        return;
                    }
                    Drawable drawable2 = this.a;
                    if (drawable2 != null) {
                        drawable2.setBounds(paddingLeft, bottom, measuredWidth, i2);
                        this.a.draw(canvas);
                    }
                }
            }
        }

        private void drawVertical(Canvas canvas, RecyclerView recyclerView) {
            int paddingTop = recyclerView.getPaddingTop();
            int measuredHeight = recyclerView.getMeasuredHeight() - recyclerView.getPaddingBottom();
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (i != childCount - 1 && i != AppSettingActivity.this.f) {
                    View childAt = recyclerView.getChildAt(i);
                    int right = childAt.getRight() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) childAt.getLayoutParams())).rightMargin;
                    int i2 = this.b + right;
                    Drawable drawable = this.a;
                    if (drawable != null) {
                        drawable.setBounds(right, paddingTop, i2, measuredHeight);
                        this.a.draw(canvas);
                    }
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
            super.getItemOffsets(rect, view, recyclerView, state);
            rect.set(0, 0, 0, this.b);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
            super.onDraw(canvas, recyclerView, state);
            if (this.c == 1) {
                drawVertical(canvas, recyclerView);
            } else {
                drawHorizontal(canvas, recyclerView);
            }
        }

        public RecyclerViewDivider(AppSettingActivity appSettingActivity, Context context, int i, int i2) {
            this(context, i);
            Drawable drawable = ContextCompat.getDrawable(context, i2);
            this.a = drawable;
            if (drawable != null) {
                this.b = drawable.getIntrinsicHeight();
            }
        }
    }
}
