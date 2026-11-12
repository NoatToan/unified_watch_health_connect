package org.cybergarage.upnp.std.av.server;

import java.io.File;
import org.cybergarage.http.HTTPRequest;
import org.cybergarage.net.HostInterface;
import org.cybergarage.upnp.Device;
import org.cybergarage.upnp.Service;
import org.cybergarage.upnp.device.InvalidDescriptionException;
import org.cybergarage.upnp.std.av.server.object.Format;
import org.cybergarage.util.Debug;

/* JADX INFO: loaded from: classes23.dex */
public class MediaServer extends Device {
    public static final int DEFAULT_HTTP_PORT = 38520;
    public static final String DESCRIPTION = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n<root xmlns=\"urn:schemas-upnp-org:device-1-0\">\n   <specVersion>\n      <major>1</major>\n      <minor>0</minor>\n   </specVersion>\n   <device>\n      <deviceType>urn:schemas-upnp-org:device:MediaServer:1</deviceType>\n      <friendlyName>Cyber Garage Media Server</friendlyName>\n      <manufacturer>Cyber Garage</manufacturer>\n      <manufacturerURL>http://www.cybergarage.org</manufacturerURL>\n      <modelDescription>Provides content through UPnP ContentDirectory service</modelDescription>\n      <modelName>Cyber Garage Media Server</modelName>\n      <modelNumber>1.0</modelNumber>\n      <modelURL>http://www.cybergarage.org</modelURL>\n      <UDN>uuid:362d9414-31a0-48b6-b684-2b4bd38391d0</UDN>\n      <serviceList>\n         <service>\n            <serviceType>urn:schemas-upnp-org:service:ContentDirectory:1</serviceType>\n            <serviceId>urn:upnp-org:serviceId:urn:schemas-upnp-org:service:ContentDirectory</serviceId>\n            <SCPDURL>/service/ContentDirectory1.xml</SCPDURL>\n            <controlURL>/service/ContentDirectory_control</controlURL>\n            <eventSubURL>/service/ContentDirectory_event</eventSubURL>\n         </service>\n         <service>\n            <serviceType>urn:schemas-upnp-org:service:ConnectionManager:1</serviceType>\n            <serviceId>urn:upnp-org:serviceId:urn:schemas-upnp-org:service:ConnectionManager</serviceId>\n            <SCPDURL>/service/ConnectionManager1.xml</SCPDURL>\n            <controlURL>/service/ConnectionManager_control</controlURL>\n            <eventSubURL>/service/ConnectionManager_event</eventSubURL>\n         </service>\n      </serviceList>\n   </device>\n</root>";
    private static final String DESCRIPTION_FILE_NAME = "description/description.xml";
    public static final String DEVICE_TYPE = "urn:schemas-upnp-org:device:MediaServer:1";
    private ContentDirectory conDir;
    private ConnectionManager conMan;

    public MediaServer(String str) throws InvalidDescriptionException {
        super(new File(str));
        initialize();
    }

    private void initialize(String str, String str2, String str3) throws InvalidDescriptionException {
        loadDescription(str);
        getService(ContentDirectory.SERVICE_TYPE).loadSCPD(str2);
        getService("urn:schemas-upnp-org:service:ConnectionManager:1").loadSCPD(str3);
        initialize();
    }

    public void addContentDirectory(Directory directory) {
        getContentDirectory().addDirectory(directory);
    }

    public boolean addPlugIn(Format format) {
        return getContentDirectory().addPlugIn(format);
    }

    public void finalize() {
        stop();
    }

    public ConnectionManager getConnectionManager() {
        return this.conMan;
    }

    public ContentDirectory getContentDirectory() {
        return this.conDir;
    }

    @Override // org.cybergarage.upnp.Device
    public String getInterfaceAddress() {
        return HostInterface.getInterface();
    }

    public int getNContentDirectories() {
        return getContentDirectory().getNDirectories();
    }

    @Override // org.cybergarage.upnp.Device, org.cybergarage.http.HTTPRequestListener
    public void httpRequestRecieved(HTTPRequest hTTPRequest) {
        String uri = hTTPRequest.getURI();
        Debug.message("uri = " + uri);
        if (uri.startsWith(ContentDirectory.CONTENT_EXPORT_URI)) {
            getContentDirectory().contentExportRequestRecieved(hTTPRequest);
        } else {
            super.httpRequestRecieved(hTTPRequest);
        }
    }

    public void removeAllContentDirectories() {
        getContentDirectory().removeAllDirectories();
    }

    public void removeContentDirectory(String str) {
        getContentDirectory().removeDirectory(str);
    }

    public void setInterfaceAddress(String str) {
        HostInterface.setInterface(str);
    }

    @Override // org.cybergarage.upnp.Device
    public boolean start() {
        getContentDirectory().start();
        super.start();
        return true;
    }

    @Override // org.cybergarage.upnp.Device
    public boolean stop() {
        getContentDirectory().stop();
        super.stop();
        return true;
    }

    public void update() {
    }

    public Directory getContentDirectory(int i) {
        return getContentDirectory().getDirectory(i);
    }

