package defpackage;

import com.braintreepayments.api.HttpResponseParser;
import com.huawei.openalliance.ad.constant.Constants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.nio.charset.StandardCharsets;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes21.dex */
class sc implements HttpResponseParser {
    sc() {
    }

    @Override // com.braintreepayments.api.HttpResponseParser
    public String parse(int i, HttpURLConnection httpURLConnection) throws Exception {
        String strD = d(i, httpURLConnection);
        if (i != 400) {
            if (i == 401) {
                throw new sb(strD);
            }
            if (i == 403) {
                throw new sf(strD);
            }
            if (i != 422) {
                if (i == 426) {
                    throw new vc(strD);
                }
                if (i == 429) {
                    throw new ur("You are being rate-limited. Please try again in a few minutes.");
                }
                if (i == 500) {
                    throw new us(strD);
                }
                if (i == 503) {
                    throw new uo(strD);
                }
                switch (i) {
                    case 200:
                    case 201:
                    case 202:
                        return strD;
                    default:
                        throw new uz(strD);
                }
            }
        }
        throw new vb(strD);
    }

    private String d(int i, HttpURLConnection httpURLConnection) throws IOException {
        boolean zEquals = Constants.GZIP.equals(httpURLConnection.getContentEncoding());
        if (i == 429) {
            return null;
        }
        switch (i) {
            case 200:
            case 201:
            case 202:
                return b(httpURLConnection.getInputStream(), zEquals);
            default:
                return b(httpURLConnection.getErrorStream(), zEquals);
        }
    }

    private String b(InputStream inputStream, boolean z) throws IOException {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (z) {
            try {
                inputStream = new GZIPInputStream(inputStream);
            } finally {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
            }
        }
        byte[] bArr = new byte[1024];
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                break;
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
        return new String(byteArrayOutputStream.toByteArray(), StandardCharsets.UTF_8);
    }
}
