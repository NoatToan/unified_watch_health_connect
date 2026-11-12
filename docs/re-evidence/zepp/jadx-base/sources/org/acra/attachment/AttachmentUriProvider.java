package org.acra.attachment;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import java.util.List;
import org.acra.config.CoreConfiguration;

/* JADX INFO: loaded from: classes23.dex */
public interface AttachmentUriProvider {
    @NonNull
    List<Uri> getAttachments(@NonNull Context context, @NonNull CoreConfiguration coreConfiguration);
}
