package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import android.util.Base64;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Charsets;
import java.net.URLDecoder;

/* JADX INFO: loaded from: classes14.dex */
public final class DataSchemeDataSource extends BaseDataSource {
    public static final String SCHEME_DATA = "data";
    private int bytesRemaining;
    private byte[] data;
    private DataSpec dataSpec;
    private int readPosition;

    public DataSchemeDataSource() {
        super(false);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() {
        if (this.data != null) {
            this.data = null;
            transferEnded();
        }
        this.dataSpec = null;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public Uri getUri() {
        DataSpec dataSpec = this.dataSpec;
        if (dataSpec != null) {
            return dataSpec.uri;
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public long open(DataSpec dataSpec) throws DataSourceException, ParserException {
        transferInitializing(dataSpec);
        this.dataSpec = dataSpec;
        Uri uri = dataSpec.uri;
        String scheme = uri.getScheme();
        boolean zEquals = "data".equals(scheme);
        String strValueOf = String.valueOf(scheme);
        Assertions.checkArgument(zEquals, strValueOf.length() != 0 ? "Unsupported scheme: ".concat(strValueOf) : new String("Unsupported scheme: "));
        String[] strArrSplit = Util.split(uri.getSchemeSpecificPart(), ",");
        if (strArrSplit.length != 2) {
            String strValueOf2 = String.valueOf(uri);
            StringBuilder sb3 = new StringBuilder(strValueOf2.length() + 23);
            sb3.append("Unexpected URI format: ");
            sb3.append(strValueOf2);
            throw ParserException.createForMalformedDataOfUnknownType(sb3.toString(), null);
        }
        String str = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.data = Base64.decode(str, 0);
            } catch (IllegalArgumentException e4) {
                String strValueOf3 = String.valueOf(str);
                throw ParserException.createForMalformedDataOfUnknownType(strValueOf3.length() != 0 ? "Error while parsing Base64 encoded string: ".concat(strValueOf3) : new String("Error while parsing Base64 encoded string: "), e4);
            }
        } else {
            this.data = Util.getUtf8Bytes(URLDecoder.decode(str, Charsets.US_ASCII.name()));
        }
        long j8 = dataSpec.position;
        byte[] bArr = this.data;
        if (j8 > bArr.length) {
            this.data = null;
            throw new DataSourceException(2008);
        }
        int i14 = (int) j8;
        this.readPosition = i14;
        int length = bArr.length - i14;
        this.bytesRemaining = length;
        long j14 = dataSpec.length;
        if (j14 != -1) {
            this.bytesRemaining = (int) Math.min(length, j14);
        }
        transferStarted(dataSpec);
        long j15 = dataSpec.length;
        return j15 != -1 ? j15 : this.bytesRemaining;
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] bArr, int i14, int i15) {
        if (i15 == 0) {
            return 0;
        }
        int i16 = this.bytesRemaining;
        if (i16 == 0) {
            return -1;
        }
        int iMin = Math.min(i15, i16);
        System.arraycopy(Util.castNonNull(this.data), this.readPosition, bArr, i14, iMin);
        this.readPosition += iMin;
        this.bytesRemaining -= iMin;
        bytesTransferred(iMin);
        return iMin;
    }
}
