package com.huami.watch.companion.ximalaya;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bumptech.glide.Glide;
import com.huami.watch.companion.R;
import com.huami.watch.companion.util.AnalyticsEvents;
import com.huami.watch.util.Analytics;
import com.huami.watch.util.Log;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest;
import com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack;
import com.ximalaya.ting.android.opensdk.model.album.Album;
import com.ximalaya.ting.android.opensdk.model.album.SearchAlbumList;
import com.ximalaya.ting.android.opensdk.model.track.TrackHotList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes16.dex */
public class XimaSearchAlbumFragment extends Fragment {
    private static final String n = "XimaSearchAlbumFragment";
    private Context a;
    private ListView b;
    private TrackAdapter c;
    private CommonRequest g;
    private TextView h;
    private View i;
    private int j;
    private XimalayaSearchingActivity k;
    private int d = 1;
    private TrackHotList e = null;
    private boolean f = false;
    private String l = null;
    private SearchAlbumList m = null;

    public class TrackAdapter extends BaseAdapter {
        public TrackAdapter() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            if (XimaSearchAlbumFragment.this.m == null || XimaSearchAlbumFragment.this.m.getAlbums() == null) {
                return 0;
            }
            Log.d(XimaSearchAlbumFragment.n, "size is " + XimaSearchAlbumFragment.this.m.getAlbums().size(), new Object[0]);
            return XimaSearchAlbumFragment.this.m.getAlbums().size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return XimaSearchAlbumFragment.this.m.getAlbums().get(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            ViewHolder viewHolder;
            if (view == null) {
                view = LayoutInflater.from(XimaSearchAlbumFragment.this.a).inflate(R.layout.album_item, viewGroup, false);
                viewHolder = new ViewHolder();
                viewHolder.content = (ViewGroup) view;
                viewHolder.cover = (ImageView) view.findViewById(R.id.item_icon);
                viewHolder.title = (TextView) view.findViewById(R.id.item_title);
                viewHolder.author = (TextView) view.findViewById(R.id.item_author);
                viewHolder.playcount = (TextView) view.findViewById(R.id.item_displaycount);
                viewHolder.totalcount = (TextView) view.findViewById(R.id.item_totalcount);
                view.setTag(viewHolder);
            } else {
                viewHolder = (ViewHolder) view.getTag();
            }
            Album album = XimaSearchAlbumFragment.this.m.getAlbums().get(i);
            viewHolder.title.setText(album.getAlbumTitle());
            viewHolder.author.setText(XimaSearchAlbumFragment.this.a.getString(R.string.xima_album_author, album.getAnnouncer().getNickname()));
            viewHolder.playcount.setText(XimalayaUtils.getStringPlayCount(Long.valueOf(album.getPlayCount())));
            viewHolder.totalcount.setText(String.valueOf(album.getIncludeTrackCount()));
            android.util.Log.d(XimaSearchAlbumFragment.n, "title is " + album.getAlbumTitle());
            Glide.with(XimaSearchAlbumFragment.this).load(album.getCoverUrlMiddle()).into(viewHolder.cover);
            viewHolder.content.setBackgroundColor(-1);
            return view;
        }
    }

    public class a implements IDataCallBack<SearchAlbumList> {
        public a() {
        }

        @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(SearchAlbumList searchAlbumList) {
            StringBuilder sb = new StringBuilder();
            sb.append("onSuccess ");
            sb.append(searchAlbumList != null);
            Log.d(XimaSearchAlbumFragment.n, sb.toString(), new Object[0]);
            if (searchAlbumList != null && searchAlbumList.getAlbums() != null && searchAlbumList.getAlbums().size() != 0) {
                XimaSearchAlbumFragment.this.d++;
                if (XimaSearchAlbumFragment.this.m == null) {
                    XimaSearchAlbumFragment.this.m = searchAlbumList;
                } else {
                    XimaSearchAlbumFragment.this.m.getAlbums().addAll(searchAlbumList.getAlbums());
                }
                XimaSearchAlbumFragment.this.p();
                if (XimaSearchAlbumFragment.this.c == null) {
                    return;
                }
                XimaSearchAlbumFragment.this.c.notifyDataSetChanged();
                Iterator<Album> it2 = searchAlbumList.getAlbums().iterator();
                while (it2.hasNext()) {
                    Log.d(XimaSearchAlbumFragment.n, "edittext result is " + it2.next().toString(), new Object[0]);
                }
                XimaSearchAlbumFragment.this.s();
            } else if (XimaSearchAlbumFragment.this.d == 1) {
                XimaSearchAlbumFragment.this.r();
            }
            XimaSearchAlbumFragment.this.f = false;
        }

