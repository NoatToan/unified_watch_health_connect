package com.huami.watch.companion.ximalaya;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
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
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.huami.watch.companion.R;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.ui.view.ActionbarLayout;
import com.huami.watch.companion.util.AnalyticsEvents;
import com.huami.watch.util.Analytics;
import com.huami.watch.util.DeviceCompatibility;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.mipush.sdk.Constants;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest;
import com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack;
import com.ximalaya.ting.android.opensdk.model.album.Album;
import com.ximalaya.ting.android.opensdk.model.track.Track;
import com.ximalaya.ting.android.opensdk.model.track.TrackList;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class XimaAlbumActivity extends Activity {
    private static final String C = "XimaAlbum";
    private Album c;
    private TextView d;
    private TextView e;
    private TextView f;
    private TextView g;
    private TextView h;
    private TextView i;
    private TextView j;
    private TextView k;
    private ImageView l;
    private TextView m;
    private ListView n;
    private TrackAdapter o;
    private Button q;
    private Button r;
    private RadiogroupCL s;
    private ProgressBar u;
    private ScrollView w;
    private View x;
    private int y;
    private boolean a = false;
    private TrackList b = null;
    private int p = 1;
    private long t = 0;
    private int v = -1;
    private boolean z = false;
    private List<Integer> A = new ArrayList();
    private boolean B = true;

    public class TrackAdapter extends BaseAdapter {
        public TrackAdapter() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            if (XimaAlbumActivity.this.b == null || XimaAlbumActivity.this.b.getTracks() == null) {
                return 0;
            }
            Log.d(XimaAlbumActivity.C, "size is " + XimaAlbumActivity.this.b.getTracks().size());
            return XimaAlbumActivity.this.b.getTracks().size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return XimaAlbumActivity.this.b.getTracks().get(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            ViewHolder viewHolder;
            if (view == null) {
                view = LayoutInflater.from(XimaAlbumActivity.this.getApplicationContext()).inflate(R.layout.album_content, viewGroup, false);
                viewHolder = new ViewHolder();
                viewHolder.content = (ViewGroup) view;
                viewHolder.title = (TextView) view.findViewById(R.id.content_title);
                viewHolder.size = (TextView) view.findViewById(R.id.content_size);
                viewHolder.time = (TextView) view.findViewById(R.id.content_long);
                viewHolder.downloadStatue = (ImageView) view.findViewById(R.id.content_download_ig);
                view.setTag(viewHolder);
            } else {
                viewHolder = (ViewHolder) view.getTag();
            }
            Track track = XimaAlbumActivity.this.b.getTracks().get(i);
            viewHolder.title.setText(track.getTrackTitle());
            viewHolder.size.setText(XimalayaUtils.getAlbumSize(track.getPlaySize64(), XimaAlbumActivity.this));
            viewHolder.time.setText(XimaAlbumActivity.this.getAlbumTime(track.getDuration()));
            Log.d(XimaAlbumActivity.C, "title is " + track.getTrackTitle());
            viewHolder.content.setBackgroundColor(-1);
            if (XimaAlbumActivity.this.A.get(i) != null) {
                viewHolder.downloadStatue.setBackgroundResource(((Integer) XimaAlbumActivity.this.A.get(i)).intValue());
            }
            return view;
        }
    }

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            XimaAlbumActivity.this.onBackPressed();
        }
    }

    public class b implements RadioGroup.OnCheckedChangeListener {
        public b() {
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i) {
            int checkedRadioButtonId = radioGroup.getCheckedRadioButtonId();
            XimaAlbumActivity.this.y(radioGroup, i);
            Log.d(XimaAlbumActivity.C, "checked id is " + checkedRadioButtonId);
        }
    }

    public class c implements AbsListView.OnScrollListener {
        public c() {
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
                    if (XimaAlbumActivity.this.b == null || XimaAlbumActivity.this.p <= XimaAlbumActivity.this.b.getTotalPage()) {
                        XimaAlbumActivity.this.G();
                        XimaAlbumActivity ximaAlbumActivity = XimaAlbumActivity.this;
                        ximaAlbumActivity.E(ximaAlbumActivity.B);
                    }
                }
            }
        }
    }

    public class d implements AdapterView.OnItemClickListener {
        public d() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            Analytics.event(XimaAlbumActivity.this, AnalyticsEvents.EVENT_CLICK_ALBUM_DOWNLOAD);
            if (!DeviceManager.getManager(XimaAlbumActivity.this).isBoundDeviceConnected()) {
                XimalayaUtils.showChanelDialog(XimaAlbumActivity.this);
                return;
            }
            if (i >= XimaAlbumActivity.this.A.size()) {
                return;
            }
            XimaAlbumActivity.this.A.set(i, Integer.valueOf(R.drawable.download_p));
            view.findViewById(R.id.content_download_ig).setBackgroundResource(((Integer) XimaAlbumActivity.this.A.get(i)).intValue());
            if (i >= XimaAlbumActivity.this.b.getTracks().size()) {
                return;
            }
            XimalayaUtils.sendDownLoadCommand(XimalayaUtils.tracksToJsonList(XimaAlbumActivity.this.b.getTracks().get(i)));
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
            Log.e(XimaAlbumActivity.C, sb.toString());
            if (trackList.getTracks() != null && trackList.getTracks().size() != 0) {
                XimaAlbumActivity.this.p++;
                if (XimaAlbumActivity.this.b == null) {
                    XimaAlbumActivity.this.b = trackList;
                } else {
                    XimaAlbumActivity.this.b.getTracks().addAll(trackList.getTracks());
                }
                List<Track> tracks = XimaAlbumActivity.this.b.getTracks();
                for (int i = 0; i < tracks.size(); i++) {
                    if (i >= XimaAlbumActivity.this.A.size()) {
                        XimaAlbumActivity.this.A.add(Integer.valueOf(R.drawable.download));
                    }
                }
                XimaAlbumActivity.this.o.notifyDataSetChanged();
            }
            XimaAlbumActivity.this.A();
            XimaAlbumActivity.this.a = false;
            XimaAlbumActivity.this.n.setVisibility(0);
        }

        @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
        public void onError(int i, String str) {
            XimaAlbumActivity.this.A();
            XimaAlbumActivity.this.a = false;
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
                XimaAlbumActivity ximaAlbumActivity = XimaAlbumActivity.this;
                ximaAlbumActivity.z = !ximaAlbumActivity.z;
                XimaAlbumActivity.this.j.setTextColor(XimaAlbumActivity.this.getResources().getColor(R.color.xima_category_title_color));
                XimaAlbumActivity.this.k.setTextColor(-16777216);
                XimaAlbumActivity.this.k.setFocusable(true);
                XimaAlbumActivity.this.k.setClickable(true);
                XimaAlbumActivity.this.w.setVisibility(4);
                XimaAlbumActivity.this.A.clear();
                XimaAlbumActivity.this.F(this.a);
            }
        }

        private f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            XimaAlbumActivity ximaAlbumActivity;
            int i;
            String string;
            int id = view.getId();
            if (id == R.id.detail_introduce) {
                Analytics.event(XimaAlbumActivity.this, AnalyticsEvents.EVENT_CLICK_ALBUM_INTRODUCE);
                Intent intent = new Intent(XimaAlbumActivity.this, (Class<?>) XimaIntroduceActivity.class);
                intent.putExtra("detail_introduce", XimaAlbumActivity.this.c.getAlbumIntro());
                XimaAlbumActivity.this.startActivity(intent);
                return;
            }
            if (id == R.id.pack_download) {
                Analytics.event(XimaAlbumActivity.this, AnalyticsEvents.EVENT_CLICK_ALBUM_PACKAGE_DOWNLOAD);
                Intent intent2 = new Intent(XimaAlbumActivity.this, (Class<?>) XimaDownloadActivity.class);
                intent2.putExtra(DTransferConstants.ALBUM_ID, XimaAlbumActivity.this.c.getId());
                intent2.putExtra("album_count", XimaAlbumActivity.this.c.getIncludeTrackCount());
                XimaAlbumActivity.this.startActivity(intent2);
                return;
            }
            if (id != R.id.album_package) {
                if (id == R.id.album_order) {
                    Analytics.event(XimaAlbumActivity.this, AnalyticsEvents.EVENT_CLICK_ALBUM_ORDER);
                    XimaAlbumActivity ximaAlbumActivity2 = XimaAlbumActivity.this;
                    ximaAlbumActivity2.B = !ximaAlbumActivity2.B;
                    XimaAlbumActivity.this.b = null;
                    XimaAlbumActivity.this.A.clear();
                    XimaAlbumActivity.this.p = 1;
                    XimaAlbumActivity ximaAlbumActivity3 = XimaAlbumActivity.this;
                    ximaAlbumActivity3.E(ximaAlbumActivity3.B);
                    TextView textView = XimaAlbumActivity.this.k;
                    if (XimaAlbumActivity.this.B) {
                        ximaAlbumActivity = XimaAlbumActivity.this;
                        i = R.string.xima_album_order_desc;
                    } else {
                        ximaAlbumActivity = XimaAlbumActivity.this;
                        i = R.string.xima_album_order_asc;
                    }
                    textView.setText(ximaAlbumActivity.getString(i));
                    return;
                }
                return;
            }
            Analytics.event(XimaAlbumActivity.this, AnalyticsEvents.EVENT_CLICK_ALBUM_PACKAGE);
            XimaAlbumActivity ximaAlbumActivity4 = XimaAlbumActivity.this;
            ximaAlbumActivity4.z = !ximaAlbumActivity4.z;
            if (!XimaAlbumActivity.this.z) {
                XimaAlbumActivity.this.j.setTextColor(XimaAlbumActivity.this.getResources().getColor(R.color.xima_category_title_color));
                XimaAlbumActivity.this.n.setVisibility(0);
                XimaAlbumActivity.this.w.setVisibility(4);
                XimaAlbumActivity.this.k.setTextColor(-16777216);
                XimaAlbumActivity.this.k.setFocusable(true);
                XimaAlbumActivity.this.k.setClickable(true);
                return;
            }
            XimaAlbumActivity.this.j.setTextColor(XimaAlbumActivity.this.getResources().getColor(R.color.xima_album_button_text_color));
            XimaAlbumActivity.this.n.setVisibility(4);
            XimaAlbumActivity.this.w.setVisibility(0);
            XimaAlbumActivity.this.k.setTextColor(-7829368);
            XimaAlbumActivity.this.k.setFocusable(false);
            XimaAlbumActivity.this.k.setClickable(false);
            if (XimaAlbumActivity.this.s.getChildCount() == 0) {
                long j = XimaAlbumActivity.this.t / 20;
                int i2 = (int) (XimaAlbumActivity.this.t % 20);
                boolean z = ((int) (XimaAlbumActivity.this.t % 20)) == 1;
                if (j >= 0) {
                    Resources resources = XimaAlbumActivity.this.getResources();
                    int dimension = (int) resources.getDimension(R.dimen.xima_album_package_button_left);
                    int dimension2 = (int) resources.getDimension(R.dimen.xima_album_package_button_top);
                    resources.getDimension(R.dimen.xima_album_package_button_textsize);
                    if (!(i2 == 0)) {
                        j++;
                    }
                    int i3 = 0;
                    while (true) {
                        long j2 = i3;
                        if (j2 >= j) {
                            break;
                        }
                        RadioButton radioButton = new RadioButton(XimaAlbumActivity.this);
                        RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams((int) resources.getDimension(R.dimen.xima_album_package_width), (int) resources.getDimension(R.dimen.xima_album_package_height));
                        layoutParams.setMargins(dimension, dimension2, 0, 0);
                        radioButton.setId(i3);
                        radioButton.setGravity(17);
                        int i4 = R.drawable.bg_albumpackage_radiobutton;
                        radioButton.setBackgroundResource(i4);
                        radioButton.setButtonDrawable(i4);
                        radioButton.setTextColor(resources.getColor(R.color.xima_category_title_color));
                        if (j2 == j - 1) {
                            if (z) {
                                string = String.valueOf((i3 * 20) + 1);
                            } else {
                                StringBuilder sb = new StringBuilder();
                                sb.append((i3 * 20) + 1);
                                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                                long j3 = (i3 + 1) * 20;
                                if (j3 > XimaAlbumActivity.this.t) {
                                    j3 = XimaAlbumActivity.this.t;
                                }
                                sb.append(j3);
                                string = sb.toString();
                            }
                            radioButton.setText(string);
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append((i3 * 20) + 1);
                            sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                            long j4 = (i3 + 1) * 20;
                            if (j4 > XimaAlbumActivity.this.t) {
                                j4 = XimaAlbumActivity.this.t;
                            }
                            sb2.append(j4);
                            radioButton.setText(sb2.toString());
                        }
                        radioButton.setOnClickListener(new a(i3));
                        XimaAlbumActivity.this.s.addView(radioButton, layoutParams);
                        i3++;
                    }
                }
            }
            XimaAlbumActivity.this.s.check(XimaAlbumActivity.this.p - 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A() {
        this.x.setPadding(0, 0, 0, -this.y);
    }

    private void B() {
        this.c = (Album) getIntent().getParcelableExtra(XimalayaUtils.SEARCH_ALBUM);
    }

    private void C() {
        CommonRequest.getInstanse().setDefaultPagesize(20);
        ActionbarLayout actionbarLayout = (ActionbarLayout) findViewById(R.id.actionbar_search);
        actionbarLayout.setTitleText(getString(R.string.xima_detail_album));
        actionbarLayout.setBackArrowClickListener(new a());
        this.d = (TextView) findViewById(R.id.album_introduce_title);
        this.e = (TextView) findViewById(R.id.album_introduce_author);
        this.f = (TextView) findViewById(R.id.album_introduce_times);
        this.g = (TextView) findViewById(R.id.album_introduce_update);
        this.h = (TextView) findViewById(R.id.album_introduce_category);
        this.i = (TextView) findViewById(R.id.album_totalcount);
        this.j = (TextView) findViewById(R.id.album_package);
        this.k = (TextView) findViewById(R.id.album_order);
        this.l = (ImageView) findViewById(R.id.album_largeicon);
        this.m = (TextView) findViewById(R.id.album_watch_space);
        this.u = (ProgressBar) findViewById(R.id.album_watch_space_progress);
        this.n = (ListView) findViewById(R.id.album_list);
        this.q = (Button) findViewById(R.id.detail_introduce);
        this.r = (Button) findViewById(R.id.pack_download);
        this.s = (RadiogroupCL) findViewById(R.id.album_package_group);
        this.w = (ScrollView) findViewById(R.id.album_package_group_par);
        this.s.setOnCheckedChangeListener(new b());
        f fVar = new f();
        this.q.setOnClickListener(fVar);
        this.r.setOnClickListener(fVar);
        this.k.setOnClickListener(fVar);
        this.j.setOnClickListener(fVar);
        this.o = new TrackAdapter();
        x();
        this.n.setAdapter((ListAdapter) this.o);
        this.n.setVerticalScrollBarEnabled(false);
        this.n.setOnScrollListener(new c());
        this.n.setOnItemClickListener(new d());
    }

    private void D() {
        E(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E(boolean z) {
        if (this.a) {
            return;
        }
        this.a = true;
        HashMap map = new HashMap();
        map.put(DTransferConstants.ALBUM_ID, "" + this.c.getId());
        map.put("sort", z ? "asc" : "desc");
        map.put(DTransferConstants.PAGE, "" + this.p);
        Log.d(StatEvent.MINE_KINGKONG_C_ORDER_VALUE, "mAlbum.getId" + this.c.getId() + " mAlbum.getCategoryId " + this.c.getCategoryId() + " mAlbum.getBasedRelativeAlbumId " + this.c.getBasedRelativeAlbumId());
        CommonRequest.getTracks(map, new e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F(int i) {
        this.b = null;
        this.p = i + 1;
        D();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G() {
        this.x.setPadding(0, 0, 0, 0);
    }

    private void x() {
        View viewInflate = View.inflate(this, R.layout.footview_loadmore, null);
        this.x = viewInflate;
        try {
            viewInflate.measure(0, 0);
            int measuredHeight = this.x.getMeasuredHeight();
            this.y = measuredHeight;
            this.x.setPadding(0, 0, 0, -measuredHeight);
            this.n.addFooterView(this.x);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y(RadioGroup radioGroup, int i) {
        RadioButton radioButton;
        RadioButton radioButton2 = (RadioButton) radioGroup.getChildAt(i);
        if (radioButton2 != null) {
            radioButton2.setTextColor(getResources().getColor(R.color.xima_button_checked_color));
        }
        int i2 = this.v;
        if (i2 != -1 && i2 != i && (radioButton = (RadioButton) radioGroup.getChildAt(i2)) != null) {
            radioButton.setTextColor(getResources().getColor(R.color.xima_category_title_color));
        }
        this.v = i;
    }

    private void z() {
        Album album = this.c;
        if (album != null) {
            this.d.setText(album.getAlbumTitle());
            Glide.with((Activity) this).load(this.c.getCoverUrlLarge()).into(this.l);
            this.e.setText(getString(R.string.xima_album_author, new Object[]{this.c.getAnnouncer().getNickname()}));
            this.f.setText(getString(R.string.xima_album_times, new Object[]{XimalayaUtils.getStringPlayCount(Long.valueOf(this.c.getPlayCount()))}));
            this.g.setText(getString(R.string.xima_album_update, new Object[]{getDates(Long.valueOf(this.c.getUpdatedAt()))}));
            this.t = this.c.getIncludeTrackCount();
            this.i.setText(getString(R.string.xima_album_totalcounts, new Object[]{String.valueOf(this.c.getIncludeTrackCount())}));
            SharedPreferences sharedPreferences = getSharedPreferences("categories", 0);
            Log.d(C, "categories id is " + this.c.getCategoryId());
            this.h.setText(getString(R.string.xima_album_category, new Object[]{sharedPreferences.getString(String.valueOf(this.c.getId()), "无分类")}));
            this.m.setText(getString(R.string.xima_watchspace, new Object[]{XimalayaUtils.getWatchSpace(this)}));
            this.u.setMax((int) XimalayaUtils.getWatchSpaceTotal(this));
            this.u.setProgress((int) XimalayaUtils.getWatchSpaceRest(this));
        }
    }

    public String getAlbumTime(int i) {
        int i2 = i / 60;
        int i3 = i - (i2 * 60);
        StringBuffer stringBuffer = new StringBuffer();
        if (i2 < 10) {
            stringBuffer.append("0");
            stringBuffer.append(i2);
            stringBuffer.append(":");
        } else {
            stringBuffer.append(i2);
            stringBuffer.append(":");
        }
        if (i3 < 10) {
            stringBuffer.append("0");
            stringBuffer.append(i3);
        } else {
            stringBuffer.append(i3);
        }
        return stringBuffer.toString();
    }

    public String getDates(Long l) {
        return new SimpleDateFormat(getString(R.string.xima_date_format)).format(new Date(l.longValue()));
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.xima_album);
        DeviceCompatibility.setStatusBarDarkMode(this, true);
        B();
        C();
        z();
        E(this.B);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        CommonRequest.getInstanse().setDefaultPagesize(20);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        CommonRequest.getInstanse().setDefaultPagesize(20);
    }
}
