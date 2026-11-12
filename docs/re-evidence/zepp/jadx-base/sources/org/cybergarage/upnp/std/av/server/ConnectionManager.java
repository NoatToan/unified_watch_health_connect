package org.cybergarage.upnp.std.av.server;

import org.cybergarage.upnp.Action;
import org.cybergarage.upnp.StateVariable;
import org.cybergarage.upnp.control.ActionListener;
import org.cybergarage.upnp.control.QueryListener;
import org.cybergarage.util.Mutex;

/* JADX INFO: loaded from: classes23.dex */
public class ConnectionManager implements ActionListener, QueryListener {
    public static final String AVTRANSPORTID = "AVTransportID";
    public static final String CONNECTIONCOMPLETE = "ConnectionComplete";
    public static final String CONNECTIONID = "ConnectionID";
    public static final String CONNECTIONIDS = "ConnectionIDs";
    public static final String CONTENTFORMATMISMATCH = "ContentFormatMismatch";
    public static final String CURRENTCONNECTIONIDS = "CurrentConnectionIDs";
    public static final String DIRECTION = "Direction";
    public static final String GETCURRENTCONNECTIONIDS = "GetCurrentConnectionIDs";
    public static final String GETCURRENTCONNECTIONINFO = "GetCurrentConnectionInfo";
    public static final String GETPROTOCOLINFO = "GetProtocolInfo";
    public static final String HTTP_GET = "http-get";
    public static final String INPUT = "Input";
    public static final String INSUFFICIENTBANDWIDTH = "InsufficientBandwidth";
    public static final String OK = "OK";
    public static final String OUTPUT = "Output";
    public static final String PEERCONNECTIONID = "PeerConnectionID";
    public static final String PEERCONNECTIONMANAGER = "PeerConnectionManager";
    public static final String PREPAREFORCONNECTION = "PrepareForConnection";
    public static final String PROTOCOLINFO = "ProtocolInfo";
    public static final String RCSID = "RcsID";
    public static final String REMOTEPROTOCOLINFO = "RemoteProtocolInfo";
    public static final String SCPD = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n<scpd xmlns=\"urn:schemas-upnp-org:service-1-0\">\n   <specVersion>\n      <major>1</major>\n      <minor>0</minor>\n\t</specVersion>\n\t<actionList>\n\t\t<action>\n         <name>GetCurrentConnectionInfo</name>\n         <argumentList>\n            <argument>\n               <name>ConnectionID</name>\n               <direction>in</direction>\n               <relatedStateVariable>A_ARG_TYPE_ConnectionID</relatedStateVariable>\n            </argument>\n            <argument>\n               <name>RcsID</name>\n               <direction>out</direction>\n               <relatedStateVariable>A_ARG_TYPE_RcsID</relatedStateVariable>\n            </argument>\n            <argument>\n               <name>AVTransportID</name>\n               <direction>out</direction>\n               <relatedStateVariable>A_ARG_TYPE_AVTransportID</relatedStateVariable>\n            </argument>\n            <argument>\n               <name>ProtocolInfo</name>\n               <direction>out</direction>\n               <relatedStateVariable>A_ARG_TYPE_ProtocolInfo</relatedStateVariable>\n            </argument>\n            <argument>\n               <name>PeerConnectionManager</name>\n               <direction>out</direction>\n               <relatedStateVariable>A_ARG_TYPE_ConnectionManager</relatedStateVariable>\n            </argument>\n            <argument>\n               <name>PeerConnectionID</name>\n               <direction>out</direction>\n               <relatedStateVariable>A_ARG_TYPE_ConnectionID</relatedStateVariable>\n            </argument>\n            <argument>\n               <name>Direction</name>\n               <direction>out</direction>\n               <relatedStateVariable>A_ARG_TYPE_Direction</relatedStateVariable>\n            </argument>\n            <argument>\n               <name>Status</name>\n               <direction>out</direction>\n               <relatedStateVariable>A_ARG_TYPE_ConnectionStatus</relatedStateVariable>\n            </argument>\n         </argumentList>\n      </action>\n      <action>\n         <name>GetProtocolInfo</name>\n         <argumentList>\n            <argument>\n               <name>Source</name>\n               <direction>out</direction>\n               <relatedStateVariable>SourceProtocolInfo</relatedStateVariable>\n            </argument>\n            <argument>\n               <name>Sink</name>\n               <direction>out</direction>\n               <relatedStateVariable>SinkProtocolInfo</relatedStateVariable>\n            </argument>\n         </argumentList>\n      </action>\n      <action>\n         <name>GetCurrentConnectionIDs</name>\n         <argumentList>\n            <argument>\n               <name>ConnectionIDs</name>\n               <direction>out</direction>\n               <relatedStateVariable>CurrentConnectionIDs</relatedStateVariable>\n            </argument>\n         </argumentList>\n      </action>\n   </actionList>\n   <serviceStateTable>\n      <stateVariable sendEvents=\"no\">\n         <name>A_ARG_TYPE_ProtocolInfo</name>\n         <dataType>string</dataType>\n      </stateVariable>\n      <stateVariable sendEvents=\"no\">\n         <name>A_ARG_TYPE_ConnectionStatus</name>\n         <dataType>string</dataType>\n         <allowedValueList>\n            <allowedValue>OK</allowedValue>\n            <allowedValue>ContentFormatMismatch</allowedValue>\n            <allowedValue>InsufficientBandwidth</allowedValue>\n            <allowedValue>UnreliableChannel</allowedValue>\n            <allowedValue>Unknown</allowedValue>\n         </allowedValueList>\n      </stateVariable>\n      <stateVariable sendEvents=\"no\">\n         <name>A_ARG_TYPE_AVTransportID</name>\n         <dataType>i4</dataType>\n      </stateVariable>\n      <stateVariable sendEvents=\"no\">\n         <name>A_ARG_TYPE_RcsID</name>\n         <dataType>i4</dataType>\n      </stateVariable>\n      <stateVariable sendEvents=\"no\">\n         <name>A_ARG_TYPE_ConnectionID</name>\n         <dataType>i4</dataType>\n      </stateVariable>\n      <stateVariable sendEvents=\"no\">\n         <name>A_ARG_TYPE_ConnectionManager</name>\n         <dataType>string</dataType>\n      </stateVariable>\n      <stateVariable sendEvents=\"yes\">\n         <name>SourceProtocolInfo</name>\n         <dataType>string</dataType>\n      </stateVariable>\n      <stateVariable sendEvents=\"yes\">\n         <name>SinkProtocolInfo</name>\n         <dataType>string</dataType>\n      </stateVariable>\n      <stateVariable sendEvents=\"no\">\n         <name>A_ARG_TYPE_Direction</name>\n         <dataType>string</dataType>\n         <allowedValueList>\n            <allowedValue>Input</allowedValue>\n            <allowedValue>Output</allowedValue>\n         </allowedValueList>\n      </stateVariable>\n      <stateVariable sendEvents=\"yes\">\n         <name>CurrentConnectionIDs</name>\n         <dataType>string</dataType>\n      </stateVariable>\n   </serviceStateTable>\n</scpd>";
    public static final String SERVICE_TYPE = "urn:schemas-upnp-org:service:ConnectionManager:1";
    public static final String SINK = "Sink";
    public static final String SINKPROTOCOLINFO = "SinkProtocolInfo";
    public static final String SOURCE = "Source";
    public static final String SOURCEPROTOCOLINFO = "SourceProtocolInfo";
    public static final String STATUS = "Status";
    public static final String UNKNOWN = "Unknown";
    public static final String UNRELIABLECHANNEL = "UnreliableChannel";
    private int maxConnectionID;
    private MediaServer mediaServer;
    private Mutex mutex = new Mutex();
    private ConnectionInfoList conInfoList = new ConnectionInfoList();

