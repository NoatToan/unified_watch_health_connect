package com.huami.watch.companion.ximalaya;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import com.huami.watch.companion.R;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.ui.view.ActionbarLayout;
import com.huami.watch.companion.util.AnalyticsEvents;
import com.huami.watch.util.Analytics;
import com.huami.watch.util.DeviceCompatibility;
import com.xiaomi.mipush.sdk.Constants;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest;
import com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack;
import com.ximalaya.ting.android.opensdk.model.track.Track;
import com.ximalaya.ting.android.opensdk.model.track.TrackList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class XimaDownloadActivity extends Activity {
    private static final String F = "XimaDownload";
    private LinearLayout B;
    private TrackAdapter e;
    private TextView f;
    private Button g;
    private TextView h;
    private ListView i;
    private f j;
    private TextView k;
    private String p;
    private String q;
    private ProgressBar r;
    private TextView s;
    private ImageView t;
    private RadiogroupCL u;
    private ScrollView v;
    private View y;
    private int z;
    private long a = 0;
    private int b = 1;
    private long c = 0;
    private int d = 50;
    private boolean l = false;
    private TrackList m = null;
    private TrackList n = null;
    private List<Boolean> o = new ArrayList();
    private String w = "#44DC2B0B";
    private String x = "#DC2B0B";
    private int A = -1;
    private boolean C = false;
    private boolean D = false;
    private long E = 0;

    public class TrackAdapter extends BaseAdapter {
        public TrackAdapter() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            if (XimaDownloadActivity.this.m == null || XimaDownloadActivity.this.m.getTracks() == null) {
                return 0;
            }
            Log.d(XimaDownloadActivity.F, "size is " + XimaDownloadActivity.this.m.getTracks().size());
            return XimaDownloadActivity.this.m.getTracks().size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return XimaDownloadActivity.this.m.getTracks().get(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            ViewHolder viewHolder;
            if (view == null) {
                view = LayoutInflater.from(XimaDownloadActivity.this.getApplicationContext()).inflate(R.layout.download_content, viewGroup, false);
                viewHolder = new ViewHolder();
                viewHolder.content = (ViewGroup) view;
                viewHolder.title = (TextView) view.findViewById(R.id.content_title);
                viewHolder.size = (TextView) view.findViewById(R.id.content_size);
                viewHolder.downloadStatue = (ImageView) view.findViewById(R.id.down_check);
                view.setTag(viewHolder);
            } else {
                viewHolder = (ViewHolder) view.getTag();
            }
            Track track = XimaDownloadActivity.this.m.getTracks().get(i);
            viewHolder.title.setText(track.getTrackTitle());
            viewHolder.size.setText(String.valueOf(track.getPlaySize64()));
            viewHolder.size.setText(XimalayaUtils.getAlbumSize(track.getPlaySize64(), XimaDownloadActivity.this, false));
            viewHolder.downloadStatue.setBackgroundResource(((Boolean) XimaDownloadActivity.this.o.get(i)).booleanValue() ? R.drawable.ic_chkbox_checked : R.drawable.ic_chkbox_normal);
            Log.d(XimaDownloadActivity.F, "title is " + track.getTrackTitle());
            viewHolder.content.setBackgroundColor(-1);
            return view;
        }
    }

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            XimaDownloadActivity.this.onBackPressed();
        }
    }

    public class b implements RadioGroup.OnCheckedChangeListener {
        public b() {
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i) {
            int checkedRadioButtonId = radioGroup.getCheckedRadioButtonId();
            XimaDownloadActivity.this.E(radioGroup, i);
            Log.d(XimaDownloadActivity.F, "checked id is " + checkedRadioButtonId);
        }
    }

    public class c implements AdapterView.OnItemClickListener {
        public c() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (i >= XimaDownloadActivity.this.o.size()) {
                return;
            }
            ImageView imageView = (ImageView) view.findViewById(R.id.down_check);
            XimaDownloadActivity.this.o.set(i, Boolean.valueOf(!((Boolean) XimaDownloadActivity.this.o.get(i)).booleanValue()));
            imageView.setBackgroundResource(((Boolean) XimaDownloadActivity.this.o.get(i)).booleanValue() ? R.drawable.ic_chkbox_checked : R.drawable.ic_chkbox_normal);
            XimaDownloadActivity.this.L();
        }
    }

    public class d implements AbsListView.OnScrollListener {
        public d() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i == 0) {
                int count = absListView.getCount();
                int i2 = count - 5;
                if (i2 <= 0) {
                    i2 = count - 1;
                }
                if (absListView.getLastVisiblePosition() > i2) {
                    if (XimaDownloadActivity.this.m == null || XimaDownloadActivity.this.b <= XimaDownloadActivity.this.m.getTotalPage()) {
                        XimaDownloadActivity.this.M();
                        XimaDownloadActivity.this.J();
                    }
                }
            }
        }
    }

    public class e implements IDataCallBack<TrackList> {
        public e() {
        }

        @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(TrackList trackList) {
            StringBuilder sb = new StringBuilder();
            sb.append("onSuccess ");
            sb.append(trackList != null);
            sb.append("tracks is null ");
            sb.append((trackList.getTracks() == null) | (trackList.getTracks().size() < 1));
            Log.e(XimaDownloadActivity.F, sb.toString());
            if (trackList.getTracks() != null && trackList.getTracks().size() != 0) {
                XimaDownloadActivity.this.b++;
                if (XimaDownloadActivity.this.m == null) {
                    XimaDownloadActivity.this.m = trackList;
                } else {
                    XimaDownloadActivity.this.m.getTracks().addAll(trackList.getTracks());
                }
                XimaDownloadActivity.this.e.notifyDataSetChanged();
                List<Track> tracks = XimaDownloadActivity.this.m.getTracks();
                for (int i = 0; i < tracks.size(); i++) {
                    if (i >= XimaDownloadActivity.this.o.size()) {
                        XimaDownloadActivity.this.o.add(Boolean.FALSE);
                    }
                }
            }
            XimaDownloadActivity.this.L();
            XimaDownloadActivity.this.G();
            XimaDownloadActivity.this.l = false;
        }

        @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
        public void onError(int i, String str) {
            XimaDownloadActivity.this.G();
            XimaDownloadActivity.this.l = false;
        }
    }

    public class f implements View.OnClickListener {

        public class a implements View.OnClickListener {
            public final /* synthetic */ int a;

            public a(int i) {
                this.a = i;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                XimaDownloadActivity ximaDownloadActivity = XimaDownloadActivity.this;
                ximaDownloadActivity.D = !ximaDownloadActivity.D;
                XimaDownloadActivity.this.C = false;
                XimaDownloadActivity.this.h.setText(XimaDownloadActivity.this.p);
                XimaDownloadActivity.this.v.setVisibility(4);
                TextView textView = XimaDownloadActivity.this.s;
                StringBuilder sb = new StringBuilder();
                sb.append((this.a * XimaDownloadActivity.this.d) + 1);
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                sb.append(((long) ((this.a + 1) * XimaDownloadActivity.this.d)) <= XimaDownloadActivity.this.E ? (this.a + 1) * XimaDownloadActivity.this.d : XimaDownloadActivity.this.E);
                textView.setText(sb.toString());
                XimaDownloadActivity.this.i.setVisibility(0);
                XimaDownloadActivity.this.o.clear();
                XimaDownloadActivity.this.K(this.a);
                XimaDownloadActivity.this.t.setBackgroundResource(R.drawable.arrow_down);
            }
        }

        private f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ImageView imageView;
            String string;
            int id = view.getId();
            int i = 0;
            if (id != R.id.package_par) {
                if (id != R.id.all_pick) {
                    if (id == R.id.download_now) {
                        Analytics.event(XimaDownloadActivity.this, AnalyticsEvents.EVENT_CLICK_ALBUM_PACKAGE_DOWNLOAD_NOW);
                        if (!DeviceManager.getManager(XimaDownloadActivity.this).isBoundDeviceConnected()) {
                            XimalayaUtils.showChanelDialog(XimaDownloadActivity.this);
                            return;
                        }
                        XimaDownloadActivity.this.n = new TrackList();
                        ArrayList arrayList = new ArrayList();
                        XimaDownloadActivity.this.e.getCount();
                        while (i < XimaDownloadActivity.this.o.size()) {
                            if (((Boolean) XimaDownloadActivity.this.o.get(i)).booleanValue()) {
                                arrayList.add(XimaDownloadActivity.this.m.getTracks().get(i));
                            }
                            i++;
                        }
                        Analytics.event(XimaDownloadActivity.this, AnalyticsEvents.EVENT_CLICK_ALBUM_PACKAGE_DOWNLOAD_COUNT_PER, arrayList.size());
                        XimaDownloadActivity.this.n.setTracks(arrayList);
                        XimalayaUtils.sendDownLoadCommand(XimalayaUtils.tracksToJsonList(XimaDownloadActivity.this.n));
                        return;
                    }
                    return;
                }
                Analytics.event(XimaDownloadActivity.this, AnalyticsEvents.EVENT_CLICK_ALBUM_PACKAGE_DOWNLOAD_ALLORNOT);
                XimaDownloadActivity ximaDownloadActivity = XimaDownloadActivity.this;
                ximaDownloadActivity.C = !ximaDownloadActivity.C;
                if (XimaDownloadActivity.this.C) {
                    XimaDownloadActivity.this.h.setText(XimaDownloadActivity.this.q);
                } else {
                    XimaDownloadActivity.this.h.setText(XimaDownloadActivity.this.p);
                }
                for (int i2 = 0; i2 < XimaDownloadActivity.this.o.size(); i2++) {
                    XimaDownloadActivity.this.o.set(i2, Boolean.valueOf(XimaDownloadActivity.this.C));
                }
                int count = XimaDownloadActivity.this.e.getCount();
                while (i < count) {
                    View childAt = XimaDownloadActivity.this.i.getChildAt(i);
                    if (childAt != null && (imageView = (ImageView) childAt.findViewById(R.id.down_check)) != null) {
                        imageView.setBackgroundResource(((Boolean) XimaDownloadActivity.this.o.get(i)).booleanValue() ? R.drawable.ic_chkbox_checked : R.drawable.ic_chkbox_normal);
                    }
                    i++;
                }
                XimaDownloadActivity.this.L();
                return;
            }
            XimaDownloadActivity ximaDownloadActivity2 = XimaDownloadActivity.this;
            ximaDownloadActivity2.D = !ximaDownloadActivity2.D;
            if (!XimaDownloadActivity.this.D) {
                XimaDownloadActivity.this.t.setBackgroundResource(R.drawable.arrow_down);
                XimaDownloadActivity.this.i.setVisibility(0);
                XimaDownloadActivity.this.v.setVisibility(4);
                TextView textView = XimaDownloadActivity.this.s;
                StringBuilder sb = new StringBuilder();
                sb.append(((XimaDownloadActivity.this.b - 2) * XimaDownloadActivity.this.d) + 1);
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                sb.append(((long) ((XimaDownloadActivity.this.b - 1) * XimaDownloadActivity.this.d)) <= XimaDownloadActivity.this.E ? (XimaDownloadActivity.this.b - 1) * XimaDownloadActivity.this.d : XimaDownloadActivity.this.E);
                textView.setText(sb.toString());
                return;
            }
            XimaDownloadActivity.this.t.setBackgroundResource(R.drawable.arrow_up);
            XimaDownloadActivity.this.i.setVisibility(4);
            XimaDownloadActivity.this.v.setVisibility(0);
            if (XimaDownloadActivity.this.u.getChildCount() == 0) {
                long j = XimaDownloadActivity.this.E / ((long) XimaDownloadActivity.this.d);
                int i3 = (int) (XimaDownloadActivity.this.E % ((long) XimaDownloadActivity.this.d));
                boolean z = ((int) (XimaDownloadActivity.this.E % ((long) XimaDownloadActivity.this.d))) == 1;
                if (j >= 0) {
                    Resources resources = XimaDownloadActivity.this.getResources();
                    int dimension = (int) resources.getDimension(R.dimen.xima_album_package_button_left);
                    int dimension2 = (int) resources.getDimension(R.dimen.xima_album_package_button_top);
                    resources.getDimension(R.dimen.xima_album_package_button_textsize);
                    if (!(i3 == 0)) {
                        j++;
                    }
                    int i4 = 0;
                    while (true) {
                        long j2 = i4;
                        if (j2 >= j) {
                            break;
                        }
                        RadioButton radioButton = new RadioButton(XimaDownloadActivity.this);
                        RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams((int) resources.getDimension(R.dimen.xima_album_package_width), (int) resources.getDimension(R.dimen.xima_album_package_height));
                        layoutParams.setMargins(dimension, dimension2, i, i);
                        radioButton.setId(i4);
                        radioButton.setGravity(17);
                        int i5 = R.drawable.bg_albumpackage_radiobutton;
                        radioButton.setBackgroundResource(i5);
                        radioButton.setButtonDrawable(i5);
                        radioButton.setTextColor(resources.getColor(R.color.xima_category_title_color));
                        if (j2 == j - 1) {
                            if (z) {
                                string = String.valueOf((XimaDownloadActivity.this.d * i4) + 1);
                            } else {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append((XimaDownloadActivity.this.d * i4) + 1);
                                sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                                int i6 = i4 + 1;
                                long j3 = XimaDownloadActivity.this.d * i6;
                                long j4 = XimaDownloadActivity.this.E;
                                XimaDownloadActivity ximaDownloadActivity3 = XimaDownloadActivity.this;
                                sb2.append(j3 <= j4 ? i6 * ximaDownloadActivity3.d : ximaDownloadActivity3.E);
                                string = sb2.toString();
                            }
                            radioButton.setText(string);
                        } else {
                            layoutParams = layoutParams;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append((XimaDownloadActivity.this.d * i4) + 1);
                            sb3.append(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                            int i7 = i4 + 1;
                            sb3.append(((long) (XimaDownloadActivity.this.d * i7)) <= XimaDownloadActivity.this.E ? i7 * XimaDownloadActivity.this.d : XimaDownloadActivity.this.E);
                            radioButton.setText(sb3.toString());
                        }
                        radioButton.setOnClickListener(new a(i4));
                        XimaDownloadActivity.this.u.addView(radioButton, layoutParams);
                        i4++;
                        i = 0;
                    }
                }
            }
            XimaDownloadActivity.this.u.check(XimaDownloadActivity.this.b - 2);
        }
    }

    private void D() {
        View viewInflate = View.inflate(this, R.layout.footview_loadmore, null);
        this.y = viewInflate;
        try {
            viewInflate.measure(0, 0);
            int measuredHeight = this.y.getMeasuredHeight();
            this.z = measuredHeight;
            this.y.setPadding(0, 0, 0, -measuredHeight);
            this.i.addFooterView(this.y);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E(RadioGroup radioGroup, int i) {
        RadioButton radioButton = (RadioButton) radioGroup.getChildAt(i);
        if (radioButton == null) {
            return;
        }
        radioButton.setTextColor(getResources().getColor(R.color.xima_button_checked_color));
        int i2 = this.A;
        if (i2 != -1 && i2 != i) {
            ((RadioButton) radioGroup.getChildAt(i2)).setTextColor(getResources().getColor(R.color.xima_category_title_color));
        }
        this.A = i;
    }

    private void F() {
        long j = this.c;
        if (j != 0) {
            this.f.setText(getString(R.string.xima_album_totalcounts, new Object[]{String.valueOf(j)}));
        }
        this.k.setText(getString(R.string.xima_watchspace, new Object[]{XimalayaUtils.getWatchSpace(this)}));
        this.r.setMax((int) XimalayaUtils.getWatchSpaceTotal(this));
        this.r.setProgress((int) XimalayaUtils.getWatchSpaceRest(this));
        TextView textView = this.s;
        StringBuilder sb = new StringBuilder();
        sb.append(((this.b - 1) * this.d) + 1);
        sb.append(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
        int i = this.b;
        int i2 = this.d;
        long j2 = i * i2;
        long j3 = this.E;
        if (j2 <= j3) {
            j3 = i * i2;
        }
        sb.append(j3);
        textView.setText(sb.toString());
        L();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G() {
        this.y.setPadding(0, 0, 0, -this.z);
    }

    private void H() {
        CommonRequest.getInstanse().setDefaultPagesize(this.d);
        this.a = getIntent().getLongExtra(DTransferConstants.ALBUM_ID, 0L);
        this.E = getIntent().getLongExtra("album_count", 0L);
        this.p = getString(R.string.xima_allpick);
        this.q = getString(R.string.xima_allpick_no);
    }

    private void I() {
        ActionbarLayout actionbarLayout = (ActionbarLayout) findViewById(R.id.actionbar_search);
        actionbarLayout.setTitleText(getString(R.string.xima_package_download));
        actionbarLayout.setBackArrowClickListener(new a());
        this.i = (ListView) findViewById(R.id.package_download_list);
        Button button = (Button) findViewById(R.id.download_now);
        this.g = button;
        button.setBackgroundResource(R.drawable.bg_album_button_noclick);
        this.g.setTextColor(Color.parseColor(this.w));
        this.g.setClickable(false);
        this.h = (TextView) findViewById(R.id.all_pick);
        this.f = (TextView) findViewById(R.id.album_totalcount);
        this.k = (TextView) findViewById(R.id.watch_space);
        this.r = (ProgressBar) findViewById(R.id.album_watch_space_progress);
        this.B = (LinearLayout) findViewById(R.id.package_par);
        this.t = (ImageView) findViewById(R.id.package_ig);
        this.s = (TextView) findViewById(R.id.album_package);
        this.u = (RadiogroupCL) findViewById(R.id.album_package_group);
        this.v = (ScrollView) findViewById(R.id.album_package_group_par);
        f fVar = new f();
        this.j = fVar;
        this.g.setOnClickListener(fVar);
        this.h.setOnClickListener(this.j);
        this.B.setOnClickListener(this.j);
        this.e = new TrackAdapter();
        D();
        this.i.setAdapter((ListAdapter) this.e);
        this.i.setVerticalScrollBarEnabled(false);
        this.u.setOnCheckedChangeListener(new b());
        this.i.setOnItemClickListener(new c());
        this.i.setOnScrollListener(new d());
        F();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        if (this.l || this.a == 0) {
            return;
        }
        this.l = true;
        HashMap map = new HashMap();
        map.put(DTransferConstants.ALBUM_ID, "" + this.a);
        map.put("sort", "asc");
        map.put(DTransferConstants.PAGE, "" + this.b);
        CommonRequest.getTracks(map, new e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K(int i) {
        this.m = null;
        this.b = i + 1;
        J();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L() {
        List<Boolean> list = this.o;
        boolean zBooleanValue = false;
        if (list != null && list.size() > 0) {
            for (Boolean bool : this.o) {
                if (bool.booleanValue()) {
                    zBooleanValue = bool.booleanValue();
                }
            }
        }
        this.g.setTextColor(Color.parseColor(zBooleanValue ? this.x : this.w));
        this.g.setBackgroundResource(zBooleanValue ? R.drawable.selector_button_background : R.drawable.bg_album_button_noclick);
        this.g.setClickable(zBooleanValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M() {
        this.y.setPadding(0, 0, 0, 0);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.xima_download_list);
        DeviceCompatibility.setStatusBarDarkMode(this, true);
        H();
        I();
        J();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        CommonRequest.getInstanse().setDefaultPagesize(this.d);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        CommonRequest.getInstanse().setDefaultPagesize(this.d);
    }
}