    public MediaServer() {
        try {
            initialize(DESCRIPTION, ContentDirectory.SCPD, "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n<scpd xmlns=\"urn:schemas-upnp-org:service-1-0\">\n   <specVersion>\n      <major>1</major>\n      <minor>0</minor>\n\t</specVersion>\n\t<actionList>\n\t\t<action>\n         <name>GetCurrentConnectionInfo</name>\n         <argumentList>\n            <argument>\n               <name>ConnectionID</name>\n               <direction>in</direction>\n               <relatedStateVariable>A_ARG_TYPE_ConnectionID</relatedStateVariable>\n            </argument>\n            <argument>\n               <name>RcsID</name>\n               <direction>out</direction>\n               <relatedStateVariable>A_ARG_TYPE_RcsID</relatedStateVariable>\n            </argument>\n            <argument>\n               <name>AVTransportID</name>\n               <direction>out</direction>\n               <relatedStateVariable>A_ARG_TYPE_AVTransportID</relatedStateVariable>\n            </argument>\n            <argument>\n               <name>ProtocolInfo</name>\n               <direction>out</direction>\n               <relatedStateVariable>A_ARG_TYPE_ProtocolInfo</relatedStateVariable>\n            </argument>\n            <argument>\n               <name>PeerConnectionManager</name>\n               <direction>out</direction>\n               <relatedStateVariable>A_ARG_TYPE_ConnectionManager</relatedStateVariable>\n            </argument>\n            <argument>\n               <name>PeerConnectionID</name>\n               <direction>out</direction>\n               <relatedStateVariable>A_ARG_TYPE_ConnectionID</relatedStateVariable>\n            </argument>\n            <argument>\n               <name>Direction</name>\n               <direction>out</direction>\n               <relatedStateVariable>A_ARG_TYPE_Direction</relatedStateVariable>\n            </argument>\n            <argument>\n               <name>Status</name>\n               <direction>out</direction>\n               <relatedStateVariable>A_ARG_TYPE_ConnectionStatus</relatedStateVariable>\n            </argument>\n         </argumentList>\n      </action>\n      <action>\n         <name>GetProtocolInfo</name>\n         <argumentList>\n            <argument>\n               <name>Source</name>\n               <direction>out</direction>\n               <relatedStateVariable>SourceProtocolInfo</relatedStateVariable>\n            </argument>\n            <argument>\n               <name>Sink</name>\n               <direction>out</direction>\n               <relatedStateVariable>SinkProtocolInfo</relatedStateVariable>\n            </argument>\n         </argumentList>\n      </action>\n      <action>\n         <name>GetCurrentConnectionIDs</name>\n         <argumentList>\n            <argument>\n               <name>ConnectionIDs</name>\n               <direction>out</direction>\n               <relatedStateVariable>CurrentConnectionIDs</relatedStateVariable>\n            </argument>\n         </argumentList>\n      </action>\n   </actionList>\n   <serviceStateTable>\n      <stateVariable sendEvents=\"no\">\n         <name>A_ARG_TYPE_ProtocolInfo</name>\n         <dataType>string</dataType>\n      </stateVariable>\n      <stateVariable sendEvents=\"no\">\n         <name>A_ARG_TYPE_ConnectionStatus</name>\n         <dataType>string</dataType>\n         <allowedValueList>\n            <allowedValue>OK</allowedValue>\n            <allowedValue>ContentFormatMismatch</allowedValue>\n            <allowedValue>InsufficientBandwidth</allowedValue>\n            <allowedValue>UnreliableChannel</allowedValue>\n            <allowedValue>Unknown</allowedValue>\n         </allowedValueList>\n      </stateVariable>\n      <stateVariable sendEvents=\"no\">\n         <name>A_ARG_TYPE_AVTransportID</name>\n         <dataType>i4</dataType>\n      </stateVariable>\n      <stateVariable sendEvents=\"no\">\n         <name>A_ARG_TYPE_RcsID</name>\n         <dataType>i4</dataType>\n      </stateVariable>\n      <stateVariable sendEvents=\"no\">\n         <name>A_ARG_TYPE_ConnectionID</name>\n         <dataType>i4</dataType>\n      </stateVariable>\n      <stateVariable sendEvents=\"no\">\n         <name>A_ARG_TYPE_ConnectionManager</name>\n         <dataType>string</dataType>\n      </stateVariable>\n      <stateVariable sendEvents=\"yes\">\n         <name>SourceProtocolInfo</name>\n         <dataType>string</dataType>\n      </stateVariable>\n      <stateVariable sendEvents=\"yes\">\n         <name>SinkProtocolInfo</name>\n         <dataType>string</dataType>\n      </stateVariable>\n      <stateVariable sendEvents=\"no\">\n         <name>A_ARG_TYPE_Direction</name>\n         <dataType>string</dataType>\n         <allowedValueList>\n            <allowedValue>Input</allowedValue>\n            <allowedValue>Output</allowedValue>\n         </allowedValueList>\n      </stateVariable>\n      <stateVariable sendEvents=\"yes\">\n         <name>CurrentConnectionIDs</name>\n         <dataType>string</dataType>\n      </stateVariable>\n   </serviceStateTable>\n</scpd>");
        } catch (InvalidDescriptionException unused) {
        }
    }

    public MediaServer(String str, String str2, String str3) throws InvalidDescriptionException {
        initialize(str, str2, str3);
    }

    private void initialize() {
        org.cybergarage.upnp.UPnP.setEnable(9);
        setInterfaceAddress(HostInterface.getHostAddress(0));
        setHTTPPort(DEFAULT_HTTP_PORT);
        this.conDir = new ContentDirectory(this);
        this.conMan = new ConnectionManager(this);
        Service service = getService(ContentDirectory.SERVICE_TYPE);
        service.setActionListener(getContentDirectory());
        service.setQueryListener(getContentDirectory());
        Service service2 = getService("urn:schemas-upnp-org:service:ConnectionManager:1");
        service2.setActionListener(getConnectionManager());
        service2.setQueryListener(getConnectionManager());
    }
}
