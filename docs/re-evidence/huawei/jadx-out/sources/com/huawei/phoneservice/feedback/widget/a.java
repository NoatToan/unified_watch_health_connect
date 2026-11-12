package com.huawei.phoneservice.feedback.widget;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bumptech.glide.Glide;
import com.huawei.phoneservice.faq.base.util.k;
import com.huawei.phoneservice.faq.base.util.q;
import com.huawei.phoneservice.feedbackcommon.entity.FeedMedia;
import com.huawei.phoneservice.feedbackcommon.entity.MediaEntity;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public abstract class a<T> extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected List<T> f21793a = new ArrayList();

    /* JADX INFO: renamed from: com.huawei.phoneservice.feedback.widget.a$a, reason: collision with other inner class name */
    public interface InterfaceC0259a {
        void a(int i, ImageView imageView, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, ImageView imageView2, String str, String str2, long j, boolean z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f21793a.size();
    }

    public void b(Context context, ImageView imageView, ImageView imageView2, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, FeedMedia feedMedia, MediaEntity mediaEntity, int i, InterfaceC0259a interfaceC0259a) {
        if (mediaEntity != null) {
            a(context, mediaEntity, imageView, imageView2, relativeLayout);
        } else {
            imageView2.setVisibility(0);
            relativeLayout.setVisibility(0);
        }
        c cVar = new c(imageView, imageView2, relativeLayout, relativeLayout2, feedMedia, i, true, true, interfaceC0259a);
        imageView2.setOnClickListener(cVar);
        relativeLayout.setOnClickListener(cVar);
        imageView.setOnClickListener(new c(imageView, imageView2, relativeLayout, relativeLayout2, feedMedia, i, false, false, interfaceC0259a));
    }

    public void a(List<T> list) {
        this.f21793a.clear();
        this.f21793a.addAll(list);
        notifyDataSetChanged();
    }

    public void a(Context context, ImageView imageView, ImageView imageView2, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, FeedMedia feedMedia, MediaEntity mediaEntity, int i, InterfaceC0259a interfaceC0259a) {
        if (mediaEntity != null) {
            b(context, mediaEntity, imageView, imageView2, relativeLayout);
        } else {
            imageView2.setVisibility(0);
            relativeLayout.setVisibility(0);
        }
        c cVar = new c(imageView, imageView2, relativeLayout, relativeLayout2, feedMedia, i, true, true, interfaceC0259a);
        imageView2.setOnClickListener(cVar);
        relativeLayout.setOnClickListener(cVar);
        imageView.setOnClickListener(new c(imageView, imageView2, relativeLayout, relativeLayout2, feedMedia, i, false, false, interfaceC0259a));
    }

    public T a(int i) {
        return this.f21793a.get(i);
    }

    private void b(Context context, MediaEntity mediaEntity, ImageView imageView, ImageView imageView2, RelativeLayout relativeLayout) {
        File fileA = a(mediaEntity.path);
        if (k.b(mediaEntity.path) || !fileA.exists()) {
            File fileA2 = a(mediaEntity.cache);
            if (k.b(mediaEntity.cache) || !fileA2.exists()) {
                relativeLayout.setVisibility(0);
                imageView2.setVisibility(0);
                return;
            } else if (fileA2.canRead()) {
                a(context, mediaEntity.cache, imageView);
                return;
            } else if (k.b(mediaEntity.strUri)) {
                return;
            }
        } else if (fileA.canRead()) {
            a(context, mediaEntity.path, imageView);
            return;
        } else if (k.b(mediaEntity.strUri)) {
            return;
        }
        a(context, Uri.parse(mediaEntity.strUri), imageView);
    }

    private void b(Context context, Uri uri, ImageView imageView) {
        if (context == null || uri == null || imageView == null) {
            return;
        }
        Glide.with(context).load(uri).into(imageView);
        imageView.setVisibility(0);
    }

    private void a(Context context, String str, ImageView imageView) {
        if (context == null || str == null || imageView == null) {
            return;
        }
        Glide.with(context).load(new File(str)).into(imageView);
        imageView.setVisibility(0);
    }

    private void a(Context context, File file, ImageView imageView) {
        if (context == null || file == null || imageView == null) {
            return;
        }
        Glide.with(context).load(file).into(imageView);
        imageView.setVisibility(0);
    }

    private void a(Context context, MediaEntity mediaEntity, ImageView imageView, ImageView imageView2, RelativeLayout relativeLayout) {
        File fileA = a(mediaEntity.path);
        if (k.b(mediaEntity.path) || !fileA.exists()) {
            File fileA2 = a(mediaEntity.cache);
            if (k.b(mediaEntity.cache) || !fileA2.exists()) {
                relativeLayout.setVisibility(0);
                imageView2.setVisibility(0);
                return;
            } else if (fileA2.canRead()) {
                a(context, a(mediaEntity.cache), imageView);
                return;
            } else if (k.b(mediaEntity.strUri)) {
                return;
            }
        } else if (fileA.canRead()) {
            a(context, a(mediaEntity.path), imageView);
            return;
        } else if (k.b(mediaEntity.strUri)) {
            return;
        }
        b(context, Uri.parse(mediaEntity.strUri), imageView);
    }

    public static class c implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private FeedMedia f21794a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ImageView f21795b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ImageView f21796c;
        private RelativeLayout d;
        private InterfaceC0259a e;
        private RelativeLayout f;
        private boolean h;
        private int i;
        private boolean j;

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ImageView imageView;
            if (q.b(view) || this.e == null) {
                return;
            }
            if (this.j && (imageView = this.f21796c) != null) {
                imageView.setVisibility(8);
            }
            FeedMedia feedMedia = this.f21794a;
            if (feedMedia == null) {
                return;
            }
            this.e.a(this.i, this.f21795b, this.d, this.f, this.f21796c, feedMedia.getDownloadURL(), this.f21794a.getAttachId(), Long.parseLong(this.f21794a.getSize()), this.h);
        }

        public c(ImageView imageView, ImageView imageView2, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, FeedMedia feedMedia, int i, boolean z, boolean z2, InterfaceC0259a interfaceC0259a) {
            this.f21795b = imageView;
            this.f21796c = imageView2;
            this.d = relativeLayout;
            this.f = relativeLayout2;
            this.f21794a = feedMedia;
            this.j = z;
            this.i = i;
            this.h = z2;
            this.e = interfaceC0259a;
        }
    }

    private void a(Context context, Uri uri, ImageView imageView) {
        if (context == null || uri == null || imageView == null) {
            return;
        }
        Glide.with(context).load(uri).into(imageView);
        imageView.setVisibility(0);
    }

    private File a(String str) {
        return new File(str);
    }
}
