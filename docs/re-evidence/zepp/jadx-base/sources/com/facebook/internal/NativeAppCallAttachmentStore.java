package com.facebook.internal;

import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Log;
import com.facebook.FacebookContentProvider;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0012\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001(B\t\b\u0002¢\u0006\u0004\b&\u0010'J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0007J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002J \u0010\u0012\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0018\u0010\u0015\u001a\u00020\r2\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013H\u0007J\u0010\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0007J\n\u0010\u001a\u001a\u0004\u0018\u00010\u000bH\u0007J\n\u0010\u001b\u001a\u0004\u0018\u00010\u000bH\u0007J\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0010H\u0007J$\u0010\u001f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001e\u001a\u00020\u0010H\u0007J\b\u0010 \u001a\u00020\rH\u0007R\u0016\u0010\"\u001a\u00020\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010!R\u0016\u0010#\u001a\u00020\u00178\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010!R\u0018\u0010%\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010$¨\u0006)"}, d2 = {"Lcom/facebook/internal/NativeAppCallAttachmentStore;", "", "Ljava/util/UUID;", "callId", "Landroid/graphics/Bitmap;", "attachmentBitmap", "Lcom/facebook/internal/NativeAppCallAttachmentStore$Attachment;", "createAttachment", "Landroid/net/Uri;", "attachmentUri", "bitmap", "Ljava/io/File;", "outputFile", "", "a", "imageUri", "", "isContentUri", "b", "", "attachments", "addAttachments", "cleanupAttachmentsForCall", "", "attachmentName", "openAttachment", "getAttachmentsDirectory", "ensureAttachmentsDirectoryExists", "create", "getAttachmentsDirectoryForCall", "createDirs", "getAttachmentFile", "cleanupAllAttachments", "Ljava/lang/String;", "TAG", "ATTACHMENTS_DIR_NAME", "Ljava/io/File;", "attachmentsDirectory", "<init>", "()V", "Attachment", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class NativeAppCallAttachmentStore {

    @NotNull
    public static final String ATTACHMENTS_DIR_NAME = "com.facebook.NativeAppCallAttachmentStore.files";

    @NotNull
    public static final NativeAppCallAttachmentStore INSTANCE = new NativeAppCallAttachmentStore();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final String TAG = NativeAppCallAttachmentStore.class.getName();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static File attachmentsDirectory;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u001b\u001a\u00020\u0016\u0012\b\u0010!\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010'\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b(\u0010)R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\"\u0010\u000e\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0015\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\u0019\u0010\u001b\u001a\u00020\u00168\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010!\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001b\u0010'\u001a\u0004\u0018\u00010\"8\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006*"}, d2 = {"Lcom/facebook/internal/NativeAppCallAttachmentStore$Attachment;", "", "", "a", "Ljava/lang/String;", "getAttachmentUrl", "()Ljava/lang/String;", "attachmentUrl", "b", "getAttachmentName", "attachmentName", "", "c", "Z", "isContentUri", "()Z", "setContentUri", "(Z)V", GoogleApiAvailabilityLight.a, "getShouldCreateFile", "setShouldCreateFile", "shouldCreateFile", "Ljava/util/UUID;", "e", "Ljava/util/UUID;", "getCallId", "()Ljava/util/UUID;", "callId", "Landroid/graphics/Bitmap;", "f", "Landroid/graphics/Bitmap;", "getBitmap", "()Landroid/graphics/Bitmap;", "bitmap", "Landroid/net/Uri;", "g", "Landroid/net/Uri;", "getOriginalUri", "()Landroid/net/Uri;", "originalUri", "<init>", "(Ljava/util/UUID;Landroid/graphics/Bitmap;Landroid/net/Uri;)V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Attachment {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final String attachmentUrl;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        private final String attachmentName;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private boolean isContentUri;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private boolean shouldCreateFile;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        private final UUID callId;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @Nullable
        private final Bitmap bitmap;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @Nullable
        private final Uri originalUri;

        public Attachment(@NotNull UUID uuid, @Nullable Bitmap bitmap, @Nullable Uri uri) {
            this.callId = uuid;
            this.bitmap = bitmap;
            this.originalUri = uri;
            if (uri != null) {
                String scheme = uri.getScheme();
                if (m.equals("content", scheme, true)) {
                    this.isContentUri = true;
                    String authority = uri.getAuthority();
                    this.shouldCreateFile = (authority == null || m.startsWith$default(authority, "media", false, 2, null)) ? false : true;
                } else if (m.equals("file", uri.getScheme(), true)) {
                    this.shouldCreateFile = true;
                } else if (!Utility.isWebUri(uri)) {
                    throw new FacebookException("Unsupported scheme for media Uri : " + scheme);
                }
            } else {
                if (bitmap == null) {
                    throw new FacebookException("Cannot share media without a bitmap or Uri set");
                }
                this.shouldCreateFile = true;
            }
            String string = this.shouldCreateFile ? UUID.randomUUID().toString() : null;
            this.attachmentName = string;
            this.attachmentUrl = !this.shouldCreateFile ? String.valueOf(uri) : FacebookContentProvider.INSTANCE.getAttachmentUrl(FacebookSdk.getApplicationId(), uuid, string);
        }

        @Nullable
        public final String getAttachmentName() {
            return this.attachmentName;
        }

        @NotNull
        public final String getAttachmentUrl() {
            return this.attachmentUrl;
        }

        @Nullable
        public final Bitmap getBitmap() {
            return this.bitmap;
        }

        @NotNull
        public final UUID getCallId() {
            return this.callId;
        }

        @Nullable
        public final Uri getOriginalUri() {
            return this.originalUri;
        }

        public final boolean getShouldCreateFile() {
            return this.shouldCreateFile;
        }

        /* JADX INFO: renamed from: isContentUri, reason: from getter */
        public final boolean getIsContentUri() {
            return this.isContentUri;
        }

        public final void setContentUri(boolean z) {
            this.isContentUri = z;
        }

        public final void setShouldCreateFile(boolean z) {
            this.shouldCreateFile = z;
        }
    }

    private NativeAppCallAttachmentStore() {
    }

    private final void a(Bitmap bitmap, File outputFile) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(outputFile);
        try {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
        } finally {
            Utility.closeQuietly(fileOutputStream);
        }
    }

    @JvmStatic
    public static final void addAttachments(@Nullable Collection<Attachment> attachments) throws FacebookException {
        File attachmentFile;
        if (attachments == null || attachments.isEmpty()) {
            return;
        }
        if (attachmentsDirectory == null) {
            cleanupAllAttachments();
        }
        ensureAttachmentsDirectoryExists();
        ArrayList<File> arrayList = new ArrayList();
        try {
            for (Attachment attachment : attachments) {
                if (attachment.getShouldCreateFile() && (attachmentFile = getAttachmentFile(attachment.getCallId(), attachment.getAttachmentName(), true)) != null) {
                    arrayList.add(attachmentFile);
                    if (attachment.getBitmap() != null) {
                        INSTANCE.a(attachment.getBitmap(), attachmentFile);
                    } else if (attachment.getOriginalUri() != null) {
                        INSTANCE.b(attachment.getOriginalUri(), attachment.getIsContentUri(), attachmentFile);
                    }
                }
            }
        } catch (IOException e) {
            Log.e(TAG, "Got unexpected exception:" + e);
            for (File file : arrayList) {
                if (file != null) {
                    try {
                        file.delete();
                    } catch (Exception unused) {
                    }
                }
            }
            throw new FacebookException(e);
        }
    }

    private final void b(Uri imageUri, boolean isContentUri, File outputFile) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(outputFile);
        try {
            Utility.copyAndCloseInputStream(!isContentUri ? new FileInputStream(imageUri.getPath()) : FacebookSdk.getApplicationContext().getContentResolver().openInputStream(imageUri), fileOutputStream);
            Utility.closeQuietly(fileOutputStream);
        } catch (Throwable th) {
            Utility.closeQuietly(fileOutputStream);
            throw th;
        }
    }

    @JvmStatic
    public static final void cleanupAllAttachments() {
        Utility.deleteDirectory(getAttachmentsDirectory());
    }

    @JvmStatic
    public static final void cleanupAttachmentsForCall(@NotNull UUID callId) {
        File attachmentsDirectoryForCall = getAttachmentsDirectoryForCall(callId, false);
        if (attachmentsDirectoryForCall != null) {
            Utility.deleteDirectory(attachmentsDirectoryForCall);
        }
    }

    @JvmStatic
    @NotNull
    public static final Attachment createAttachment(@NotNull UUID callId, @NotNull Bitmap attachmentBitmap) {
        return new Attachment(callId, attachmentBitmap, null);
    }

    @JvmStatic
    @Nullable
    public static final File ensureAttachmentsDirectoryExists() {
        File attachmentsDirectory2 = getAttachmentsDirectory();
        if (attachmentsDirectory2 != null) {
            attachmentsDirectory2.mkdirs();
        }
        return attachmentsDirectory2;
    }

    @JvmStatic
    @Nullable
    public static final File getAttachmentFile(@NotNull UUID callId, @Nullable String attachmentName, boolean createDirs) throws IOException {
        File attachmentsDirectoryForCall = getAttachmentsDirectoryForCall(callId, createDirs);
        if (attachmentsDirectoryForCall == null) {
            return null;
        }
        try {
            return new File(attachmentsDirectoryForCall, URLEncoder.encode(attachmentName, "UTF-8"));
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    @JvmStatic
    @Nullable
    public static final synchronized File getAttachmentsDirectory() {
        if (attachmentsDirectory == null) {
            attachmentsDirectory = new File(FacebookSdk.getApplicationContext().getCacheDir(), ATTACHMENTS_DIR_NAME);
        }
        return attachmentsDirectory;
    }

    @JvmStatic
    @Nullable
    public static final File getAttachmentsDirectoryForCall(@NotNull UUID callId, boolean create) {
        if (attachmentsDirectory == null) {
            return null;
        }
        File file = new File(attachmentsDirectory, callId.toString());
        if (create && !file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    @JvmStatic
    @Nullable
    public static final File openAttachment(@Nullable UUID callId, @Nullable String attachmentName) throws FileNotFoundException {
        if (Utility.isNullOrEmpty(attachmentName) || callId == null) {
            throw new FileNotFoundException();
        }
        try {
            return getAttachmentFile(callId, attachmentName, false);
        } catch (IOException unused) {
            throw new FileNotFoundException();
        }
    }

    @JvmStatic
    @NotNull
    public static final Attachment createAttachment(@NotNull UUID callId, @NotNull Uri attachmentUri) {
        return new Attachment(callId, null, attachmentUri);
    }
}
