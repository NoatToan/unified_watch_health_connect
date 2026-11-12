package com.garmin.android.apps.connectmobile.connections.groups.details;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.e;
import com.garmin.android.apps.connectmobile.view.StyledInlineTextFieldViewDark;
import go1.g0;
import h32.h;
import java.util.ArrayList;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.h0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0003\n\u000b\fB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/garmin/android/apps/connectmobile/connections/groups/details/d;", "Lcom/garmin/android/apps/connectmobile/connections/groups/details/c;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "otherPrimaryActivity", "Lcom/garmin/android/apps/connectmobile/connections/groups/details/d$a;", "callback", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lcom/garmin/android/apps/connectmobile/connections/groups/details/d$a;)V", "c", "a", "b", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends com.garmin.android.apps.connectmobile.connections.groups.details.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f31487h = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f31488d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f31489e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f31490f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f31491g;

    public interface a {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/connections/groups/details/d$c;", "", "Lcom/garmin/android/apps/connectmobile/view/StyledInlineTextFieldViewDark;", "styledInlineTextFieldViewDark", "<init>", "(Lcom/garmin/android/apps/connectmobile/view/StyledInlineTextFieldViewDark;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StyledInlineTextFieldViewDark f31492a;

        public c(StyledInlineTextFieldViewDark styledInlineTextFieldViewDark) {
            styledInlineTextFieldViewDark.getClass();
            this.f31492a = styledInlineTextFieldViewDark;
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.connections.groups.details.d$d, reason: collision with other inner class name */
    public static final /* synthetic */ class C0513d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31493a;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.ACT_OTHER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f31493a = iArr;
        }
    }

    static {
        new b(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, String str, a aVar) {
        super(context);
        context.getClass();
        aVar.getClass();
        this.f31488d = str;
        this.f31489e = aVar;
        this.f31490f = new ArrayList();
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i14) {
        e eVar = (e) h0.e0(i14, this.f31490f);
        return (eVar == null ? -1 : C0513d.f31493a[eVar.ordinal()]) == 1 ? 1 : 0;
    }

    @Override // com.garmin.android.apps.connectmobile.connections.groups.details.c, android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i14, View view2, ViewGroup viewGroup) {
        c cVar;
        viewGroup.getClass();
        if (getItemViewType(i14) == 0) {
            View view3 = super.getView(i14, view2, viewGroup);
            view3.setOnClickListener(new g0(this, 26));
            return view3;
        }
        if (view2 != null) {
            Object tag = view2.getTag();
            tag.getClass();
            cVar = (c) tag;
        } else {
            View viewInflate = this.f31482b.inflate(R.layout.gcm_simple_styled_inline_text_field_view_dark, viewGroup, false);
            viewInflate.getClass();
            StyledInlineTextFieldViewDark styledInlineTextFieldViewDark = (StyledInlineTextFieldViewDark) viewInflate;
            c cVar2 = new c(styledInlineTextFieldViewDark);
            styledInlineTextFieldViewDark.setTag(cVar2);
            cVar = cVar2;
        }
        StyledInlineTextFieldViewDark styledInlineTextFieldViewDark2 = cVar.f31492a;
        this.f31491g = cVar;
        String item = getItem(i14);
        String str = this.f31488d;
        if (str == null) {
            str = "";
        }
        h.c cVar3 = new h.c(str, null, null, null, null, new ap.b(this, i14, 7), null, null, 0, false, null, null, 4062, null);
        if (item == null) {
            item = getContext().getString(R.string.lbl_other);
            item.getClass();
        }
        styledInlineTextFieldViewDark2.setTitle(item);
        styledInlineTextFieldViewDark2.i(cVar3);
        return styledInlineTextFieldViewDark2;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/connections/groups/details/d$b;", "", "<init>", "()V", "", "VIEW_TYPE_CHECKABLE", "I", "VIEW_TYPE_INPUT_FIELD", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(j jVar) {
            this();
        }

        private b() {
        }
    }
}
