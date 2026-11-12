package com.huami.watch.wififtp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import aurelienribon.tweenengine.BaseTween;
import aurelienribon.tweenengine.Timeline;
import aurelienribon.tweenengine.Tween;
import aurelienribon.tweenengine.TweenAccessor;
import aurelienribon.tweenengine.TweenCallback;
import aurelienribon.tweenengine.TweenEquation;
import aurelienribon.tweenengine.TweenManager;
import aurelienribon.tweenengine.TweenPaths;
import aurelienribon.tweenengine.equations.Back;
import aurelienribon.tweenengine.equations.Linear;
import aurelienribon.tweenengine.equations.Quad;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.ui.view.PagerSlidingTabStrip;
import com.huami.watch.musicupload.adapter.FileInfo;
import com.huami.watch.util.ArraysUtil;
import com.huami.watch.util.DensityUtil;
import com.huami.watch.util.Rx;
import com.huami.watch.wififtp.FileManagerFragment;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import org.cybergarage.soap.SOAP;

/* JADX INFO: loaded from: classes17.dex */
public class FileManagerFragment extends Fragment {
    private static final String A0 = "warning_connect_ap";
    private static final String B0 = "ftp_anim";
    private static final int C0 = 1;
    private static final int D0 = 2;
    private static final int E0 = 3;
    private static final int F0 = 4;
    public static final String FILE_TYPE_GPX = ".gpx";
    public static final String FILE_TYPE_MUSIC = ".mp3";
    private static final int G0 = 5;
    private static final String w0 = ".wav";
    private static final int x0 = 1003;
    private static final int y0 = 60000;
    private static final String z0 = "file_manager_configs";
    private HandlerThread P;
    private u Q;
    private Disposable g;
    private Disposable h;
    private PhoneWifiFtpUtil i;
    private View j;
    private ViewPager k;
    private PagerSlidingTabStrip l;
    private View m;
    private View n;
    private CheckBox q;
    private FrameLayout r0;
    private View s0;
    private View t;
    private View t0;
    private String w;
    private AlertDialogFragment x;
    private final String a = "FileManagerFragment";
    private String[] b = new String[0];
    private final int c = 0;
    private final int d = 1;
    private final String e = FileInfo.REMOTE_DIR;
    private final String f = "gpxdata/";
    private View[] o = new View[2];
    private p[] p = new p[2];
    private List<File> r = new ArrayList();
    private Set<File> s = new HashSet();
    private boolean u = false;
    private boolean v = false;
    private ViewPager.OnPageChangeListener y = new l();
    private final int z = 101;
    private final int A = 102;
    private final int B = 103;
    private final int C = 104;
    private final int D = 105;
    private final int E = 106;
    private final int F = 107;
    private final int G = 108;
    private final int H = 50;
    private final int I = 51;
    private final int J = 1001;
    private final int K = 1002;
    private WatchWifiFtpUtil.WatchAPStateListener L = new m();
    private WatchWifiFtpUtil.WatchFTPListener M = new n();
    private PhoneWifiFtpUtil.APConnectCallback N = new o();
    private PhoneWifiFtpUtil.FTPCallback O = new a();

    @SuppressLint({"HandlerLeak"})
    private Handler R = new b();
    private final int S = -1;
    private final int T = 0;
    private final int U = 1;
    private final int V = 2;
    private final int W = 3;
    private int X = -1;
    private int Y = -1;
    private int Z = -1;
    private boolean m0 = false;
    private boolean n0 = false;
    private ArrayList<File> o0 = new ArrayList<>();
    private boolean p0 = false;
    private boolean q0 = true;
    private final TweenManager u0 = new TweenManager();
    private int v0 = 0;

    public static class ConnectAPWarningFragment extends Fragment {
        private CheckBox a;

        private boolean b() {
            CheckBox checkBox = this.a;
            if (checkBox != null) {
                return checkBox.isChecked();
            }
            return false;
        }

