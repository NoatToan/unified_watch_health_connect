package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import defpackage.g6i;

/* JADX INFO: loaded from: classes.dex */
public final class AppCompatTextClassifierHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f1600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextClassifier f1601b;

    @RequiresApi(26)
    public static final class a {
        public static TextClassifier a(TextView textView) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
            return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
        }
    }

    public AppCompatTextClassifierHelper(TextView textView) {
        this.f1600a = (TextView) g6i.g(textView);
    }

    @RequiresApi(api = 26)
    public TextClassifier a() {
        TextClassifier textClassifier = this.f1601b;
        return textClassifier == null ? a.a(this.f1600a) : textClassifier;
    }

    @RequiresApi(api = 26)
    public void b(TextClassifier textClassifier) {
        this.f1601b = textClassifier;
    }
}
