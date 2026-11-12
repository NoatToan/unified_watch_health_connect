package j10;

import am.c2;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import com.garmin.android.apps.connectmobile.social.conversationservice.model.ConversationCommentDTO;
import fo1.h1;
import fo1.o0;
import fo1.r0;
import fo1.u0;

/* JADX INFO: loaded from: classes7.dex */
public class s extends com.garmin.android.apps.connectmobile.social.b {
    public static final /* synthetic */ int V0 = 0;
    public String U0;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f96403a;

        static {
            int[] iArr = new int[fw.p.values().length];
            f96403a = iArr;
            try {
                iArr[fw.p.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f96403a[fw.p.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f96403a[fw.p.LOADING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.social.b
    public final void T6(Editable editable) {
        ConversationCommentDTO conversationCommentDTO = new ConversationCommentDTO();
        conversationCommentDTO.f44555j = editable.toString();
        this.D.setCommentText("");
        String strV6 = V6(conversationCommentDTO);
        o0 o0Var = this.X;
        String str = this.U0;
        c2 c2Var = this.f44516x;
        String str2 = this.f44515w;
        o0Var.getClass();
        str.getClass();
        c2Var.getClass();
        str2.getClass();
        dh.b.L(xy2.b.K(o0Var, new r0(o0Var, str, c2Var, str2, conversationCommentDTO, null)), this, new hc0.f(1, this, strV6));
    }

    @Override // com.garmin.android.apps.connectmobile.social.b
    public final void X6() {
        if (getContext() != null) {
            o0 o0Var = this.X;
            Context context = getContext();
            boolean z14 = this.f44517y;
            String str = this.U0;
            o0Var.getClass();
            context.getClass();
            str.getClass();
            dh.b.L(androidx.lifecycle.m.a(null, new u0(o0Var, context, z14, new h1(o0Var, str, null), null), 3), this, new iz1.g(this, 3));
        }
    }

    @Override // com.garmin.android.apps.connectmobile.social.b
    public final void f7() {
    }

    @Override // com.garmin.android.apps.connectmobile.social.b
    public final void i7(View view2) {
    }

    @Override // com.garmin.android.apps.connectmobile.social.b, com.garmin.android.apps.connectmobile.o0, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.U0 = arguments.getString("GCM_extra_connection_group_id");
        }
    }

    @Override // com.garmin.android.apps.connectmobile.social.b, cs1.f
    public final void w3(String str) {
    }
}
