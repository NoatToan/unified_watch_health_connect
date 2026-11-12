package org.cybergarage.upnp.control;

import java.net.MalformedURLException;
import java.net.URL;
import org.cybergarage.http.HTTP;
import org.cybergarage.http.HTTPRequest;
import org.cybergarage.soap.SOAPRequest;
import org.cybergarage.upnp.Service;

/* JADX INFO: loaded from: classes23.dex */
public class ControlRequest extends SOAPRequest {
    public ControlRequest() {
    }

    public boolean isActionControl() {
        return !isQueryControl();
    }

    public boolean isQueryControl() {
        return isSOAPAction(Control.QUERY_SOAPACTION);
    }

    public void setRequestHost(Service service) {
        String controlURL = service.getControlURL();
        String uRLBase = service.getRootDevice().getURLBase();
        if (uRLBase != null && uRLBase.length() > 0) {
            try {
                String path = new URL(uRLBase).getPath();
                int length = path.length();
                if (length > 0 && (1 < length || path.charAt(0) != '/')) {
                    controlURL = path + controlURL;
                }
            } catch (MalformedURLException unused) {
            }
        }
        setURI(controlURL, true);
        if (!HTTP.isAbsoluteURL(controlURL)) {
            controlURL = "";
        }
        if (controlURL == null || controlURL.length() <= 0) {
            controlURL = service.getRootDevice().getURLBase();
        }
        if (controlURL == null || controlURL.length() <= 0) {
            controlURL = service.getRootDevice().getLocation();
        }
        String host = HTTP.getHost(controlURL);
        int port = HTTP.getPort(controlURL);
        setHost(host, port);
        setRequestHost(host);
        setRequestPort(port);
    }

    public ControlRequest(HTTPRequest hTTPRequest) {
        set(hTTPRequest);
    }
}
