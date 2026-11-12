package com.huami.ai.speech.alexa;

import com.amazon.alexa.avs.http.HttpHeaders;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.moving.ui.utils.SportAnalytics;
import com.huami.watch.transdata.transport.Actions;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.apache.commons.fileupload.MultipartStream;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001c\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u001a\u001c\u0010\u0006\u001a\u00020\b*\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u001a&\u0010\r\u001a\u0004\u0018\u00010\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\f\u001a\u00020\nH\u0002\u001a\u001c\u0010\u000e\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tH\u0002\u001a\u001c\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tH\u0002\u001a\f\u0010\u0013\u001a\u00020\u0001*\u00020\u0012H\u0002\u001a\u0018\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t*\u00020\u0012H\u0002\u001a\n\u0010\u0015\u001a\u00020\u0010*\u00020\b\"\u0016\u0010\u0017\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016\"\u0016\u0010\u0018\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016¨\u0006\u0019"}, d2 = {"Lokhttp3/Response;", "", HttpHeaders.Parameters.BOUNDARY, "", "bufSize", "Lcom/huami/ai/speech/alexa/MultipartResponseResult;", "asMultipart", "Ljava/io/InputStream;", "Lcom/huami/ai/speech/alexa/MultipartResponse;", "", "", Actions.KEY_HEADERS, "searchHeader", "c", "b", SportAnalytics.ParamValue.MapButtonType.MAP, "", "e", "Lorg/apache/commons/fileupload/MultipartStream;", GoogleApiAvailabilityLight.a, "a", "isEmpty", "Ljava/lang/String;", "CONTENT_TYPE", "CONTENT_ID", "speech-alexa_release"}, k = 2, mv = {1, 5, 1})
public final class MultipartResponseKt {

    @NotNull
    private static final String a = "Content-Type";

    @NotNull
    private static final String b = "Content-ID";

    private static final Map<String, String> a(MultipartStream multipartStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new StringReader(multipartStream.readHeaders()));
        HashMap map = new HashMap();
        for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
            int length = line.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = Intrinsics.compare((int) line.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            String string = line.subSequence(i, length + 1).toString();
            if ((string.length() > 0) && StringsKt__StringsKt.contains$default((CharSequence) string, (CharSequence) ":", false, 2, (Object) null)) {
                int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) string, ":", 0, false, 6, (Object) null);
                Objects.requireNonNull(string, "null cannot be cast to non-null type java.lang.String");
                String strSubstring = string.substring(0, iIndexOf$default);
                int length2 = strSubstring.length() - 1;
                int i2 = 0;
                boolean z3 = false;
                while (i2 <= length2) {
                    boolean z4 = Intrinsics.compare((int) strSubstring.charAt(!z3 ? i2 : length2), 32) <= 0;
                    if (z3) {
                        if (!z4) {
                            break;
                        }
                        length2--;
                    } else if (z4) {
                        i2++;
                    } else {
                        z3 = true;
                    }
                }
                String string2 = strSubstring.subSequence(i2, length2 + 1).toString();
                String strSubstring2 = string.substring(iIndexOf$default + 1);
                int length3 = strSubstring2.length() - 1;
                int i3 = 0;
                boolean z5 = false;
                while (i3 <= length3) {
                    boolean z6 = Intrinsics.compare((int) strSubstring2.charAt(!z5 ? i3 : length3), 32) <= 0;
                    if (z5) {
                        if (!z6) {
                            break;
                        }
                        length3--;
                    } else if (z6) {
                        i3++;
                    } else {
                        z5 = true;
                    }
                }
                String string3 = strSubstring2.subSequence(i3, length3 + 1).toString();
                Locale locale = Locale.getDefault();
                Objects.requireNonNull(string2, "null cannot be cast to non-null type java.lang.String");
                map.put(string2.toLowerCase(locale), string3);
            }
        }
        return map;
    }

    @NotNull
    public static final MultipartResponseResult asMultipart(@NotNull Response response, @NotNull byte[] bArr, int i) {
        ResponseBody responseBodyBody = response.body();
        return new MultipartResponseResult(response.isSuccessful(), response.code(), asMultipart(responseBodyBody == null ? null : responseBodyBody.byteStream(), bArr, i));
    }

    public static /* synthetic */ MultipartResponseResult asMultipart$default(Response response, byte[] bArr, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 512;
        }
        return asMultipart(response, bArr, i);
    }

    private static final String b(Map<String, String> map) {
        String strC = c(map, "Content-ID");
        return strC.substring(1, strC.length() - 1);
    }

    private static final String c(Map<String, String> map, String str) {
        Locale locale = Locale.getDefault();
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        return map.get(str.toLowerCase(locale));
    }

    private static final byte[] d(MultipartStream multipartStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        multipartStream.readBodyData(byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    private static final boolean e(Map<String, String> map) {
        String strC = c(map, "Content-Type");
        if (strC == null || strC.length() == 0) {
            return false;
        }
        return StringsKt__StringsKt.contains$default((CharSequence) strC, (CharSequence) "application/json", false, 2, (Object) null);
    }

    public static final boolean isEmpty(@NotNull MultipartResponse multipartResponse) {
        return multipartResponse.getJsonParts().isEmpty() && multipartResponse.getStreamParts().isEmpty();
    }

    public static /* synthetic */ MultipartResponse asMultipart$default(InputStream inputStream, byte[] bArr, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 512;
        }
        return asMultipart(inputStream, bArr, i);
    }

    @NotNull
    public static final MultipartResponse asMultipart(@NotNull InputStream inputStream, @NotNull byte[] bArr, int i) throws IOException {
        MultipartStream multipartStream = new MultipartStream(inputStream, bArr, i, null);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (boolean zSkipPreamble = multipartStream.skipPreamble(); zSkipPreamble; zSkipPreamble = multipartStream.readBoundary()) {
            Map<String, String> mapA = a(multipartStream);
            byte[] bArrD = d(multipartStream);
            if (e(mapA)) {
                arrayList.add(new JsonMultipart(new String(bArrD, Charset.forName("UTF-8"))));
            } else {
                arrayList2.add(new StreamMultipart(b(mapA), new ByteArrayInputStream(bArrD)));
            }
        }
        return new MultipartResponse(arrayList, arrayList2);
    }
}
