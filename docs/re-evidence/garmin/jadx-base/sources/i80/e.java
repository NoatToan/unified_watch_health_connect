package i80;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupMenu;
import androidx.fragment.app.m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.developer.glogger.GloggerAdminActivity;
import com.garmin.android.apps.connectmobile.z1;
import f20.i;
import i3.d6;
import java.io.File;
import java.text.DateFormat;
import java.util.ArrayList;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Li80/e;", "Li80/c;", "Li80/g;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends i80.c implements g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String[] f92229f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f92230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public DateFormat f92231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Handler f92232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public short f92233d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public short f92234e;

    static {
        new a(null);
        f92229f = new String[]{"bytes", "KB", "MB", "GB", "TB"};
    }

    @Override // i80.g
    public final void R2(final f fVar, boolean z14, View view2) {
        PopupMenu popupMenu = new PopupMenu(new ContextThemeWrapper(getContext(), R.style.popupMenuStyle), view2);
        popupMenu.inflate(R.menu.log_file_popup_menu);
        if (z14) {
            popupMenu.getMenu().removeItem(R.id.menu_item_move_to_public_dir);
        }
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: i80.d
            @Override // android.widget.PopupMenu.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                f fVar2 = fVar;
                String str = fVar2.f92238b;
                String[] strArr = e.f92229f;
                File file = null;
                Integer numValueOf = menuItem != null ? Integer.valueOf(menuItem.getItemId()) : null;
                e eVar = this.f92227a;
                if (numValueOf != null && numValueOf.intValue() == R.id.menu_item_move_to_public_dir) {
                    m activity = eVar.getActivity();
                    activity.getClass();
                    GloggerAdminActivity gloggerAdminActivity = (GloggerAdminActivity) activity;
                    if (gloggerAdminActivity.f33667a != null) {
                        gloggerAdminActivity.aa(new String[]{str}, true);
                        gloggerAdminActivity.ba();
                        return true;
                    }
                    File fileA = pi1.b.a(gloggerAdminActivity, null);
                    if (fileA.exists() || fileA.mkdirs()) {
                        int i14 = gt2.c.f79010a;
                        gt2.b.a aVar = gt2.b.f79005a;
                        aVar.h("GloggerAdmin").debug("createPublicLogDir: publicDocumentsDirectory exists [" + fileA.getAbsolutePath() + "]");
                        if (fileA.canWrite()) {
                            File file2 = new File(fileA, "gcm_logs");
                            if (file2.exists()) {
                                file = file2;
                            } else if (file2.mkdir()) {
                                com.airbnb.lottie.animation.keyframe.a.u("createPublicLogDir: successfully created gcmLogsDir [", fileA.getAbsolutePath(), "]", aVar.h("GloggerAdmin"));
                                file = file2;
                            } else {
                                gloggerAdminActivity.ca("failed to create public GCM logs directory");
                            }
                        } else {
                            gloggerAdminActivity.ca("Cannot write to [" + fileA.getAbsolutePath() + "]");
                        }
                    } else {
                        gloggerAdminActivity.ca("Documents directory does not exist and could not be created");
                    }
                    if (file != null) {
                        gloggerAdminActivity.f33667a = file.getAbsolutePath();
                        gloggerAdminActivity.aa(new String[]{str}, true);
                        gloggerAdminActivity.ba();
                        return true;
                    }
                } else {
                    if (numValueOf != null && numValueOf.intValue() == R.id.menu_item_stop_writing_and_delete) {
                        m activity2 = eVar.getActivity();
                        activity2.getClass();
                        int i15 = gt2.c.f79010a;
                        gt2.b.f79005a.getClass();
                        gt2.b.a.l(str, true);
                        ((GloggerAdminActivity) activity2).ba();
                        return true;
                    }
                    if (numValueOf != null && numValueOf.intValue() == R.id.menu_item_send_files) {
                        m activity3 = eVar.getActivity();
                        activity3.getClass();
                        GloggerAdminActivity gloggerAdminActivity2 = (GloggerAdminActivity) activity3;
                        String str2 = fVar2.f92239c;
                        gloggerAdminActivity2.f33668b = new androidx.appcompat.app.e.a(gloggerAdminActivity2).setIcon(android.R.drawable.ic_dialog_info).setTitle("Send Log Files?").setMessage("Are you sure you want to send the [" + str + "] log files?").setPositiveButton("Yes", new hg1.g(7, gloggerAdminActivity2, str2)).setNeutralButton("No", new i(22)).setCancelable(true).show();
                    }
                }
                return true;
            }
        });
        popupMenu.show();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        DateFormat dateTimeInstance = DateFormat.getDateTimeInstance(1, 1, context.getResources().getConfiguration().getLocales().get(0));
        dateTimeInstance.getClass();
        this.f92231b = dateTimeInstance;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f92232c = new Handler(Looper.getMainLooper());
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        String absolutePath = pi1.b.a(contextRequireContext, null).getAbsolutePath();
        absolutePath.getClass();
        this.f92230a = absolutePath;
        m activity = getActivity();
        activity.getClass();
        ((z1) activity).setTitle("File Loggers");
        u6("");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView = (RecyclerView) com.airbnb.lottie.animation.keyframe.a.b(layoutInflater, R.layout.glogger_file_loggers_frag, viewGroup, false);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(new h(this));
        return recyclerView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        m activity = getActivity();
        activity.getClass();
        ((GloggerAdminActivity) activity).da("FileLoggersFrag");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        oi0.c.W(5, new d6(new ArrayList(), 5, this, view2));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Li80/e$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
