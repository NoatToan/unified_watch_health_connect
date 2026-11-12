package org.cybergarage.xml;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import org.cybergarage.http.HTTP;
import org.cybergarage.http.HTTPRequest;
import org.cybergarage.http.HTTPResponse;

/* JADX INFO: loaded from: classes23.dex */
public abstract class Parser {
    public abstract Node parse(InputStream inputStream) throws ParserException;

    public Node parse(URL url) throws ParserException {
        String host = url.getHost();
        int port = url.getPort();
        if (port == -1) {
            port = 80;
        }
        String path = url.getPath();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setRequestProperty("Content-Length", "0");
            if (host != null) {
                httpURLConnection.setRequestProperty(HTTP.HOST, host);
            }
            InputStream inputStream = httpURLConnection.getInputStream();
            Node node = parse(inputStream);
            inputStream.close();
            httpURLConnection.disconnect();
            return node;
        } catch (Exception unused) {
            HTTPRequest hTTPRequest = new HTTPRequest();
            hTTPRequest.setMethod("GET");
            hTTPRequest.setURI(path);
            HTTPResponse hTTPResponsePost = hTTPRequest.post(host, port);
            if (hTTPResponsePost.isSuccessful()) {
                return parse(new ByteArrayInputStream(new String(hTTPResponsePost.getContent()).getBytes()));
            }
            throw new ParserException("HTTP comunication failed: no answer from peer.Unable to retrive resoure -> " + url.toString());
        }
    }

    public Node parse(File file) throws ParserException {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            Node node = parse(fileInputStream);
            fileInputStream.close();
            return node;
        } catch (Exception e) {
            throw new ParserException(e);
        }
    }

    public Node parse(String str) throws ParserException {
        try {
            return parse(new ByteArrayInputStream(str.getBytes()));
        } catch (Exception e) {
            throw new ParserException(e);
        }
    }
}
