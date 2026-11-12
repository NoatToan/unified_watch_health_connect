package com.xiaomi.fit.fitness.parser.net;

import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.net.SchemaNetUtils;
import com.xiaomi.fit.fitness.parser.schema.utils.SchemaFilesUtilsKt;
import com.xiaomi.fit.fitness.parser.utils.ParserPreference;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.health.net.SchemaRequest;
import com.xiaomi.fitness.health.net.SchemaRequestData;
import com.xiaomi.fitness.health.net.SchemaRes;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.smarthome.library.crypto.rc4coder.Coder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u000b\u001a\u00020\fJ\b\u0010\r\u001a\u00020\fH\u0002J\u0018\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005H\u0002J\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0005H\u0002J\f\u0010\u0015\u001a\u0004\u0018\u00010\u0005*\u00020\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/net/SchemaNetUtils;", "", "<init>", "()V", "SchemaDir", "", "downloadSchemaFileName", "TAG", "CHANNEL", "getCHANNEL", "()Ljava/lang/String;", "getSchema", "", "getSchemaUrl", "downloadSchema", "url", "md5", "saveFile", "responseBody", "Lokhttp3/ResponseBody;", "remoteMd5", "calculateMD5", "Ljava/io/File;", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SchemaNetUtils {

    @NotNull
    private static final String CHANNEL;

    @NotNull
    public static final SchemaNetUtils INSTANCE = new SchemaNetUtils();

    @NotNull
    public static final String SchemaDir = "schema";

    @NotNull
    public static final String TAG = "Schema_NetUtils";

    @NotNull
    public static final String downloadSchemaFileName = "downloadSchma.zip";

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.parser.net.SchemaNetUtils$getSchema$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.parser.net.SchemaNetUtils$getSchema$1", f = "SchemaNetUtils.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(boolean z) {
            FitnessLogUtils.i(SchemaNetUtils.TAG, "schemaNet , isLogin:" + z);
            if (z) {
                SchemaNetUtils.INSTANCE.getSchemaUrl();
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AccountManager.Companion companion = AccountManager.INSTANCE;
            if (AccountManagerExtKt.getInstance(companion).isLogin()) {
                FitnessLogUtils.i(SchemaNetUtils.TAG, "schemaNet , isLogin:: true");
                SchemaNetUtils.INSTANCE.getSchemaUrl();
            } else {
                AccountManagerExtKt.getInstance(companion).addAccountListener(new Function1() { // from class: com.xiaomi.fit.fitness.parser.net.a
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj2) {
                        return SchemaNetUtils.AnonymousClass1.invokeSuspend$lambda$0(((Boolean) obj2).booleanValue());
                    }
                });
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static {
        CHANNEL = AppUtil.INSTANCE.isPlayChannel() ? "android_play" : "android_mi";
    }

    private SchemaNetUtils() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence calculateMD5$lambda$7(byte b2) {
        String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b2)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    private final void downloadSchema(String url, final String md5) {
        new SchemaRequest().downloadSchemaZip(url, new Function1() { // from class: zfl
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SchemaNetUtils.downloadSchema$lambda$2(md5, (ResponseBody) obj);
            }
        }, new Function1() { // from class: agl
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SchemaNetUtils.downloadSchema$lambda$3((ApiException) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit downloadSchema$lambda$2(String md5, ResponseBody it) {
        Intrinsics.checkNotNullParameter(md5, "$md5");
        Intrinsics.checkNotNullParameter(it, "it");
        FitnessLogUtils.i(TAG, "download schema success");
        INSTANCE.saveFile(it, md5);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit downloadSchema$lambda$3(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        FitnessLogUtils.i(TAG, "download schema error:" + it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getSchemaUrl() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        ParserPreference parserPreference = ParserPreference.INSTANCE;
        if (jCurrentTimeMillis - parserPreference.getPRE_REQUEST_SCHEMA() < 3600000) {
            FitnessLogUtils.i(TAG, "The interval between two requests is less than one hour");
            return;
        }
        parserPreference.setPRE_REQUEST_SCHEMA(System.currentTimeMillis());
        FitnessLogUtils.i(TAG, "getSchemaUrl, local md5:" + parserPreference.getDEFAULT_SCHEMA_MD5() + ",send to server md5:" + parserPreference.getSchemaMd5() + " , app_version:" + AppUtil.getVersionName());
        new SchemaRequest().getSchemaUrl(new SchemaRequestData(CHANNEL, AppUtil.getVersionName(), parserPreference.getSchemaMd5()), new Function1() { // from class: bgl
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SchemaNetUtils.getSchemaUrl$lambda$0((SchemaRes) obj);
            }
        }, new Function1() { // from class: cgl
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SchemaNetUtils.getSchemaUrl$lambda$1((ApiException) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getSchemaUrl$lambda$0(SchemaRes it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.getStatus() == 1) {
            INSTANCE.downloadSchema(it.getUrl(), it.getMd5());
        }
        FitnessLogUtils.i(TAG, "getSchemaUrl success, remote :" + it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getSchemaUrl$lambda$1(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        FitnessLogUtils.i(TAG, "getSchemaUrl error:" + it);
        return Unit.INSTANCE;
    }

    private final void saveFile(ResponseBody responseBody, String remoteMd5) {
        try {
            try {
                File file = new File(AppUtil.getApp().getFilesDir(), SchemaDir);
                File file2 = new File(file, downloadSchemaFileName);
                if (!file.exists() && !file.mkdirs()) {
                    FitnessLogUtils.e(TAG, "save Schema , create dir fail：" + file);
                    responseBody.close();
                    return;
                }
                File fileCreateTempFile = File.createTempFile("schema_", ".tmp", file);
                InputStream inputStreamByteStream = responseBody.byteStream();
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
                    try {
                        if (inputStreamByteStream == null) {
                            FitnessLogUtils.e(TAG, "InputStream is null");
                            CloseableKt.closeFinally(fileOutputStream, null);
                            CloseableKt.closeFinally(inputStreamByteStream, null);
                            responseBody.close();
                            return;
                        }
                        ByteStreamsKt.copyTo$default(inputStreamByteStream, fileOutputStream, 0, 2, null);
                        CloseableKt.closeFinally(fileOutputStream, null);
                        CloseableKt.closeFinally(inputStreamByteStream, null);
                        if (fileCreateTempFile.exists() && fileCreateTempFile.length() > 0) {
                            Intrinsics.checkNotNull(fileCreateTempFile);
                            String strCalculateMD5 = calculateMD5(fileCreateTempFile);
                            FitnessLogUtils.d(TAG, "actualMd5:" + strCalculateMD5 + " , remoteMd5:" + remoteMd5);
                            if (!Intrinsics.areEqual(strCalculateMD5, remoteMd5)) {
                                FitnessLogUtils.i(TAG, "MD5 verification failed, keeping old file.");
                                fileCreateTempFile.delete();
                                responseBody.close();
                                return;
                            }
                            if (file2.exists()) {
                                file2.delete();
                            }
                            FitnessLogUtils.i(TAG, "schemaZip md5 verification passed");
                            fileCreateTempFile.renameTo(file2);
                            if (SchemaFilesUtilsKt.extractZip(SchemaFilesUtilsKt.getSchemaFliePath(), downloadSchemaFileName, SchemaFilesUtilsKt.outputSchemaDir)) {
                                ParserPreference.INSTANCE.setSchemaMd5(strCalculateMD5);
                                FitnessLogUtils.i(TAG, "schema unzip success");
                            } else {
                                FitnessLogUtils.i(TAG, "schema unzip fail");
                            }
                            responseBody.close();
                            return;
                        }
                        FitnessLogUtils.e(TAG, "Downloaded file is empty or not saved correctly.");
                        responseBody.close();
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            CloseableKt.closeFinally(fileOutputStream, th);
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        CloseableKt.closeFinally(inputStreamByteStream, th3);
                        throw th4;
                    }
                }
            } catch (IOException e) {
                FitnessLogUtils.e(TAG, "save Schema , file write exception:", e);
            }
        } catch (Throwable th5) {
            responseBody.close();
            throw th5;
        }
    }

    @Nullable
    public final String calculateMD5(@NotNull File file) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(file, "<this>");
        if (!file.exists()) {
            return null;
        }
        MessageDigest messageDigest = MessageDigest.getInstance(Coder.KEY_MD5);
        byte[] bArr = new byte[8192];
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            for (int i = fileInputStream.read(bArr); i != -1; i = fileInputStream.read(bArr)) {
                messageDigest.update(bArr, 0, i);
            }
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(fileInputStream, null);
            byte[] bArrDigest = messageDigest.digest();
            Intrinsics.checkNotNull(bArrDigest);
            return ArraysKt___ArraysKt.joinToString$default(bArrDigest, (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: yfl
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SchemaNetUtils.calculateMD5$lambda$7(((Byte) obj).byteValue());
                }
            }, 30, (Object) null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(fileInputStream, th);
                throw th2;
            }
        }
    }

    @NotNull
    public final String getCHANNEL() {
        return CHANNEL;
    }

    public final void getSchema() {
        ParserPreference parserPreference = ParserPreference.INSTANCE;
        if (parserPreference.getIS_SUPPORT_SCHEMA()) {
            ScopeExtKt.scopeNet(Dispatchers.getIO(), new AnonymousClass1(null));
            return;
        }
        FitnessLogUtils.i(TAG, "getSchema from remote,but config is_support_schema:" + parserPreference.getIS_SUPPORT_SCHEMA());
    }
}
