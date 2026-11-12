package defpackage;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import androidx.core.view.ContentInfoCompat;
import androidx.core.view.c;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"PrivateConstructorForUtilityClass"})
public final class uad {

    public class a extends InputConnectionWrapper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f35568a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InputConnection inputConnection, boolean z, b bVar) {
            super(inputConnection, z);
            this.f35568a = bVar;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
            if (this.f35568a.a(vad.f(inputContentInfo), i, bundle)) {
                return true;
            }
            return super.commitContent(inputContentInfo, i, bundle);
        }
    }

    public interface b {
        boolean a(vad vadVar, int i, Bundle bundle);
    }

    public static b b(final View view) {
        g6i.g(view);
        return new b() { // from class: tad
            @Override // uad.b
            public final boolean a(vad vadVar, int i, Bundle bundle) {
                return uad.e(view, vadVar, i, bundle);
            }
        };
    }

    public static InputConnection c(View view, InputConnection inputConnection, EditorInfo editorInfo) {
        return d(inputConnection, editorInfo, b(view));
    }

    @Deprecated
    public static InputConnection d(InputConnection inputConnection, EditorInfo editorInfo, b bVar) {
        l4h.d(inputConnection, "inputConnection must be non-null");
        l4h.d(editorInfo, "editorInfo must be non-null");
        l4h.d(bVar, "onCommitContentListener must be non-null");
        return new a(inputConnection, false, bVar);
    }

    public static /* synthetic */ boolean e(View view, vad vadVar, int i, Bundle bundle) {
        if ((i & 1) != 0) {
            try {
                vadVar.d();
                Parcelable parcelable = (Parcelable) vadVar.e();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception unused) {
                return false;
            }
        }
        return c.g0(view, new ContentInfoCompat.a(new ClipData(vadVar.b(), new ClipData.Item(vadVar.a())), 2).d(vadVar.c()).b(bundle).a()) == null;
    }
}
