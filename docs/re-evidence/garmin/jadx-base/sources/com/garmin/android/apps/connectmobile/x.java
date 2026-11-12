package com.garmin.android.apps.connectmobile;

import android.content.Context;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/x;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class x extends Fragment {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f49750f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e23.a<Unit> f49751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e23.a<Unit> f49752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f49753c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f49754d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public k32.b f49755e;

    public final void dismiss() {
        androidx.fragment.app.v supportFragmentManager;
        androidx.fragment.app.m activity = getActivity();
        if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
            aVar.k(this);
            aVar.e();
        }
        e23.a<Unit> aVar2 = this.f49752b;
        if (aVar2 != null) {
            aVar2.invoke();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return com.airbnb.lottie.animation.keyframe.a.b(layoutInflater, R.layout.banner_layout, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        this.f49755e = new k32.b(view2);
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("keyHeadline") : null;
        Bundle arguments2 = getArguments();
        CharSequence charSequence = arguments2 != null ? arguments2.getCharSequence("keyBody") : null;
        Bundle arguments3 = getArguments();
        String string2 = arguments3 != null ? arguments3.getString("keyActionPrimary") : null;
        Bundle arguments4 = getArguments();
        String string3 = arguments4 != null ? arguments4.getString("keyActionSecondary") : null;
        Bundle arguments5 = getArguments();
        int i14 = arguments5 != null ? arguments5.getInt("keyIcon", -1) : -1;
        Bundle arguments6 = getArguments();
        int i15 = arguments6 != null ? arguments6.getInt("keyTint", -1) : -1;
        Bundle arguments7 = getArguments();
        int i16 = arguments7 != null ? arguments7.getInt(TtmlNode.ATTR_TTS_BACKGROUND_COLOR, -1) : -1;
        k32.b bVar = this.f49755e;
        if (bVar == null) {
            p005kotlin.jvm.internal.s.m("bannerViewHolder");
            throw null;
        }
        String strValueOf = String.valueOf(charSequence);
        w wVar = new w(this, 0);
        w wVar2 = new w(this, 1);
        w wVar3 = new w(this, 2);
        ImageView imageView = bVar.f102671e;
        TextView textView = bVar.f102670d;
        TextView textView2 = bVar.f102669c;
        TextView textView3 = bVar.f102668b;
        TextView textView4 = bVar.f102667a;
        textView4.getClass();
        v22.e.v(textView4, string != null);
        if (string != null) {
            textView4.setText(string);
        }
        textView3.setText(strValueOf);
        textView3.setMovementMethod(LinkMovementMethod.getInstance());
        textView2.getClass();
        v22.e.v(textView2, string2 != null);
        if (string2 != null) {
            textView2.setText(string2);
            v22.e.n(textView2, new iz1.f(wVar, 16));
        }
        textView.getClass();
        v22.e.v(textView, string3 != null);
        if (string3 != null) {
            textView.setText(string3);
            v22.e.n(textView, new iz1.f(wVar2, 17));
        }
        imageView.getClass();
        v22.e.v(imageView, i14 != -1);
        if (i14 != -1) {
            if (i16 == -1 || i15 == -1) {
                imageView.setImageResource(i14);
                if (i15 != -1) {
                    imageView.setColorFilter(a7.b.getColor(imageView.getContext(), i15));
                }
            } else {
                Context context = imageView.getContext();
                context.getClass();
                imageView.setImageDrawable(c22.r0.b(context, i14, i16, i15, null, 112));
            }
        }
        View view3 = bVar.f102672f;
        view3.getClass();
        v22.e.n(view3, new iz1.f(wVar3, 18));
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/garmin/android/apps/connectmobile/x$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "HEADLINE_KEY", "ICON", "BODY_KEY", "ACTION_PRIMARY_KEY", "ACTION_SECONDARY_KEY", "TINT_KEY", "BACKGROUND_KEY", "", "INVALID_DRAWABLE", "I", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static x a(a aVar, String str, String str2, String str3, int i14, int i15) {
            if ((i15 & 1) != 0) {
                str = null;
            }
            if ((i15 & 4) != 0) {
                str3 = null;
            }
            if ((i15 & 16) != 0) {
                i14 = -1;
            }
            aVar.getClass();
            x xVar = new x();
            xVar.setArguments(new Bundle());
            Bundle arguments = xVar.getArguments();
            if (arguments != null) {
                arguments.putString("keyHeadline", str);
            }
            Bundle arguments2 = xVar.getArguments();
            if (arguments2 != null) {
                arguments2.putCharSequence("keyBody", str2);
            }
            Bundle arguments3 = xVar.getArguments();
            if (arguments3 != null) {
                arguments3.putString("keyActionPrimary", str3);
            }
            Bundle arguments4 = xVar.getArguments();
            if (arguments4 != null) {
                arguments4.putString("keyActionSecondary", null);
            }
            Bundle arguments5 = xVar.getArguments();
            if (arguments5 != null) {
                arguments5.putInt("keyIcon", i14);
            }
            Bundle arguments6 = xVar.getArguments();
            if (arguments6 != null) {
                arguments6.putInt("keyTint", -1);
            }
            return xVar;
        }

        private a() {
        }
    }
}
