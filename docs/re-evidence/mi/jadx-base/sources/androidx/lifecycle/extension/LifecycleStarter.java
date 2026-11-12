package androidx.lifecycle.extension;

import android.content.Intent;
import androidx.lifecycle.LifecycleOwner;
import com.mibi.sdk.common.account.AccountInteractActivity;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u001a\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Landroidx/lifecycle/extension/LifecycleStarter;", "Landroidx/lifecycle/LifecycleOwner;", "startActivity", "", "intent", "Landroid/content/Intent;", "startActivityForResult", AccountInteractActivity.KEY_REQUEST_CODE, "", "base-utils_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface LifecycleStarter extends LifecycleOwner {
    void startActivity(@Nullable Intent intent);

    void startActivityForResult(@Nullable Intent intent, int requestCode);
}