        @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
        public void onError(int i, String str) {
            Log.d(XimaSearchAlbumFragment.n, "edittext onerror reason is " + str, new Object[0]);
            XimaSearchAlbumFragment.this.r();
            XimaSearchAlbumFragment.this.f = false;
        }
    }

    public class b implements AbsListView.OnScrollListener {
        public b() {
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
                    if (XimaSearchAlbumFragment.this.e == null || XimaSearchAlbumFragment.this.d <= XimaSearchAlbumFragment.this.e.getTotalPage()) {
                        XimaSearchAlbumFragment.this.q();
                        XimaSearchAlbumFragment ximaSearchAlbumFragment = XimaSearchAlbumFragment.this;
                        ximaSearchAlbumFragment.loadData(ximaSearchAlbumFragment.l);
                    }
                }
            }
        }
    }

    public class c implements AdapterView.OnItemClickListener {
        public c() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            Analytics.event(XimaSearchAlbumFragment.this.k, AnalyticsEvents.EVENT_CLICK_INSERT_SEARCH_ALBUM);
            if (i >= XimaSearchAlbumFragment.this.m.getAlbums().size()) {
                return;
            }
            Intent intent = new Intent(XimaSearchAlbumFragment.this.a, (Class<?>) XimaAlbumActivity.class);
            intent.putExtra(DTransferConstants.ALBUM_ID, XimaSearchAlbumFragment.this.m.getAlbums().get(i).getId());
            intent.putExtra(XimalayaUtils.SEARCH_ALBUM, XimaSearchAlbumFragment.this.m.getAlbums().get(i));
            XimaSearchAlbumFragment.this.startActivity(intent);
        }
    }

    private boolean o() {
        TrackHotList trackHotList = this.e;
        return trackHotList == null || trackHotList.getTotalPage() > this.d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        View view = this.i;
        if (view != null) {
            view.setPadding(0, 0, 0, -this.j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        View view = this.i;
        if (view != null) {
            view.setPadding(0, 0, 0, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        TextView textView = this.h;
        if (textView == null || this.b == null) {
            return;
        }
        textView.setVisibility(0);
        this.b.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        TextView textView = this.h;
        if (textView == null || this.b == null) {
            return;
        }
        textView.setVisibility(8);
        this.b.setVisibility(0);
    }

    public void addFootView() {
        if (getContext() != null) {
            try {
                View view = this.i;
                if (view == null) {
                    View viewInflate = View.inflate(getContext(), R.layout.footview_loadmore, null);
                    this.i = viewInflate;
                    viewInflate.measure(0, 0);
                    this.j = this.i.getMeasuredHeight();
                } else {
                    view.setPadding(0, 0, 0, -this.j);
                    this.b.addFooterView(this.i);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void deleteFootView() {
        View view;
        ListView listView = this.b;
        if (listView == null || (view = this.i) == null) {
            return;
        }
        listView.removeFooterView(view);
    }

    public void loadData(String str) {
        loadData(str, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        Log.i(n, "onActivityCreated", new Object[0]);
        super.onActivityCreated(bundle);
        this.a = getActivity();
        this.g = CommonRequest.getInstanse();
        if (getActivity() instanceof XimalayaSearchingActivity) {
            XimalayaSearchingActivity ximalayaSearchingActivity = (XimalayaSearchingActivity) getActivity();
            this.k = ximalayaSearchingActivity;
            this.l = ximalayaSearchingActivity.getSeachString();
        }
        loadData(this.l);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreate(bundle);
        CommonRequest.getInstanse().setDefaultPagesize(20);
        View viewInflate = layoutInflater.inflate(R.layout.fragment_xima_search_album, viewGroup, false);
        this.b = (ListView) viewInflate.findViewById(R.id.search_album);
        this.c = new TrackAdapter();
        addFootView();
        this.b.setAdapter((ListAdapter) this.c);
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setOnScrollListener(new b());
        this.b.setOnItemClickListener(new c());
        this.h = (TextView) viewInflate.findViewById(R.id.nodata);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        Log.i(n, "onDestroyView", new Object[0]);
        super.onDestroyView();
    }

    public void refresh() {
        Log.d(n, "---refresh", new Object[0]);
        if (o()) {
            loadData(this.l);
        }
    }

    public void setResource(String str) {
        this.l = str;
    }

    public void loadData(String str, boolean z) {
        if (this.f || str == null) {
            return;
        }
        this.l = str;
        this.f = true;
        if (z) {
            this.m = null;
            this.d = 1;
        }
        HashMap map = new HashMap();
        map.put(DTransferConstants.SEARCH_KEY, str);
        map.put(DTransferConstants.PAGE, "" + this.d);
        map.put(DTransferConstants.CALC_DIMENSION, "3");
        CommonRequest.getSearchedAlbums(map, new a());
    }
}
