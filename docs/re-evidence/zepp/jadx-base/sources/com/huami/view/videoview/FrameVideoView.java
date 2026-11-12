package com.huami.view.videoview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;

/* JADX INFO: loaded from: classes15.dex */
public class FrameVideoView extends FrameLayout {
    private com.huami.view.videoview.a a;
    private ImplType b;
    private View c;
    private Uri d;
    private Context e;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ImplType.values().length];
            a = iArr;
            try {
                iArr[ImplType.TEXTURE_VIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ImplType.VIDEO_VIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public FrameVideoView(Context context) {
        super(context);
        this.e = context;
        this.c = a(context);
        this.a = b(context);
        addView(this.c);
    }

    private View a(Context context) {
        View view = new View(context);
        view.setBackgroundColor(-16777216);
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return view;
    }

    private com.huami.view.videoview.a b(Context context) {
        if (Build.VERSION.SDK_INT >= 14) {
            this.b = ImplType.TEXTURE_VIEW;
            TextureViewImpl textureViewImpl = new TextureViewImpl(context);
            addView(textureViewImpl);
            return textureViewImpl;
        }
        this.b = ImplType.VIDEO_VIEW;
        VideoViewImpl videoViewImpl = new VideoViewImpl(context);
        addView(videoViewImpl);
        return videoViewImpl;
    }

    private com.huami.view.videoview.a c(Context context, AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT >= 14) {
            this.b = ImplType.TEXTURE_VIEW;
            TextureViewImpl textureViewImpl = new TextureViewImpl(context, attributeSet);
            addView(textureViewImpl);
            return textureViewImpl;
        }
        this.b = ImplType.VIDEO_VIEW;
        VideoViewImpl videoViewImpl = new VideoViewImpl(context, attributeSet);
        addView(videoViewImpl);
        return videoViewImpl;
    }

    public int getCurrentPosition() {
        return this.a.getCurrentPosition();
    }

    public ImplType getImplType() {
        return this.b;
    }

    public View getPlaceholderView() {
        return this.c;
    }

    public void onPause() {
        this.a.onPause();
    }

    public void onResume() {
        this.a.onResume();
    }

    public void setFrameVideoViewListener(FrameVideoViewListener frameVideoViewListener) {
        this.a.setFrameVideoViewListener(frameVideoViewListener);
    }

    public void setImpl(ImplType implType) {
        removeAllViews();
        if (implType == ImplType.TEXTURE_VIEW && Build.VERSION.SDK_INT < 14) {
            implType = ImplType.VIDEO_VIEW;
            Toast.makeText(this.e, "Cannot use TEXTURE_VIEW impl because your device running API level 13 or lower", 1).show();
        }
        this.b = implType;
        int i = a.a[implType.ordinal()];
        if (i == 1) {
            TextureViewImpl textureViewImpl = new TextureViewImpl(this.e);
            textureViewImpl.init(this.c, this.d);
            addView(textureViewImpl);
            this.a = textureViewImpl;
        } else if (i == 2) {
            VideoViewImpl videoViewImpl = new VideoViewImpl(this.e);
            videoViewImpl.init(this.c, this.d);
            addView(videoViewImpl);
            this.a = videoViewImpl;
        }
        addView(this.c);
        onResume();
    }

    public void setup(Uri uri) {
        this.d = uri;
        this.a.init(this.c, uri);
    }

    public void stop() {
        this.a.stop();
    }

    public void setup(Uri uri, int i) {
        this.d = uri;
        this.c.setBackgroundColor(i);
        this.a.init(this.c, uri);
    }

    public FrameVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = context;
        this.c = a(context);
        this.a = c(context, attributeSet);
        addView(this.c);
    }

    @SuppressLint({"NewApi"})
    public void setup(Uri uri, Drawable drawable) {
        this.d = uri;
        if (Build.VERSION.SDK_INT < 16) {
            this.c.setBackgroundDrawable(drawable);
        } else {
            this.c.setBackground(drawable);
        }
        this.a.init(this.c, uri);
    }
}
