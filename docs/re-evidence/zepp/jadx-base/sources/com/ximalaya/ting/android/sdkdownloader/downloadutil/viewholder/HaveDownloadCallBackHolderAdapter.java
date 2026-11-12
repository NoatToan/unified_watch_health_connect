package com.ximalaya.ting.android.sdkdownloader.downloadutil.viewholder;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.ximalaya.ting.android.opensdk.model.track.Track;
import com.ximalaya.ting.android.sdkdownloader.XmDownloadManager;
import com.ximalaya.ting.android.sdkdownloader.downloadutil.DownloadCallBackViewHolder;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public abstract class HaveDownloadCallBackHolderAdapter extends AbstractAdapter<Track> {
    private int a;

    public HaveDownloadCallBackHolderAdapter(Context context, List<Track> list, int i) {
        super(context, list);
        this.a = i;
    }

    public abstract void bindViewDatas(DownloadCallBackViewHolder downloadCallBackViewHolder, Track track, int i);

    public abstract DownloadCallBackViewHolder buildHolder(Track track, View view);

    public abstract int getConvertViewId();

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        Track track = (Track) this.listData.get(i);
        List<T> list = this.listData;
        DownloadCallBackViewHolder downloadCallBackViewHolderBuildHolder = null;
        if (list != 0 && i < list.size()) {
            if (view == null) {
                view = this.layoutInflater.inflate(getConvertViewId(), (ViewGroup) null);
                downloadCallBackViewHolderBuildHolder = buildHolder(track, view);
                XmDownloadManager.getInstance().addDownloadCallBackViewHolder(this.a, downloadCallBackViewHolderBuildHolder);
                view.setTag(downloadCallBackViewHolderBuildHolder);
            } else {
                downloadCallBackViewHolderBuildHolder = (DownloadCallBackViewHolder) view.getTag();
                downloadCallBackViewHolderBuildHolder.setTrack(track);
            }
        }
        bindViewDatas(downloadCallBackViewHolderBuildHolder, track, i);
        return view;
    }

    public final void updateViewItem(View view, int i) {
        if (view == null || i < 0) {
            return;
        }
        bindViewDatas((DownloadCallBackViewHolder) view.getTag(), (Track) this.listData.get(i), i);
    }
}