    public ConnectionManager(MediaServer mediaServer) {
        setMediaServer(mediaServer);
        this.maxConnectionID = 0;
    }

    private boolean getCurrentConnectionIDs(Action action) {
        lock();
        int size = this.conInfoList.size();
        String str = "";
        for (int i = 0; i < size; i++) {
            ConnectionInfo connectionInfo = this.conInfoList.getConnectionInfo(i);
            if (i > 0) {
                str = str + ",";
            }
            str = str + Integer.toString(connectionInfo.getID());
        }
        action.getArgument("ConnectionIDs").setValue(str);
        unlock();
        return true;
    }

    private boolean getCurrentConnectionInfo(Action action) {
        int integerValue = action.getArgument("RcsID").getIntegerValue();
        lock();
        ConnectionInfo connectionInfo = getConnectionInfo(integerValue);
        if (connectionInfo != null) {
            action.getArgument("RcsID").setValue(connectionInfo.getRcsID());
            action.getArgument("AVTransportID").setValue(connectionInfo.getAVTransportID());
            action.getArgument("PeerConnectionManager").setValue(connectionInfo.getPeerConnectionManager());
            action.getArgument("PeerConnectionID").setValue(connectionInfo.getPeerConnectionID());
            action.getArgument("Direction").setValue(connectionInfo.getDirection());
            action.getArgument("Status").setValue(connectionInfo.getStatus());
        } else {
            action.getArgument("RcsID").setValue(-1);
            action.getArgument("AVTransportID").setValue(-1);
            action.getArgument("PeerConnectionManager").setValue("");
            action.getArgument("PeerConnectionID").setValue(-1);
            action.getArgument("Direction").setValue("Output");
            action.getArgument("Status").setValue("Unknown");
        }
        unlock();
        return true;
    }

