package a8;

import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.lifecycle.b0;
import androidx.lifecycle.n;
import androidx.lifecycle.n0;

/* JADX INFO: loaded from: classes.dex */
public class c implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b0 f1904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EmojiCompatInitializer f1905b;

    public c(EmojiCompatInitializer emojiCompatInitializer, b0 b0Var) {
        this.f1905b = emojiCompatInitializer;
        this.f1904a = b0Var;
    }

    @Override // androidx.lifecycle.n
    public final void onResume(n0 n0Var) {
        this.f1905b.getClass();
        b.a(Looper.getMainLooper()).postDelayed(new EmojiCompatInitializer.c(), 500L);
        this.f1904a.d(this);
    }
}
