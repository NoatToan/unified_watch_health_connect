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
import com.huami.watch.util.Log;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest;
import com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack;
import com.ximalaya.ting.android.opensdk.model.album.Album;
import com.ximalaya.ting.android.opensdk.model.album.AlbumList;
import com.ximalaya.ting.android.opensdk.model.metadata.Attributes;
import com.ximalaya.ting.android.opensdk.model.metadata.MetaData;
import com.ximalaya.ting.android.opensdk.model.metadata.MetaDataList;
import com.ximalaya.ting.android.opensdk.model.track.TrackHotList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes16.dex */
public class XimaCategoryDetailFragment extends Fragment {
    private static final String r = "XimaCategoryDetailFragment";
    private Context a;
    private ListView b;
    private TrackAdapter c;
    private CommonRequest g;
    private TextView h;
    private View i;
    private int j;
    private MetaDataList n;
    private MetaData o;
    private int d = 1;
    private TrackHotList e = null;
    private boolean f = false;
    private AlbumList k = null;
    private long l = 0;
    private int m = 0;
    private Attributes p = null;
    private String q = null;

    public class TrackAdapter extends BaseAdapter {
        public TrackAdapter() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            if (XimaCategoryDetailFragment.this.k == null || XimaCategoryDetailFragment.this.k.getAlbums() == null) {
                return 0;
            }
            return XimaCategoryDetailFragment.this.k.getAlbums().size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return XimaCategoryDetailFragment.this.k.getAlbums().get(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            ViewHolder viewHolder;
            if (view == null) {
                view = LayoutInflater.from(XimaCategoryDetailFragment.this.a).inflate(R.layout.album_item, viewGroup, false);
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
            Album album = XimaCategoryDetailFragment.this.k.getAlbums().get(i);
            viewHolder.title.setText(album.getAlbumTitle());
            viewHolder.author.setText(XimaCategoryDetailFragment.this.a.getString(R.string.xima_album_author, album.getAnnouncer().getNickname()));
            viewHolder.playcount.setText(XimalayaUtils.getStringPlayCount(Long.valueOf(album.getPlayCount())));
            viewHolder.totalcount.setText(XimaCategoryDetailFragment.this.a.getString(R.string.xima_album_counts, String.valueOf(album.getIncludeTrackCount())));
            if (XimaCategoryDetailFragment.this.getActivity() != null) {
                Glide.with(XimaCategoryDetailFragment.this.getActivity()).load(album.getCoverUrlMiddle()).into(viewHolder.cover);
            }
            return view;
        }
    }

    public class a implements IDataCallBack<AlbumList> {
        public a() {
        }

        @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(AlbumList albumList) {
            Log.d(XimaCategoryDetailFragment.r, "XimaCategoryDetailFragment  success ", new Object[0]);
            if (albumList != null && albumList.getAlbums() != null && albumList.getAlbums().size() != 0) {
                XimaCategoryDetailFragment.this.h.setVisibility(8);
                XimaCategoryDetailFragment.this.b.setVisibility(0);
                XimaCategoryDetailFragment.this.d++;
                if (XimaCategoryDetailFragment.this.k == null) {
                    XimaCategoryDetailFragment.this.k = albumList;
                } else {
                    XimaCategoryDetailFragment.this.k.getAlbums().addAll(albumList.getAlbums());
                }
                XimaCategoryDetailFragment.this.c.notifyDataSetChanged();
            } else if (XimaCategoryDetailFragment.this.d == 1) {
                XimaCategoryDetailFragment.this.h.setVisibility(0);
                XimaCategoryDetailFragment.this.b.setVisibility(4);
            }
            XimaCategoryDetailFragment.this.n();
            XimaCategoryDetailFragment.this.f = false;
        }

        @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
        public void onError(int i, String str) {
            Log.d(XimaCategoryDetailFragment.r, "XimaCategoryDetailFragment  error reason is  " + str, new Object[0]);
            XimaCategoryDetailFragment.this.h.setVisibility(0);
            XimaCategoryDetailFragment.this.b.setVisibility(4);
            XimaCategoryDetailFragment.this.n();
            XimaCategoryDetailFragment.this.f = false;
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
                    if (XimaCategoryDetailFragment.this.e == null || XimaCategoryDetailFragment.this.d <= XimaCategoryDetailFragment.this.e.getTotalPage()) {
                        XimaCategoryDetailFragment.this.o();
                        XimaCategoryDetailFragment.this.loadData();
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
            if (i >= XimaCategoryDetailFragment.this.k.getAlbums().size()) {
                return;
            }
            Intent intent = new Intent(XimaCategoryDetailFragment.this.a, (Class<?>) XimaAlbumActivity.class);
            intent.putExtra(DTransferConstants.ALBUM_ID, XimaCategoryDetailFragment.this.k.getAlbums().get(i).getId());
            intent.putExtra(XimalayaUtils.SEARCH_ALBUM, XimaCategoryDetailFragment.this.k.getAlbums().get(i));
            XimaCategoryDetailFragment.this.startActivity(intent);
        }
    }

    private void addFootView() {
        View viewInflate = View.inflate(getContext(), R.layout.footview_loadmore, null);
        this.i = viewInflate;
        try {
            viewInflate.measure(0, 0);
            int measuredHeight = this.i.getMeasuredHeight();
            this.j = measuredHeight;
            this.i.setPadding(0, 0, 0, -measuredHeight);
            this.b.addFooterView(this.i);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private boolean m() {
        TrackHotList trackHotList = this.e;
        return trackHotList == null || trackHotList.getTotalPage() > this.d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        this.i.setPadding(0, 0, 0, -this.j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        this.i.setPadding(0, 0, 0, 0);
    }

    public String getTitle() {
        return this.q;
    }

    public void loadData() {
        Log.d(r, this.m + " XimaCategoryDetailFragment  begin loadData ", new Object[0]);
        if (this.f) {
            return;
        }
        this.f = true;
        if (this.p == null) {
            this.h.setVisibility(0);
            this.b.setVisibility(4);
            return;
        }
        HashMap map = new HashMap();
        map.put(DTransferConstants.CALC_DIMENSION, "3");
        map.put(DTransferConstants.CATEGORY_ID, this.l + "");
        map.put(DTransferConstants.PAGE, "" + this.d);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.p.getAttrKey());
        stringBuffer.append(":");
        stringBuffer.append(this.p.getAttrValue());
        map.put(DTransferConstants.METADATA_ATTRIBUTES, stringBuffer.toString());
        CommonRequest.getMetadataAlbumList(map, new a());
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        Log.i(r, "onActivityCreated", new Object[0]);
        super.onActivityCreated(bundle);
        this.a = getActivity();
        this.g = CommonRequest.getInstanse();
        this.c = new TrackAdapter();
        addFootView();
        this.b.setAdapter((ListAdapter) this.c);
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setOnScrollListener(new b());
        this.b.setOnItemClickListener(new c());
        loadData();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreate(bundle);
        View viewInflate = layoutInflater.inflate(R.layout.xima_category_listview, viewGroup, false);
        this.b = (ListView) viewInflate.findViewById(R.id.category_listview);
        this.h = (TextView) viewInflate.findViewById(R.id.nodata);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        Log.i(r, "onDestroyView", new Object[0]);
        super.onDestroyView();
    }

    public void refresh() {
        Log.d(r, "---refresh", new Object[0]);
        if (m()) {
            loadData();
        }
    }

    public void setResource(long j, Attributes attributes) {
        this.l = j;
        this.p = attributes;
    }

    public void setTitle(String str) {
        this.q = str;
    }
}