        @Override // androidx.fragment.app.Fragment
        @Nullable
        public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, Bundle bundle) {
            View viewInflate = layoutInflater.inflate(R.layout.fragment_ftp_connect_ap_warning, viewGroup, false);
            this.a = (CheckBox) viewInflate.findViewById(R.id.chkbox_block);
            return viewInflate;
        }
    }

    public class a implements PhoneWifiFtpUtil.FTPCallback {
        public a() {
        }

        @Override // com.huami.watch.wififtp.PhoneWifiFtpUtil.FTPCallback
        public void onConnected() {
            FileManagerFragment.this.k0("Phone FTP onConnected");
            FileManagerFragment.this.n0 = true;
            FileManagerFragment.this.R0();
        }

        @Override // com.huami.watch.wififtp.PhoneWifiFtpUtil.FTPCallback
        public void onDisconnected() {
            FileManagerFragment.this.k0("Phone FTP onDisconnected");
            FileManagerFragment.this.n0 = false;
            FileManagerFragment.this.R0();
        }

        @Override // com.huami.watch.wififtp.PhoneWifiFtpUtil.FTPCallback
        public void onFileDelete(PhoneWifiFtpUtil.TransferTask transferTask, boolean z) {
        }

        @Override // com.huami.watch.wififtp.PhoneWifiFtpUtil.FTPCallback
        public void onFileDownload(PhoneWifiFtpUtil.TransferTask transferTask, boolean z) {
        }

        @Override // com.huami.watch.wififtp.PhoneWifiFtpUtil.FTPCallback
        public void onFileUpload(PhoneWifiFtpUtil.TransferTask transferTask, boolean z) {
        }

        @Override // com.huami.watch.wififtp.PhoneWifiFtpUtil.FTPCallback
        public void onFileUploadProgress(PhoneWifiFtpUtil.TransferTask transferTask, int i) {
        }

        @Override // com.huami.watch.wififtp.PhoneWifiFtpUtil.FTPCallback
        public void onNeedRetryTask(PhoneWifiFtpUtil.TransferTask... transferTaskArr) {
            FileManagerFragment.this.k0("onNeedRetryTask ");
            FileManagerFragment.this.Q.obtainMessage(108, transferTaskArr).sendToTarget();
        }

        @Override // com.huami.watch.wififtp.PhoneWifiFtpUtil.FTPCallback
        public void onTaskAdd(PhoneWifiFtpUtil.TransferTask transferTask) {
        }

        @Override // com.huami.watch.wififtp.PhoneWifiFtpUtil.FTPCallback
        public void onTaskRemove(PhoneWifiFtpUtil.TransferTask transferTask) {
        }

        @Override // com.huami.watch.wififtp.PhoneWifiFtpUtil.FTPCallback
        public void onTaskStateChanged(PhoneWifiFtpUtil.TransferTask transferTask) {
        }
    }

    public class b extends Handler {
        public b() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 51) {
                FileManagerFragment.this.L0(false);
            } else if (i == 1003 && FileManagerFragment.this.N != null) {
                FileManagerFragment.this.N.onDisconnected();
            }
        }
    }

    public class c implements TweenCallback {
        public final /* synthetic */ ImageView a;

        public c(ImageView imageView) {
            this.a = imageView;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String b() {
            return "remove clone.";
        }

        @Override // aurelienribon.tweenengine.TweenCallback
        public void onEvent(int i, BaseTween<?> baseTween) {
            FileManagerFragment.this.r0.removeView(this.a);
            HMLog.info(FileManagerFragment.B0, new Function0() { // from class: com.huami.watch.wififtp.a
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return FileManagerFragment.c.b();
                }
            });
        }
    }

    public class d implements TweenCallback {
        public final /* synthetic */ int a;

        public d(int i) {
            this.a = i;
        }

        @Override // aurelienribon.tweenengine.TweenCallback
        public void onEvent(int i, BaseTween<?> baseTween) {
            FileManagerFragment.this.Q0(this.a);
        }
    }

    public class e implements TweenAccessor<View> {
        public static final /* synthetic */ boolean b = false;

        public e() {
        }

        @Override // aurelienribon.tweenengine.TweenAccessor
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int getValues(View view, int i, float[] fArr) {
            if (i == 1) {
                fArr[0] = view.getX();
                fArr[1] = view.getY();
                return 2;
            }
            if (i == 2) {
                fArr[0] = view.getX() + (view.getWidth() / 2);
                fArr[1] = view.getY() + (view.getHeight() / 2);
                return 2;
            }
            if (i == 3) {
                fArr[0] = view.getScaleX();
                fArr[1] = view.getScaleY();
                return 2;
            }
            if (i == 4) {
                fArr[0] = view.getAlpha();
                return 1;
            }
            if (i != 5) {
                return -1;
            }
            fArr[0] = view.getRotation();
            return 1;
        }

        @Override // aurelienribon.tweenengine.TweenAccessor
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void setValues(View view, int i, float[] fArr) {
            if (i == 1) {
                view.setX(fArr[0]);
                view.setY(fArr[1]);
                return;
            }
            if (i == 2) {
                view.setX(fArr[0] - (view.getWidth() / 2));
                view.setY(fArr[1] - (view.getHeight() / 2));
            } else if (i == 3) {
                view.setScaleX(fArr[0]);
                view.setScaleY(fArr[1]);
            } else if (i == 4) {
                view.setAlpha(fArr[0]);
            } else {
                if (i != 5) {
                    return;
                }
                view.setRotation(fArr[0]);
            }
        }
    }

    public class f implements Runnable {
        private long a = -1;
        public final /* synthetic */ int b;

        public class a implements Runnable {
            public final /* synthetic */ float a;

            public a(float f) {
                this.a = f;
            }

            @Override // java.lang.Runnable
            public void run() {
                FileManagerFragment.this.u0.update(this.a);
            }
        }

        public f(int i) {
            this.b = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String b(int i) {
            return "TweenThread stop " + i;
        }

        @Override // java.lang.Runnable
        public void run() {
            while (this.b == FileManagerFragment.this.v0) {
                if (this.a > 0) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    FileManagerFragment.this.getActivity().runOnUiThread(new a((jCurrentTimeMillis - this.a) / 1000.0f));
                    this.a = jCurrentTimeMillis;
                } else {
                    this.a = System.currentTimeMillis();
                }
                try {
                    Thread.sleep(16L);
                } catch (InterruptedException unused) {
                }
            }
            final int i = this.b;
            HMLog.info(FileManagerFragment.B0, new Function0() { // from class: com.huami.watch.wififtp.b
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return FileManagerFragment.f.b(i);
                }
            });
        }
    }

    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (FileManagerFragment.this.G0()) {
                FileManagerFragment.this.N0();
            } else {
                FileManagerFragment.this.S0();
            }
        }
    }

    public class h implements Observer<List<File>> {
        public h() {
        }

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(@NonNull List<File> list) {
            FileManagerFragment.this.p[1].addAll(list);
            FileManagerFragment.this.v = true;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            FileManagerFragment.this.h = disposable;
            FileManagerFragment.this.p[1].clear();
        }
    }

    public class i implements ObservableOnSubscribe<List<File>> {
        public i() {
        }

        @Override // io.reactivex.ObservableOnSubscribe
        public void subscribe(ObservableEmitter<List<File>> observableEmitter) throws Exception {
            observableEmitter.onNext(FileManagerFragment.this.C0(FileManagerFragment.FILE_TYPE_GPX));
        }
    }

    public class j implements Observer<List<File>> {
        public j() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(View view) {
            if (FileManagerFragment.this.q.isChecked()) {
                FileManagerFragment.this.q.setChecked(false);
                FileManagerFragment.this.s.removeAll(FileManagerFragment.this.r);
                FileManagerFragment.this.p[0].notifyDataSetChanged();
            } else {
                FileManagerFragment.this.q.setChecked(true);
                FileManagerFragment.this.s.addAll(FileManagerFragment.this.r);
                FileManagerFragment.this.p[0].notifyDataSetChanged();
            }
            if (FileManagerFragment.this.s.isEmpty()) {
                FileManagerFragment.this.m.setAlpha(0.5f);
                FileManagerFragment.this.m.setEnabled(false);
            } else {
                FileManagerFragment.this.m.setAlpha(1.0f);
                FileManagerFragment.this.m.setEnabled(true);
            }
        }

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(@NonNull List<File> list) {
            View viewFindViewById = FileManagerFragment.this.o[0].findViewById(R.id.layout_check_all);
            if (FileManagerFragment.this.w == null) {
                viewFindViewById.setVisibility(8);
            } else {
                viewFindViewById.setVisibility(0);
                FileManagerFragment.this.q.setChecked(FileManagerFragment.this.s.containsAll(list));
                viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.huami.watch.wififtp.c
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.a.b(view);
                    }
                });
            }
            FileManagerFragment.this.r = list;
            FileManagerFragment.this.p[0].addAll(list);
            FileManagerFragment.this.u = true;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            FileManagerFragment.this.g = disposable;
            FileManagerFragment.this.p[0].clear();
        }
    }

    public class k implements ObservableOnSubscribe<List<File>> {
        public k() {
        }

        @Override // io.reactivex.ObservableOnSubscribe
        public void subscribe(ObservableEmitter<List<File>> observableEmitter) throws Exception {
            List listC0 = FileManagerFragment.this.C0(FileManagerFragment.FILE_TYPE_MUSIC);
            List listC1 = FileManagerFragment.this.C0(FileManagerFragment.w0);
            ArrayList arrayList = new ArrayList(listC0);
            arrayList.addAll(listC1);
            observableEmitter.onNext(FileManagerFragment.this.D0(arrayList));
        }
    }

    public class l implements ViewPager.OnPageChangeListener {
        public l() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            if (i == 0) {
                if (FileManagerFragment.this.u) {
                    if (FileManagerFragment.this.p[0].getCount() > 0) {
                        if (FileManagerFragment.this.n.getVisibility() != 8) {
                            FileManagerFragment.this.n.setVisibility(8);
                            return;
                        }
                        return;
                    } else {
                        if (FileManagerFragment.this.n.getVisibility() != 0) {
                            FileManagerFragment.this.n.setVisibility(0);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            if (i == 1 && FileManagerFragment.this.v) {
                if (FileManagerFragment.this.p[1].getCount() > 0) {
                    if (FileManagerFragment.this.n.getVisibility() != 8) {
                        FileManagerFragment.this.n.setVisibility(8);
                    }
                } else if (FileManagerFragment.this.n.getVisibility() != 0) {
                    FileManagerFragment.this.n.setVisibility(0);
                }
            }
        }
    }

    public class m implements WatchWifiFtpUtil.WatchAPStateListener {
        public m() {
        }

        @Override // com.huami.watch.wififtp.WatchWifiFtpUtil.WatchAPStateListener
        public void onAPEnableResult(int i, String str) {
            HMLog.i("FileManagerFragment", "onAPEnableResult code: " + i + "; data: " + str, new Object[0]);
        }

        @Override // com.huami.watch.wififtp.WatchWifiFtpUtil.WatchAPStateListener
        public void onAPStateChanged(int i, int i2) {
            HMLog.i("FileManagerFragment", "onAPStateChanged oldstate: " + i + "; newstate: " + i2, new Object[0]);
            FileManagerFragment.this.Q.obtainMessage(1001, i, i2).sendToTarget();
        }
    }

    public class n implements WatchWifiFtpUtil.WatchFTPListener {
        public n() {
        }

        @Override // com.huami.watch.wififtp.WatchWifiFtpUtil.WatchFTPListener
        public void onFTPServerStateChanged(int i, int i2) {
            FileManagerFragment.this.k0("report from watch onFTPServerStateChanged oldstate: " + i + "; newstate: " + i2);
            FileManagerFragment.this.Q.obtainMessage(1002, i, i2).sendToTarget();
        }

        @Override // com.huami.watch.wififtp.WatchWifiFtpUtil.WatchFTPListener
        public void onFileDelete(String str) {
            FileManagerFragment.this.k0("report from watch onFileDelete " + str);
        }

        @Override // com.huami.watch.wififtp.WatchWifiFtpUtil.WatchFTPListener
        public void onFileDownload(String str) {
            FileManagerFragment.this.k0("report from watch onFileDownload " + str);
        }

        @Override // com.huami.watch.wififtp.WatchWifiFtpUtil.WatchFTPListener
        public void onFileUpload(String str) {
            FileManagerFragment.this.k0("report from watch onFileUpload " + str);
        }
    }

    public class o implements PhoneWifiFtpUtil.APConnectCallback {
        public o() {
        }

        @Override // com.huami.watch.wififtp.PhoneWifiFtpUtil.APConnectCallback
        public void onConnected() {
            FileManagerFragment.this.k0("Phone AP onConnected.");
            FileManagerFragment.this.m0 = true;
            FileManagerFragment.this.R0();
            FileManagerFragment.this.Q.sendEmptyMessageDelayed(105, 2000L);
        }

        @Override // com.huami.watch.wififtp.PhoneWifiFtpUtil.APConnectCallback
        public void onDisconnected() {
            FileManagerFragment.this.k0("Phone AP onDisconnected.");
            FileManagerFragment.this.m0 = false;
            if (FileManagerFragment.this.X != -1) {
                FileManagerFragment.this.I0();
            }
            FileManagerFragment.this.R0();
            FileManagerFragment.this.Q.sendEmptyMessage(106);
            if (FileManagerFragment.this.i.getTaskCount() > 0) {
                FileManagerFragment.this.O0();
            }
        }
    }

    public class p extends ArrayAdapter<File> {
        private LayoutInflater a;
        private int b;
        private int c;

        public p(Context context, LayoutInflater layoutInflater, int i, int i2) {
            super(context, i);
            this.a = layoutInflater;
            this.b = i;
            this.c = i2;
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        @NonNull
        public View getView(int i, @Nullable View view, @NonNull ViewGroup viewGroup) {
            t tVar;
            FileManagerFragment.this.getActivity();
            if (view == null) {
                view = this.a.inflate(this.b, viewGroup, false);
                tVar = new t(null);
                ImageView imageView = (ImageView) view.findViewById(R.id.file_item_img);
                tVar.a = imageView;
                imageView.setImageResource(this.c);
                tVar.b = (TextView) view.findViewById(R.id.file_item_text);
                tVar.c = (TextView) view.findViewById(R.id.file_item_size);
                tVar.d = view.findViewById(R.id.file_item_text_check);
                tVar.e = view.findViewById(R.id.file_item_arrow);
                view.setTag(tVar);
            } else {
                tVar = (t) view.getTag();
            }
            if (getCount() > i) {
                File item = getItem(i);
                tVar.b.setText(item.getName());
                tVar.c.setText(FileManagerFragment.m0(FileManagerFragment.this.getResources(), item.length(), true));
                if (FileManagerFragment.this.s.contains(item)) {
                    tVar.f = true;
                    Drawable drawable = ContextCompat.getDrawable(getContext(), R.drawable.ic_checked_20_p3_2x);
                    drawable.setTint(ContextCompat.getColor(getContext(), R.color.p3));
                    tVar.d.setBackground(drawable);
                } else {
                    tVar.f = false;
                    Drawable drawable2 = ContextCompat.getDrawable(getContext(), R.drawable.ic_check_20_s3_2x);
                    drawable2.setTint(ContextCompat.getColor(getContext(), R.color.s2));
                    tVar.d.setBackground(drawable2);
                }
                if (item.isDirectory()) {
                    tVar.a.setImageResource(R.drawable.ftp_icon_folder);
                    tVar.d.setVisibility(8);
                    tVar.c.setVisibility(8);
                    tVar.e.setVisibility(0);
                } else {
                    tVar.a.setVisibility(8);
                    tVar.d.setVisibility(0);
                    tVar.c.setVisibility(0);
                    tVar.e.setVisibility(8);
                }
            }
            return view;
        }
    }

    public class q implements AdapterView.OnItemClickListener {
        private int a;

        public /* synthetic */ q(FileManagerFragment fileManagerFragment, int i, g gVar) {
            this(i);
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (FileManagerFragment.this.p0) {
                return;
            }
            File item = FileManagerFragment.this.p[this.a].getItem(i);
            if (item.isDirectory()) {
                FileManagerFragment.this.w = item.getAbsolutePath();
                FileManagerFragment.this.F0();
                return;
            }
            if (FileManagerFragment.this.s.contains(item)) {
                FileManagerFragment.this.s.remove(item);
            } else {
                FileManagerFragment.this.s.add(item);
            }
            if (FileManagerFragment.this.s.isEmpty()) {
                FileManagerFragment.this.m.setAlpha(0.5f);
                FileManagerFragment.this.m.setEnabled(false);
            } else {
                FileManagerFragment.this.m.setAlpha(1.0f);
                FileManagerFragment.this.m.setEnabled(true);
            }
            FileManagerFragment.this.q.setChecked(FileManagerFragment.this.s.containsAll(FileManagerFragment.this.r));
            FileManagerFragment.this.p[this.a].notifyDataSetChanged();
        }

        private q(int i) {
            this.a = i;
        }
    }

    public class r extends PagerAdapter {
        public String[] a;

        public /* synthetic */ r(FileManagerFragment fileManagerFragment, g gVar) {
            this();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView(FileManagerFragment.this.o[i]);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        /* JADX INFO: renamed from: getCount */
        public int getPagerCount() {
            return FileManagerFragment.this.o.length;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public CharSequence getPageTitle(int i) {
            return this.a[i];
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            viewGroup.addView(FileManagerFragment.this.o[i]);
            return FileManagerFragment.this.o[i];
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        private r() {
            this.a = new String[]{FileManagerFragment.this.getString(R.string.file_manager_title_music), FileManagerFragment.this.getString(R.string.file_manager_title_gpx)};
        }
    }

    public static class s extends TweenEquation {
        private static final float c = 0.002f;
        private float[] a;
        private float[] b;

        public s(float f, float f2, float f3, float f4) {
            a(f, f2, f3, f4);
        }

        private void a(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(0.0f, 0.0f);
            path.cubicTo(f, f2, f3, f4, 1.0f, 1.0f);
            b(path);
        }

        private void b(Path path) {
            PathMeasure pathMeasure = new PathMeasure(path, false);
            float length = pathMeasure.getLength();
            int i = ((int) (length / 0.002f)) + 1;
            this.a = new float[i];
            this.b = new float[i];
            float[] fArr = new float[2];
            for (int i2 = 0; i2 < i; i2++) {
                pathMeasure.getPosTan((i2 * length) / (i - 1), fArr, null);
                this.a[i2] = fArr[0];
                this.b[i2] = fArr[1];
            }
        }

        @Override // aurelienribon.tweenengine.TweenEquation
        public float compute(float f) {
            if (f <= 0.0f) {
                return 0.0f;
            }
            if (f >= 1.0f) {
                return 1.0f;
            }
            int i = 0;
            int length = this.a.length - 1;
            while (length - i > 1) {
                int i2 = (i + length) / 2;
                if (f < this.a[i2]) {
                    length = i2;
                } else {
                    i = i2;
                }
            }
            float[] fArr = this.a;
            float f2 = fArr[length] - fArr[i];
            if (f2 == 0.0f) {
                return this.b[i];
            }
            float f3 = (f - fArr[i]) / f2;
            float[] fArr2 = this.b;
            float f4 = fArr2[i];
            return f4 + (f3 * (fArr2[length] - f4));
        }
    }

    public static class t {
        public ImageView a;
        public TextView b;
        public TextView c;
        public View d;
        public View e;
        public boolean f;

        private t() {
        }

        public /* synthetic */ t(g gVar) {
            this();
        }
    }

    public class u extends Handler {
        public u(Looper looper) {
            super(looper);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String e() {
            return "onFTPServerStateChanged: WIFI_AP_STATE_ENABLED";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String f() {
            return "onFTPServerStateChanged: WIFI_AP_STATE_DISABLED";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String g() {
            return "onFTPServerStateChanged: FTP_STATE_ENABLE";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String h() {
            return "onFTPServerStateChanged: FTP_STATE_DISABLE";
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            ArrayList<File> arrayList;
            int i = message.what;
            if (i == 1001) {
                int i2 = message.arg2;
                if (i2 == 13) {
                    HMLog.info("FileManagerFragment", new Function0() { // from class: com.huami.watch.wififtp.f
                        @Override // kotlin.jvm.functions.Function0
                        /* JADX INFO: renamed from: invoke */
                        public final Object getA() {
                            return FileManagerFragment.u.e();
                        }
                    });
                    FileManagerFragment.this.Y = i2;
                    FileManagerFragment.this.R0();
                    sendEmptyMessage(102);
                    sendEmptyMessageDelayed(104, 10000L);
                    return;
                }
                if (i2 == 11) {
                    HMLog.info("FileManagerFragment", new Function0() { // from class: com.huami.watch.wififtp.e
                        @Override // kotlin.jvm.functions.Function0
                        /* JADX INFO: renamed from: invoke */
                        public final Object getA() {
                            return FileManagerFragment.u.f();
                        }
                    });
                    FileManagerFragment.this.Y = i2;
                    FileManagerFragment.this.R0();
                    sendEmptyMessage(103);
                    if (FileManagerFragment.this.N != null) {
                        FileManagerFragment.this.N.onDisconnected();
                        return;
                    }
                    return;
                }
                return;
            }
            if (i == 1002) {
                int i3 = message.arg2;
                FileManagerFragment.this.Z = i3;
                FileManagerFragment.this.R0();
                if (i3 != 2) {
                    HMLog.info("FileManagerFragment", new Function0() { // from class: com.huami.watch.wififtp.d
                        @Override // kotlin.jvm.functions.Function0
                        /* JADX INFO: renamed from: invoke */
                        public final Object getA() {
                            return FileManagerFragment.u.h();
                        }
                    });
                    return;
                }
                HMLog.info("FileManagerFragment", new Function0() { // from class: com.huami.watch.wififtp.g
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: invoke */
                    public final Object getA() {
                        return FileManagerFragment.u.g();
                    }
                });
                if (FileManagerFragment.this.m0) {
                    removeMessages(105);
                    sendEmptyMessage(105);
                    return;
                } else {
                    removeMessages(104);
                    sendEmptyMessage(104);
                    return;
                }
            }
            switch (i) {
                case 101:
                    FileManagerFragment.this.k0("do MSG_WATCH_ENABLE_AP");
                    FileManagerFragment.this.R.removeMessages(1003);
                    FileManagerFragment.this.R.sendEmptyMessageDelayed(1003, 60000L);
                    WatchWifiFtpUtil.get().setWatchAPStateListener(FileManagerFragment.this.L);
                    WatchWifiFtpUtil.get().setWatchFTPListener(FileManagerFragment.this.M);
                    WatchWifiFtpUtil.updatePassWord();
                    WatchWifiFtpUtil.get().enableWifiAP(WatchWifiFtpUtil.SSID, 4, WatchWifiFtpUtil.PSWD);
                    return;
                case 102:
                    FileManagerFragment.this.k0("do MSG_WATCH_ENABLE_FTP");
                    FileManagerFragment.this.R.removeMessages(1003);
                    WifiFtpModule.sendEnableFtp();
                    return;
                case 103:
                    FileManagerFragment.this.k0("do MSG_WATCH_DISABLE_FTP");
                    FileManagerFragment.this.R.removeMessages(1003);
                    WifiFtpModule.sendDisableFtp();
                    return;
                case 104:
                    FileManagerFragment.this.k0("do MSG_PHONE_CONNECT_AP");
                    FileManagerFragment.this.R.removeMessages(1003);
                    FileManagerFragment.this.i.setAPConnectCallback(FileManagerFragment.this.N);
                    FileManagerFragment.this.i.connectAP(WatchWifiFtpUtil.SSID, 4, WatchWifiFtpUtil.PSWD);
                    return;
                case 105:
                    FileManagerFragment.this.k0("do MSG_PHONE_CONNECT_FTP");
                    FileManagerFragment.this.R.removeMessages(1003);
                    FileManagerFragment.this.i.connectFTP();
                    return;
                case 106:
                    FileManagerFragment.this.k0("do MSG_PHONE_DISCONNECT_FTP");
                    FileManagerFragment.this.R.removeMessages(1003);
                    FileManagerFragment.this.i.disconnectFTP();
                    return;
                case 107:
                    FileManagerFragment.this.k0("do MSG_UPLOAD_FILES");
                    synchronized (FileManagerFragment.this.o0) {
                        arrayList = (ArrayList) FileManagerFragment.this.o0.clone();
                        FileManagerFragment.this.o0.clear();
                        break;
                    }
                    FileManagerFragment.this.R.sendEmptyMessage(51);
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    for (File file : arrayList) {
                        String strN0 = FileManagerFragment.this.n0(file);
                        FileManagerFragment.this.k0("MSG_UPLOAD_FILES upload " + file.getName() + " to " + strN0);
                        if (strN0 != null) {
                            FileManagerFragment.this.i.uploadFile(file, strN0 + file.getName());
                        }
                    }
                    return;
                case 108:
                    FileManagerFragment.this.k0("do MSG_RETRY_FILES");
                    FileManagerFragment.this.K0((PhoneWifiFtpUtil.TransferTask[]) message.obj);
                    return;
                default:
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String A0(int i2) {
        return "startTween " + i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String B0(int i2) {
        return "stopTween " + i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<File> C0(String str) {
        ArrayList arrayList = new ArrayList();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        HMLog.info("FileManagerFragment", new Function0() { // from class: i62
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return FileManagerFragment.r0();
            }
        });
        final Cursor cursorQuery = getActivity().getContentResolver().query(MediaStore.Files.getContentUri("external"), new String[]{"_data", "title"}, "_data LIKE '%" + str + "'", null, "date_modified");
        if (cursorQuery == null) {
            return arrayList;
        }
        HMLog.info("FileManagerFragment", new Function0() { // from class: n62
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return FileManagerFragment.s0(cursorQuery);
            }
        });
        if (cursorQuery.moveToLast()) {
            do {
                String string = cursorQuery.getString(0);
                if (new File(string).exists()) {
                    arrayList.add(new File(string));
                }
            } while (cursorQuery.moveToPrevious());
        }
        cursorQuery.close();
        HMLog.info("FileManagerFragment", new Function0() { // from class: m62
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return FileManagerFragment.t0(jCurrentTimeMillis);
            }
        });
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<File> D0(@NonNull List<File> list) {
        final ArrayList arrayList = new ArrayList();
        HMLog.info("FileManagerFragment", new Function0() { // from class: p62
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return this.a.u0();
            }
        });
        if (this.w == null) {
            for (File file : list) {
                String parent = file.getParent();
                Iterator it2 = arrayList.iterator();
                do {
                    if (!it2.hasNext()) {
                        arrayList.add(file.getParentFile());
                        break;
                    }
                } while (!((File) it2.next()).getAbsolutePath().equals(parent));
            }
            HMLog.info("FileManagerFragment", new Function0() { // from class: g62
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return FileManagerFragment.v0(arrayList);
                }
            });
        } else {
            for (File file2 : list) {
                if (this.w.equals(file2.getParent())) {
                    arrayList.add(file2);
                }
            }
            HMLog.info("FileManagerFragment", new Function0() { // from class: h62
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return FileManagerFragment.w0(arrayList);
                }
            });
        }
        Collections.sort(arrayList, new Comparator() { // from class: j62
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return FileManagerFragment.x0((File) obj, (File) obj2);
            }
        });
        return arrayList;
    }

    private void E0() {
        F0();
        Rx.io(new i()).safeSubscribe(new h());
        HandlerThread handlerThread = new HandlerThread("FTPThread");
        this.P = handlerThread;
        handlerThread.start();
        this.Q = new u(this.P.getLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F0() {
        Rx.io(new k()).safeSubscribe(new j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean G0() {
        return getActivity().getSharedPreferences("file_manager_configs", 0).getBoolean("warning_connect_ap", true) && this.q0;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0196  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v5 */
    private void H0() {
        int currentItem = this.k.getCurrentItem();
        int[] iArr = new int[2];
        Timeline timelineCreateParallel = Timeline.createParallel();
        int[] iArr2 = new int[2];
        j0(iArr2);
        ?? r5 = 0;
        float f2 = iArr2[0] > 0 ? iArr2[0] : 927.0f;
        int i2 = 1;
        float f3 = iArr2[1] > 0 ? iArr2[1] : 8.0f;
        s sVar = new s(0.42f, 0.81f, 0.84f, 1.0f);
        ListView listView = (ListView) this.o[currentItem].findViewById(R.id.list);
        int i3 = 0;
        int i4 = 0;
        while (i3 < listView.getChildCount()) {
            View childAt = listView.getChildAt(i3);
            if (childAt.getTag() instanceof t) {
                t tVar = (t) childAt.getTag();
                if (tVar.f) {
                    ImageView imageView = tVar.a;
                    iArr[r5] = r5;
                    iArr[i2] = r5;
                    getDescendantCoordRelativeToParent(imageView, this.r0, iArr, r5);
                    ImageView imageView2 = new ImageView(getActivity());
                    if (currentItem == 0) {
                        imageView2.setImageResource(R.drawable.ftp_icon_music);
                    } else if (currentItem == i2) {
                        imageView2.setImageResource(R.drawable.ftp_icon_gpx);
                    }
                    int iDpToPx = (int) DensityUtil.dpToPx(getActivity(), 30.0f);
                    this.r0.addView(imageView2, new FrameLayout.LayoutParams(iDpToPx, iDpToPx));
                    imageView2.setX(iArr[r5]);
                    imageView2.setY(iArr[i2]);
                    imageView2.setAlpha(0.0f);
                    float f4 = i4 * 0.01f;
                    Tween tweenTarget = Tween.to(imageView2, 3, 0.12f).delay(f4).target(0.5f, 0.5f);
                    Linear linear = Linear.INOUT;
                    Timeline timelinePush = timelineCreateParallel.push(tweenTarget.ease(linear)).push(Tween.to(imageView2, 4, 0.12f).delay(f4).target(1.0f).ease(linear));
                    float f5 = f4 + 0.12f;
                    i2 = 1;
                    timelinePush.push(Tween.to(imageView2, 4, 0.72f).delay(f5).target(0.0f).ease(sVar)).push(Tween.to(imageView2, 5, 0.72f).delay(f5).target(60.0f).ease(sVar)).push(Tween.to(imageView2, 1, 0.72f).delay(f5).target(f2, f3).ease(sVar).waypoint(iArr[0] + ((f2 - iArr[0]) * 0.25f), iArr[1] + ((f3 - iArr[1]) * 0.5f)).waypoint(iArr[0] + ((f2 - iArr[0]) * 0.75f), iArr[1] + ((f3 - iArr[1]) * 0.9f)).path(TweenPaths.catmullRom).setCallbackTriggers(4).setCallback(new c(imageView2)));
                    i4++;
                }
            }
            i3++;
            currentItem = currentItem;
            r5 = 0;
        }
        if (i4 > 0) {
            Back back = Back.OUT;
            back.s(3.5f);
            Tween tweenTarget2 = Tween.to(this.s0, 3, 0.16f).delay(0.68000007f).target(1.35f, 1.35f);
            Quad quad = Quad.INOUT;
            timelineCreateParallel.push(tweenTarget2.ease(quad)).push(Tween.to(this.s0, 3, 0.28f).delay(0.84000003f).target(1.0f, 1.0f).ease(back));
            if (this.t0.getVisibility() == 4) {
                this.t0.setScaleX(0.0f);
                this.t0.setScaleY(0.0f);
                this.t0.setVisibility(0);
                timelineCreateParallel.push(Tween.to(this.t0, 3, 0.16f).delay(0.68000007f).target(1.35f, 1.35f).ease(quad)).push(Tween.to(this.t0, 3, 0.28f).delay(0.84000003f).target(1.0f, 1.0f).ease(back));
            }
            timelineCreateParallel.setCallbackTriggers(4).setCallback(new d(P0())).start(this.u0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I0() {
        k0("reset.");
        WifiFtpModule.sendDisableFtp();
        WatchWifiFtpUtil.get().disableWifiAP();
        J0();
    }

    private void J0() {
        k0("resetState.");
        this.X = -1;
        this.m0 = false;
        this.Y = 11;
        this.n0 = false;
        this.Z = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K0(PhoneWifiFtpUtil.TransferTask... transferTaskArr) {
        k0("retryFiles.");
        if (transferTaskArr != null) {
            LinkedList<File> linkedList = new LinkedList();
            for (PhoneWifiFtpUtil.TransferTask transferTask : transferTaskArr) {
                File file = new File(transferTask.getLocalPath());
                if (file.exists()) {
                    linkedList.add(file);
                }
            }
            if (linkedList.size() > 0) {
                synchronized (this.o0) {
                    for (File file2 : linkedList) {
                        if (!this.o0.contains(file2)) {
                            this.o0.add(file2);
                        }
                    }
                }
                T0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L0(boolean z) {
        this.p0 = z;
        if (!z) {
            this.m.setEnabled(true);
            this.p[0].notifyDataSetChanged();
            this.p[1].notifyDataSetChanged();
        } else {
            this.m.setAlpha(0.5f);
            this.m.setEnabled(false);
            this.p[0].notifyDataSetChanged();
            this.p[1].notifyDataSetChanged();
        }
    }

    private void M0() {
        getActivity().getSharedPreferences("file_manager_configs", 0).edit().putBoolean("warning_connect_ap", false).commit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N0() {
        HMLog.i("FileManagerFragment", "show connect ap warning", new Object[0]);
        View viewInflate = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_ftp_connect_ap_warning, (ViewGroup) null);
        final CheckBox checkBox = (CheckBox) viewInflate.findViewById(R.id.chkbox_block);
        new AlertDialogFragment.Builder(getActivity()).setTitle(R.string.file_manager_connect_ap_warning_title).setContentView(viewInflate).setPositiveButton(R.string.btn_enter, new DialogInterface.OnClickListener() { // from class: f62
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                this.a.z0(checkBox, dialogInterface, i2);
            }
        }).setNegativeButton(R.string.btn_cancel, (DialogInterface.OnClickListener) null).create().show(getChildFragmentManager(), "RecordConnectWifiDialog");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O0() {
        try {
            AlertDialogFragment alertDialogFragment = this.x;
            if (alertDialogFragment != null && alertDialogFragment.getDialog().isShowing()) {
                HMLog.i("FileManagerFragment", "warningDialog isShowing", new Object[0]);
                return;
            }
            AlertDialogFragment alertDialogFragmentCreate = new AlertDialogFragment.Builder(getActivity()).setTitle(R.string.file_manager_dialog_disconnect_wifi_error_title).setMessage(R.string.file_manager_dialog_disconnect_wifi_error_content).setNeutralButton(R.string.btn_enter, (DialogInterface.OnClickListener) null).create();
            this.x = alertDialogFragmentCreate;
            alertDialogFragmentCreate.show(getChildFragmentManager());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private int P0() {
        final int i2 = this.v0 + 1;
        this.v0 = i2;
        HMLog.info(B0, new Function0() { // from class: l62
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return FileManagerFragment.A0(i2);
            }
        });
        new Thread(new f(i2)).start();
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q0(final int i2) {
        if (i2 >= this.v0) {
            HMLog.info(B0, new Function0() { // from class: k62
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return FileManagerFragment.B0(i2);
                }
            });
            this.v0++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R0() {
        k0("checkAllState...");
        if (this.Y != 13) {
            this.X = -1;
            k0("  watch ap not work");
            return;
        }
        this.X = 0;
        k0("  watch ap ready");
        if (this.Z != 2) {
            k0("  watch ftp not work");
            return;
        }
        this.X = 1;
        k0("  watch ftp ready");
        if (!this.m0) {
            k0("  phone ap not work");
            return;
        }
        this.X = 2;
        k0("  phone ap ready");
        if (!this.n0) {
            k0("  phone ftp not work");
        } else {
            k0("  phone ftp ready");
            this.X = 3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S0() {
        k0("uploadFiles.");
        if (this.s.isEmpty()) {
            return;
        }
        L0(true);
        if (!WifiFtpModule.hasBoundDevice(getActivity())) {
            k0("No device bound");
            Toast.makeText(getActivity(), "No device bound.", 0).show();
            L0(false);
            return;
        }
        if (!WifiFtpModule.isDeviceConnected(getActivity())) {
            k0("No device connected");
            Toast.makeText(getActivity(), "No device connected.", 0).show();
            L0(false);
            return;
        }
        H0();
        synchronized (this.o0) {
            for (File file : this.s) {
                if (!this.o0.contains(file)) {
                    this.o0.add(file);
                }
            }
            this.s.clear();
            this.q.setChecked(false);
            this.p[0].notifyDataSetChanged();
            this.p[1].notifyDataSetChanged();
        }
        T0();
    }

    private void T0() {
        k0("uploadFilesInternal.");
        if (this.o0.isEmpty()) {
            return;
        }
        if (!WifiFtpModule.hasBoundDevice(getActivity())) {
            k0("uploadFilesInternal No device bound");
            Toast.makeText(getActivity(), "No device bound.", 0).show();
            return;
        }
        if (!WifiFtpModule.isDeviceConnected(getActivity())) {
            k0("uploadFilesInternal No device connected");
            Toast.makeText(getActivity(), "No device connected.", 0).show();
            return;
        }
        k0("  upload list ready. size:" + this.o0.size() + "\n  current state:" + this.X);
        int i2 = this.X;
        if (i2 == -1) {
            k0("  continue MSG_WATCH_ENABLE_AP");
            this.Q.sendEmptyMessage(101);
        } else if (i2 == 0) {
            k0("  continue MSG_WATCH_ENABLE_FTP");
            this.Q.sendEmptyMessage(102);
        } else if (i2 == 1) {
            k0("  continue MSG_PHONE_CONNECT_AP");
            this.Q.removeMessages(104);
            this.Q.sendEmptyMessage(104);
        } else if (i2 == 2) {
            if (this.n0) {
                k0("  continue MSG_PHONE_CONNECT_FTP");
                this.Q.sendEmptyMessage(105);
            } else {
                k0("  continue MSG_WATCH_ENABLE_FTP");
                this.Q.sendEmptyMessage(102);
                this.Q.sendEmptyMessageDelayed(105, 10000L);
            }
        }
        k0("  send MSG_UPLOAD_FILES");
        this.Q.sendEmptyMessage(107);
    }

    public static float getDescendantCoordRelativeToParent(View view, View view2, int[] iArr, boolean z) {
        ArrayList arrayList = new ArrayList();
        float[] fArr = {iArr[0], iArr[1]};
        for (View view3 = view; view3 != view2 && view3 != null; view3 = (View) view3.getParent()) {
            arrayList.add(view3);
        }
        float scaleX = 1.0f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view4 = (View) arrayList.get(i2);
            if (view4 != view || z) {
                fArr[0] = fArr[0] - view4.getScrollX();
                fArr[1] = fArr[1] - view4.getScrollY();
            }
            view4.getMatrix().mapPoints(fArr);
            fArr[0] = fArr[0] + view4.getLeft();
            fArr[1] = fArr[1] + view4.getTop();
            scaleX *= view4.getScaleX();
        }
        iArr[0] = Math.round(fArr[0]);
        iArr[1] = Math.round(fArr[1]);
        return scaleX;
    }

    private void j0(int[] iArr) {
        this.t0.getLocationInWindow(iArr);
        int i2 = iArr[0];
        int i3 = iArr[1];
        this.r0.getLocationInWindow(iArr);
        iArr[0] = i2 - iArr[0];
        iArr[1] = i3 - iArr[1];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k0(final String str) {
        HMLog.info("FileManagerFragment", new Function0() { // from class: q62
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return FileManagerFragment.p0(str);
            }
        });
    }

    private void l0(final String str, final Throwable th) {
        HMLog.info("FileManagerFragment", new Function0() { // from class: r62
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return FileManagerFragment.q0(str, th);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String m0(Resources resources, long j2, boolean z) {
        String str;
        if (resources == null) {
            return "";
        }
        float f2 = j2;
        int i2 = R.string.byteShort;
        if (f2 > 900.0f) {
            i2 = R.string.kilobyteShort;
            f2 /= 1024.0f;
        }
        if (f2 > 900.0f) {
            i2 = R.string.megabyteShort;
            f2 /= 1024.0f;
        }
        if (f2 > 900.0f) {
            i2 = R.string.gigabyteShort;
            f2 /= 1024.0f;
        }
        if (f2 > 900.0f) {
            i2 = R.string.terabyteShort;
            f2 /= 1024.0f;
        }
        if (f2 > 900.0f) {
            i2 = R.string.petabyteShort;
            f2 /= 1024.0f;
        }
        if (f2 < 1.0f) {
            str = String.format("%.2f", Float.valueOf(f2));
        } else if (f2 < 10.0f) {
            str = z ? String.format("%.1f", Float.valueOf(f2)) : String.format("%.2f", Float.valueOf(f2));
        } else {
            str = (f2 >= 100.0f || z) ? String.format("%.0f", Float.valueOf(f2)) : String.format("%.2f", Float.valueOf(f2));
        }
        return resources.getString(R.string.fileSizeSuffix, str, resources.getString(i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String n0(File file) {
        if (file == null) {
            return null;
        }
        String name = file.getName();
        if (name.endsWith(FILE_TYPE_MUSIC) || name.endsWith(w0)) {
            return FileInfo.REMOTE_DIR;
        }
        if (name.endsWith(FILE_TYPE_GPX)) {
            return "gpxdata/";
        }
        return null;
    }

    private void o0() {
        Tween.setWaypointsLimit(10);
        Tween.registerAccessor(View.class, new e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String p0(String str) {
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String q0(String str, Throwable th) {
        return str + th;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String r0() {
        return "start search...";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String s0(Cursor cursor) {
        return "found " + cursor.getCount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String t0(long j2) {
        return "finished. take " + ((System.currentTimeMillis() - j2) / 1000) + SOAP.XMLNS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String u0() {
        return "MusicParentPath: " + this.w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String v0(List list) {
        return "Folders: " + ArraysUtil.toString((List<?>) list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String w0(List list) {
        return "Files: " + ArraysUtil.toString((List<?>) list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int x0(File file, File file2) {
        return file.getName().toLowerCase().compareTo(file2.getName().toLowerCase());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String y0() {
        return "Args: FileTypes[" + ArraysUtil.toString(this.b) + "]";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z0(CheckBox checkBox, DialogInterface dialogInterface, int i2) {
        this.q0 = false;
        if (checkBox.isChecked()) {
            HMLog.i("FileManagerFragment", "setNotShowWarning", new Object[0]);
            M0();
        }
        S0();
    }

    public boolean onBackPressed() {
        if (this.w == null) {
            return false;
        }
        this.w = null;
        E0();
        return true;
    }

    public void onConnected() {
        if (this.t.getVisibility() == 0) {
            this.t.setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, Bundle bundle) {
        String[] stringArrayExtra;
        k0("onCreateView");
        View viewInflate = layoutInflater.inflate(R.layout.fragment_ftp_local_explorer, viewGroup, false);
        this.j = viewInflate;
        this.t = viewInflate.findViewById(R.id.fog_layer);
        View[] viewArr = this.o;
        int i2 = R.layout.view_file_list_view;
        g gVar = null;
        viewArr[0] = layoutInflater.inflate(i2, (ViewGroup) null, false);
        p[] pVarArr = this.p;
        FragmentActivity activity = getActivity();
        int i3 = R.layout.list_item_file_upload;
        pVarArr[0] = new p(activity, layoutInflater, i3, R.drawable.ftp_icon_music);
        View view = this.o[0];
        int i4 = R.id.list;
        ((ListView) view.findViewById(i4)).setAdapter((ListAdapter) this.p[0]);
        ((ListView) this.o[0].findViewById(i4)).setOnItemClickListener(new q(this, 0, gVar));
        this.o[1] = layoutInflater.inflate(i2, (ViewGroup) null, false);
        this.p[1] = new p(getActivity(), layoutInflater, i3, R.drawable.ftp_icon_gpx);
        ((ListView) this.o[1].findViewById(i4)).setAdapter((ListAdapter) this.p[1]);
        ((ListView) this.o[1].findViewById(i4)).setOnItemClickListener(new q(this, 1, gVar));
        this.q = (CheckBox) this.o[0].findViewById(R.id.btn_check_all);
        this.l = (PagerSlidingTabStrip) this.j.findViewById(R.id.indicator);
        Intent intent = getActivity().getIntent();
        if (intent != null && (stringArrayExtra = intent.getStringArrayExtra("FileTypes")) != null) {
            this.b = stringArrayExtra;
        }
        HMLog.info("FileManagerFragment", new Function0() { // from class: o62
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return this.a.y0();
            }
        });
        if (this.b.length == 1) {
            this.l.setVisibility(8);
            if (FILE_TYPE_MUSIC.equals(this.b[0])) {
                this.o = new View[]{this.o[0]};
            }
        }
        ViewPager viewPager = (ViewPager) this.j.findViewById(R.id.view_pager);
        this.k = viewPager;
        viewPager.setOffscreenPageLimit(3);
        this.k.setAdapter(new r(this, gVar));
        this.k.addOnPageChangeListener(this.y);
        this.l.setViewPager(this.k);
        this.n = this.j.findViewById(R.id.attention);
        this.m = this.j.findViewById(R.id.btn_upload);
        if (this.s.isEmpty()) {
            this.m.setAlpha(0.5f);
            this.m.setEnabled(false);
        }
        this.m.setOnClickListener(new g());
        E0();
        this.i = PhoneWifiFtpUtil.get();
        WatchWifiFtpUtil.get().startWatchService();
        this.i.registerFTPCallback(this.O);
        o0();
        return this.j;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        k0("onDestroyView");
        WatchWifiFtpUtil.get().setWatchAPStateListener(null);
        WatchWifiFtpUtil.get().setWatchFTPListener(null);
        Disposable disposable = this.g;
        if (disposable != null) {
            disposable.dispose();
            this.g = null;
        }
        Disposable disposable2 = this.h;
        if (disposable2 != null) {
            disposable2.dispose();
            this.h = null;
        }
        this.P.getLooper().quitSafely();
        this.Q.removeCallbacksAndMessages(null);
        super.onDestroyView();
    }

    public void onDisconnected() {
        if (this.t.getVisibility() == 8) {
            this.t.setVisibility(0);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.u0.killAll();
        Q0(Integer.MAX_VALUE);
    }

    public void onUnbound() {
        if (this.t.getVisibility() == 8) {
            this.t.setVisibility(0);
        }
    }

    public void setAnimationView(FrameLayout frameLayout, View view, View view2) {
        this.r0 = frameLayout;
        this.s0 = view;
        this.t0 = view2;
    }
}
