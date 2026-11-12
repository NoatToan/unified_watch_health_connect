package ch1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;

/* JADX INFO: loaded from: classes10.dex */
public class k extends fb2.e<Object> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public GCMComplexTwoLineButton f27394d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f27395e;

    public k(Context context) {
        super(context);
        this.f27394d = null;
        this.f27395e = false;
    }

    public static /* synthetic */ void p(k kVar) {
        kVar.setChanged();
        kVar.notifyObservers(Boolean.valueOf(kVar.f27395e));
    }

    public static void q(View view2, boolean z14) {
        if (view2 != null) {
            view2.setEnabled(z14);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                for (int i14 = 0; i14 < viewGroup.getChildCount(); i14++) {
                    q(viewGroup.getChildAt(i14), z14);
                }
            }
        }
    }

    @Override // fb2.e
    public final View a() {
        if (this.f27394d == null) {
            this.f27394d = fb2.g.d(this.f70343a, R.id.alert_volume_btn, b(R.string.audio_prompts_alert_volume_playback_test), null);
        }
        return this.f27394d;
    }

    @Override // fb2.e
    public final boolean g(i.c cVar, Object obj) {
        GCMComplexTwoLineButton gCMComplexTwoLineButton = (GCMComplexTwoLineButton) cVar.findViewById(R.id.alert_volume_btn);
        if (gCMComplexTwoLineButton != null) {
            this.f27394d = gCMComplexTwoLineButton;
        } else {
            this.f27394d = (GCMComplexTwoLineButton) a();
        }
        GCMComplexTwoLineButton gCMComplexTwoLineButton2 = this.f27394d;
        if (gCMComplexTwoLineButton2 != null) {
            gCMComplexTwoLineButton2.b(b(R.string.audio_prompts_alert_volume_instructions), null);
            this.f27394d.setRightIcon(a7.b.getDrawable(this.f70343a, 2131232025));
            q(this.f27394d, true);
            this.f27394d.setOnClickListener(new a32.b(this, 25));
        }
        k(obj);
        return true;
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fb2.e
    public final boolean k(Object obj) {
        fb2.f.a(obj, "Model is required");
        this.f70344b = obj;
        GCMComplexTwoLineButton gCMComplexTwoLineButton = this.f27394d;
        if (gCMComplexTwoLineButton != null) {
            gCMComplexTwoLineButton.d(!this.f27395e);
            this.f27394d.e(this.f27395e);
            q(this.f27394d, !this.f27395e);
        }
        return true;
    }
}