    private void setMediaServer(MediaServer mediaServer) {
        this.mediaServer = mediaServer;
    }

    @Override // org.cybergarage.upnp.control.ActionListener
    public boolean actionControlReceived(Action action) {
        String name = action.getName();
        if (!name.equals("GetProtocolInfo")) {
            if (name.equals("PrepareForConnection")) {
                action.getArgument("ConnectionID").setValue(-1);
                action.getArgument("AVTransportID").setValue(-1);
                action.getArgument("RcsID").setValue(-1);
                return true;
            }
            if (name.equals("ConnectionComplete")) {
                return true;
            }
            if (name.equals("GetCurrentConnectionInfo")) {
                return getCurrentConnectionInfo(action);
            }
            if (name.equals("GetCurrentConnectionIDs")) {
                return getCurrentConnectionIDs(action);
            }
            return false;
        }
        int nFormats = getContentDirectory().getNFormats();
        String str = "";
        for (int i = 0; i < nFormats; i++) {
            if (i > 0) {
                str = str + ",";
            }
            str = str + "http-get:*:" + getContentDirectory().getFormat(i).getMimeType() + ":*";
        }
        action.getArgument("Source").setValue(str);
        action.getArgument("Sink").setValue("");
        return true;
    }

    public void addConnectionInfo(ConnectionInfo connectionInfo) {
        lock();
        this.conInfoList.add(connectionInfo);
        unlock();
    }

    public ConnectionInfo getConnectionInfo(int i) {
        int size = this.conInfoList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ConnectionInfo connectionInfo = this.conInfoList.getConnectionInfo(i2);
            if (connectionInfo.getID() == i) {
                return connectionInfo;
            }
        }
        return null;
    }

    public ConnectionInfoList getConnectionInfoList() {
        return this.conInfoList;
    }

    public ContentDirectory getContentDirectory() {
        return getMediaServer().getContentDirectory();
    }

    public MediaServer getMediaServer() {
        return this.mediaServer;
    }

    public int getNextConnectionID() {
        lock();
        this.maxConnectionID++;
        unlock();
        return this.maxConnectionID;
    }

    public void lock() {
        this.mutex.lock();
    }

    @Override // org.cybergarage.upnp.control.QueryListener
    public boolean queryControlReceived(StateVariable stateVariable) {
        return false;
    }

    public void removeConnectionInfo(int i) {
        lock();
        int size = this.conInfoList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ConnectionInfo connectionInfo = this.conInfoList.getConnectionInfo(i2);
            if (connectionInfo.getID() == i) {
                this.conInfoList.remove(connectionInfo);
                break;
            }
        }
        unlock();
    }

    public void unlock() {
        this.mutex.unlock();
    }

    public void removeConnectionInfo(ConnectionInfo connectionInfo) {
        lock();
        this.conInfoList.remove(connectionInfo);
        unlock();
    }
}
