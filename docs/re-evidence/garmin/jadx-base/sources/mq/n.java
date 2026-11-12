package mq;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import java.lang.ref.WeakReference;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001:\u0001\tB\u001f\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lmq/n;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "Lmq/l;", "lapColumns", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<l> f120191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference<Context> f120192b;

    static {
        new a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n(Context context, List<? extends l> list) {
        context.getClass();
        list.getClass();
        this.f120191a = list;
        this.f120192b = new WeakReference<>(context);
    }

    public static boolean b(int i14) {
        return i14 == mq.a.TARGET_TYPE.ordinal() || i14 == mq.a.INTERVAL_SPLIT_TYPE.ordinal() || i14 == mq.a.INTERVAL_SPLIT_TYPE_LANDSCAPE.ordinal();
    }

    public final TextView a(int i14, int i15, CharSequence charSequence, String str) {
        Context context = this.f120192b.get();
        if (context == null) {
            return null;
        }
        View viewInflate = LayoutInflater.from(context).inflate(i14, (ViewGroup) null);
        viewInflate.getClass();
        TextView textView = (TextView) viewInflate;
        textView.setId(i15);
        if (!TextUtils.isEmpty(charSequence)) {
            textView.setText(charSequence);
            textView.setContentDescription(str);
        }
        return textView;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0004X\u0084T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lmq/n$a;", "", "<init>", "()V", "", "INVALID_ID", "I", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
