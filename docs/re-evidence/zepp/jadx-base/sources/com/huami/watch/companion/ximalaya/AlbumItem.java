package com.huami.watch.companion.ximalaya;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.huami.watch.companion.R;
import com.ximalaya.ting.android.opensdk.model.album.Album;

/* JADX INFO: loaded from: classes16.dex */
public class AlbumItem extends RelativeLayout {
    private Context a;
    private ImageView b;
    private TextView c;
    private TextView d;
    private TextView e;
    private TextView f;

    public AlbumItem(Context context) {
        this(context, null);
    }

    public void displayData(Album album) {
        if (album != null) {
            this.c.setText(album.getAlbumTitle());
            Glide.with(this.a).load(album.getCoverUrlMiddle()).into(this.b);
            this.d.setText(this.a.getString(R.string.xima_album_author, album.getAnnouncer().getNickname()));
            this.e.setText(XimalayaUtils.getStringPlayCount(Long.valueOf(album.getPlayCount())));
            this.f.setText(this.a.getString(R.string.xima_album_counts, String.valueOf(album.getIncludeTrackCount())));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.b = (ImageView) findViewById(R.id.item_icon);
        this.c = (TextView) findViewById(R.id.item_title);
        this.d = (TextView) findViewById(R.id.item_author);
        this.e = (TextView) findViewById(R.id.item_displaycount);
        this.f = (TextView) findViewById(R.id.item_totalcount);
    }

    public AlbumItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public AlbumItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = context;
    }
}
