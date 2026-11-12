package com.huami.watch.companion.ximalaya;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.huami.watch.companion.R;
import com.ximalaya.ting.android.opensdk.model.track.Track;

/* JADX INFO: loaded from: classes16.dex */
public class SoundItem extends RelativeLayout {
    private Context a;
    private ImageView b;
    private TextView c;
    private TextView d;
    private TextView e;
    private TextView f;
    private ImageView g;
    private Track h;
    private TextView i;

    public SoundItem(Context context) {
        this(context, null);
    }

    public void changeDownState() {
        this.g.setBackgroundResource(R.drawable.download_p);
    }

    public void displayData(Context context) {
        Track track = this.h;
        if (track == null || context == null) {
            return;
        }
        this.c.setText(track.getTrackTitle());
        Glide.with(context).load(this.h.getCoverUrlMiddle()).into(this.b);
        this.d.setText(context.getString(R.string.xima_album_author, this.h.getAnnouncer().getNickname()));
        this.e.setText(String.valueOf(this.h.getPlaySize64()));
        this.e.setText(XimalayaUtils.getAlbumSize(this.h.getPlaySize64(), context));
        this.f.setText(XimalayaUtils.getAlbumTime(this.h.getDuration()));
    }

    public Track getData() {
        if (this.f != null) {
            return this.h;
        }
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.b = (ImageView) findViewById(R.id.item_icon);
        this.c = (TextView) findViewById(R.id.item_title);
        this.d = (TextView) findViewById(R.id.item_author);
        this.e = (TextView) findViewById(R.id.item_size);
        this.f = (TextView) findViewById(R.id.item_time);
        this.g = (ImageView) findViewById(R.id.item_download_ig);
    }

    public void setData(Track track) {
        if (track != null) {
            this.h = track;
        }
    }

    public SoundItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public SoundItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = context;
    }
}
