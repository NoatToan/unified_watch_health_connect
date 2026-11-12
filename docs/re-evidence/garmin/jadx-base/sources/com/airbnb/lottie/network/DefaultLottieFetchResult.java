package com.airbnb.lottie.network;

import com.airbnb.lottie.utils.Logger;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* JADX INFO: loaded from: classes7.dex */
public class DefaultLottieFetchResult implements LottieFetchResult {
    private final HttpURLConnection connection;

    public DefaultLottieFetchResult(HttpURLConnection httpURLConnection) {
        this.connection = httpURLConnection;
    }

    private String getErrorFromConnection(HttpURLConnection httpURLConnection) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb3 = new StringBuilder();
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line != null) {
                    sb3.append(line);
                    sb3.append('\n');
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th3) {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
                throw th3;
            }
        }
        bufferedReader.close();
        return sb3.toString();
    }

    @Override // com.airbnb.lottie.network.LottieFetchResult
    public InputStream bodyByteStream() {
        return this.connection.getInputStream();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.connection.disconnect();
    }

    @Override // com.airbnb.lottie.network.LottieFetchResult
    public String contentType() {
        return this.connection.getContentType();
    }

    @Override // com.airbnb.lottie.network.LottieFetchResult
    public String error() {
        try {
            if (isSuccessful()) {
                return null;
            }
            return "Unable to fetch " + this.connection.getURL() + ". Failed with " + this.connection.getResponseCode() + "\n" + getErrorFromConnection(this.connection);
        } catch (IOException | NullPointerException e4) {
            Logger.warning("get error failed ", e4);
            return e4.getMessage();
        }
    }

    @Override // com.airbnb.lottie.network.LottieFetchResult
    public boolean isSuccessful() {
        try {
            return this.connection.getResponseCode() / 100 == 2;
        } catch (IOException unused) {
            return false;
        }
    }
}
