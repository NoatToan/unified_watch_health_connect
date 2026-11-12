package com.garmin.android.apps.connectmobile.draggableimagepreviewer;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import ef0.e;
import i3.e5;
import java.util.ArrayList;
import lc.u0;
import p005kotlin.Metadata;
import p13.h0;
import p13.x;
import zp0.c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/draggableimagepreviewer/b;", "Lcom/garmin/android/apps/connectmobile/draggableimagepreviewer/a;", "<init>", "()V", "a", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends com.garmin.android.apps.connectmobile.draggableimagepreviewer.a {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/draggableimagepreviewer/b$a;", "Lcom/garmin/android/apps/connectmobile/draggableimagepreviewer/a$a;", "Landroid/view/View;", "itemView", "<init>", "(Lcom/garmin/android/apps/connectmobile/draggableimagepreviewer/b;Landroid/view/View;)V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class a extends com.garmin.android.apps.connectmobile.draggableimagepreviewer.a.AbstractC0587a {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ int f34734h = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f34735a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ImageView f34736b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final View f34737c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ImageView f34738d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ProgressBar f34739e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final ImageView f34740f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ b f34741g;

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.draggableimagepreviewer.b$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0588a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f34742a;

            static {
                int[] iArr = new int[e.values().length];
                try {
                    iArr[e.SUCCESS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[e.ERROR.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[e.LOADING.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f34742a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b bVar, View view2) {
            super(view2);
            view2.getClass();
            this.f34741g = bVar;
            Context context = view2.getContext();
            context.getClass();
            this.f34735a = new c(context);
            this.f34736b = (ImageView) view2.findViewById(R.id.image_view);
            this.f34737c = view2.findViewById(R.id.mask_view);
            this.f34738d = (ImageView) view2.findViewById(R.id.error_image);
            this.f34739e = (ProgressBar) view2.findViewById(R.id.progress_bar);
            this.f34740f = (ImageView) view2.findViewById(R.id.close_btn);
        }

        @Override // com.garmin.android.apps.connectmobile.draggableimagepreviewer.a.AbstractC0587a
        public final void d(final ef0.b bVar) {
            String str = bVar.f63939a;
            c cVar = this.f34735a;
            cVar.f206565e = str;
            cVar.a(new String[0]);
            ImageView imageView = this.f34736b;
            imageView.getClass();
            cVar.h(imageView);
            final int i14 = 0;
            final b bVar2 = this.f34741g;
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: ef0.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i15 = i14;
                    b bVar3 = bVar;
                    com.garmin.android.apps.connectmobile.draggableimagepreviewer.b bVar4 = bVar2;
                    switch (i15) {
                        case 0:
                            int i16 = com.garmin.android.apps.connectmobile.draggableimagepreviewer.b.a.f34734h;
                            int iIndexOf = bVar4.f34731b.indexOf(bVar3);
                            ArrayList arrayList = bVar4.f34731b;
                            if (iIndexOf >= 0 && iIndexOf <= x.j(arrayList)) {
                                arrayList.remove(iIndexOf);
                                bVar4.notifyItemRemoved(iIndexOf);
                                d dVar = bVar4.f34733d;
                                if (dVar != null) {
                                    dVar.a(h0.b1(arrayList));
                                }
                                break;
                            }
                            break;
                        default:
                            int i17 = com.garmin.android.apps.connectmobile.draggableimagepreviewer.b.a.f34734h;
                            com.garmin.android.apps.connectmobile.draggableimagepreviewer.a.b bVar5 = bVar4.f34732c;
                            if (bVar5 != null) {
                                bVar5.a(bVar3);
                            }
                            break;
                    }
                }
            };
            ImageView imageView2 = this.f34740f;
            imageView2.setOnClickListener(onClickListener);
            boolean z14 = bVar.f63942d;
            View view2 = this.f34737c;
            ProgressBar progressBar = this.f34739e;
            ImageView imageView3 = this.f34738d;
            if (z14) {
                imageView3.getClass();
                imageView3.setVisibility(8);
                progressBar.getClass();
                progressBar.setVisibility(8);
                view2.getClass();
                view2.setVisibility(8);
                imageView2.setVisibility(4);
            } else {
                int i15 = C0588a.f34742a[bVar.f63940b.ordinal()];
                if (i15 == 1) {
                    imageView3.getClass();
                    imageView3.setVisibility(8);
                    progressBar.getClass();
                    progressBar.setVisibility(8);
                    view2.getClass();
                    view2.setVisibility(8);
                } else if (i15 == 2) {
                    imageView3.getClass();
                    imageView3.setVisibility(0);
                    progressBar.getClass();
                    progressBar.setVisibility(8);
                    view2.getClass();
                    view2.setVisibility(0);
                } else {
                    if (i15 != 3) {
                        u0.r();
                        return;
                    }
                    imageView3.getClass();
                    imageView3.setVisibility(8);
                    progressBar.getClass();
                    progressBar.setVisibility(0);
                    view2.getClass();
                    view2.setVisibility(0);
                }
                imageView2.setVisibility(0);
            }
            final int i16 = 1;
            this.itemView.setOnClickListener(new View.OnClickListener() { // from class: ef0.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    int i17 = i16;
                    b bVar3 = bVar;
                    com.garmin.android.apps.connectmobile.draggableimagepreviewer.b bVar4 = bVar2;
                    switch (i17) {
                        case 0:
                            int i18 = com.garmin.android.apps.connectmobile.draggableimagepreviewer.b.a.f34734h;
                            int iIndexOf = bVar4.f34731b.indexOf(bVar3);
                            ArrayList arrayList = bVar4.f34731b;
                            if (iIndexOf >= 0 && iIndexOf <= x.j(arrayList)) {
                                arrayList.remove(iIndexOf);
                                bVar4.notifyItemRemoved(iIndexOf);
                                d dVar = bVar4.f34733d;
                                if (dVar != null) {
                                    dVar.a(h0.b1(arrayList));
                                }
                                break;
                            }
                            break;
                        default:
                            int i19 = com.garmin.android.apps.connectmobile.draggableimagepreviewer.b.a.f34734h;
                            com.garmin.android.apps.connectmobile.draggableimagepreviewer.a.b bVar5 = bVar4.f34732c;
                            if (bVar5 != null) {
                                bVar5.a(bVar3);
                            }
                            break;
                    }
                }
            });
        }
    }

    public b() {
        super(0, 1, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        View viewE = e5.e(viewGroup, R.layout.draggable_image_previewer_item_view, viewGroup, false);
        viewE.getClass();
        return new a(this, viewE);
    }
}
