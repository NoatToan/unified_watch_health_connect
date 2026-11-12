package com.garmin.android.apps.connectmobile.social;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import b.g;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.tag.TaggableEditText;
import cs1.f;
import do1.t;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p13.j0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/social/TagDemoActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class TagDemoActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f44489d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f44490a = new w1(s0.f105811a.b(com.garmin.android.apps.connectmobile.tag.b.class), new d(this), new c(this), new e(null, this));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TaggableEditText f44491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public FrameLayout f44492c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/social/TagDemoActivity$a;", "Landroid/widget/BaseAdapter;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends BaseAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j0 f44493a = j0.f134944a;

        @Override // android.widget.Adapter
        public final int getCount() {
            this.f44493a.getClass();
            return 0;
        }

        @Override // android.widget.Adapter
        public final Object getItem(int i14) {
            this.f44493a.get(i14);
            throw null;
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i14) {
            this.f44493a.get(i14);
            throw null;
        }

        @Override // android.widget.Adapter
        public final View getView(int i14, View view2, ViewGroup viewGroup) {
            new TextView(viewGroup != null ? viewGroup.getContext() : null);
            this.f44493a.get(i14);
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/social/TagDemoActivity$b", "Lcs1/f;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements f {
        public b() {
        }

        @Override // cs1.f
        public final void v3(com.garmin.android.apps.connectmobile.tag.a aVar) {
            aVar.getClass();
            FrameLayout frameLayout = TagDemoActivity.this.f44492c;
            if (frameLayout != null) {
                v22.e.r(frameLayout, aVar instanceof com.garmin.android.apps.connectmobile.tag.a.c);
            } else {
                s.m("suggestionsContainer");
                throw null;
            }
        }

        @Override // cs1.f
        public final void w3(String str) {
            str.getClass();
            int i14 = TagDemoActivity.f44489d;
            ((com.garmin.android.apps.connectmobile.tag.b) TagDemoActivity.this.f44490a.getValue()).x4(str, this);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f44495a;

        public c(g gVar) {
            this.f44495a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f44495a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f44496a;

        public d(g gVar) {
            this.f44496a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f44496a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f44497a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f44498b;

        public e(e23.a aVar, g gVar) {
            this.f44497a = aVar;
            this.f44498b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f44497a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f44498b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public TagDemoActivity() {
        new a();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    @SuppressLint({"MissingInflatedId"})
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.tag_demo_activity);
        View viewFindViewById = findViewById(R.id.text_editor);
        viewFindViewById.getClass();
        this.f44491b = (TaggableEditText) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.suggestions_container);
        viewFindViewById2.getClass();
        this.f44492c = (FrameLayout) viewFindViewById2;
        ComposeView composeView = new ComposeView(this, null, 0, 6, null);
        composeView.setContent(new z3.e(1428471648, true, new t(this, 0)));
        FrameLayout frameLayout = this.f44492c;
        if (frameLayout == null) {
            s.m("suggestionsContainer");
            throw null;
        }
        frameLayout.addView(composeView);
        TaggableEditText taggableEditText = this.f44491b;
        if (taggableEditText == null) {
            s.m("textEditor");
            throw null;
        }
        taggableEditText.setSuggestionListener(new b());
        s.m("button");
        throw null;
    }
}
