package com.garmin.android.apps.connectmobile.newsfeed.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import t62.b;
import u4.d;
import v62.l1;
import v62.l9;
import v62.n3;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000fB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/garmin/android/apps/connectmobile/newsfeed/view/NewsFeedEmptyView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View$OnClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "setActionListener", "(Landroid/view/View$OnClickListener;)V", "a", "gcm-newsfeed_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class NewsFeedEmptyView extends LinearLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f39537c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComposeView f39538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View.OnClickListener f39539b;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'd' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/newsfeed/view/NewsFeedEmptyView$a;", "", "Lu4/d;", "imageVector", "", "titleResId", "", "hasButton", "<init>", "(Ljava/lang/String;ILu4/d;IZ)V", "gcm-newsfeed_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f39540d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f39541e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f39542f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ a[] f39543g;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f39544a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f39545b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f39546c;

        static {
            s62.a.f157643a.getClass();
            b bVar = b.f162798a;
            a aVar = new a("NoFollowings", 0, l9.a(bVar), R.string.msg_no_followings_title, true);
            f39540d = aVar;
            a aVar2 = new a("NoNewActivities", 1, l1.a(bVar), R.string.news_feed_empty_for_no_new_activities_title, true);
            f39541e = aVar2;
            a aVar3 = new a("FilterNoResult", 2, n3.a(bVar), R.string.news_feed_empty_for_no_results_title, false);
            f39542f = aVar3;
            f39543g = new a[]{aVar, aVar2, aVar3};
        }

        private a(String str, int i14, d dVar, int i15, boolean z14) {
            super(str, i14);
            this.f39544a = dVar;
            this.f39545b = i15;
            this.f39546c = z14;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f39543g.clone();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewsFeedEmptyView(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.news_feed_empty_layout, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R.id.news_feed_empty_view);
        viewFindViewById.getClass();
        this.f39538a = (ComposeView) viewFindViewById;
    }

    public final void setActionListener(View.OnClickListener listener) {
        listener.getClass();
        this.f39539b = listener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NewsFeedEmptyView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NewsFeedEmptyView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ NewsFeedEmptyView(Context context, AttributeSet attributeSet, int i14, int i15, j jVar) {
        this(context, (i15 & 2) != 0 ? null : attributeSet, (i15 & 4) != 0 ? 0 : i14);
    }
}
