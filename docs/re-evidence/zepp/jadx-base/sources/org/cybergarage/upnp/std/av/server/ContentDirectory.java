package org.cybergarage.upnp.std.av.server;

import java.io.File;
import java.io.InputStream;
import java.util.StringTokenizer;
import org.cybergarage.http.HTTPRequest;
import org.cybergarage.http.HTTPResponse;
import org.cybergarage.http.Parameter;
import org.cybergarage.http.ParameterList;
import org.cybergarage.upnp.Action;
import org.cybergarage.upnp.StateVariable;
import org.cybergarage.upnp.control.ActionListener;
import org.cybergarage.upnp.control.QueryListener;
import org.cybergarage.upnp.std.av.server.action.BrowseAction;
import org.cybergarage.upnp.std.av.server.action.SearchAction;
import org.cybergarage.upnp.std.av.server.object.ContentNode;
import org.cybergarage.upnp.std.av.server.object.ContentNodeList;
import org.cybergarage.upnp.std.av.server.object.DIDLLite;
import org.cybergarage.upnp.std.av.server.object.Format;
import org.cybergarage.upnp.std.av.server.object.FormatList;
import org.cybergarage.upnp.std.av.server.object.SearchCap;
import org.cybergarage.upnp.std.av.server.object.SearchCapList;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;
import org.cybergarage.upnp.std.av.server.object.SearchCriteriaList;
import org.cybergarage.upnp.std.av.server.object.SortCap;
import org.cybergarage.upnp.std.av.server.object.SortCapList;
import org.cybergarage.upnp.std.av.server.object.SortCriterionList;
import org.cybergarage.upnp.std.av.server.object.container.ContainerNode;
import org.cybergarage.upnp.std.av.server.object.container.RootNode;
import org.cybergarage.upnp.std.av.server.object.item.ItemNode;
import org.cybergarage.upnp.std.av.server.object.search.IdSearchCap;
import org.cybergarage.upnp.std.av.server.object.search.TitleSearchCap;
import org.cybergarage.upnp.std.av.server.object.sort.DCDateSortCap;
import org.cybergarage.upnp.std.av.server.object.sort.DCTitleSortCap;
import org.cybergarage.upnp.std.av.server.object.sort.UPnPClassSortCap;
import org.cybergarage.util.Debug;
import org.cybergarage.util.Mutex;
import org.cybergarage.util.StringUtil;
import org.cybergarage.util.ThreadCore;

/* JADX INFO: loaded from: classes23.dex */
public class ContentDirectory extends ThreadCore implements ActionListener, QueryListener {
    public static final String BROWSE = "Browse";
    public static final String BROWSEDIRECTCHILDREN = "BrowseDirectChildren";
    public static final String BROWSEFLAG = "BrowseFlag";
    public static final String BROWSEMETADATA = "BrowseMetadata";
    public static final String COMPLETED = "COMPLETED";
    public static final String CONTAINERID = "ContainerID";
    public static final String CONTAINERUPDATEIDS = "ContainerUpdateIDs";
    public static final String CONTENT_EXPORT_URI = "/ExportContent";
    public static final String CONTENT_ID = "id";
    public static final String CONTENT_IMPORT_URI = "/ImportContent";
    public static final String CREATEOBJECT = "CreateObject";
    public static final String CREATEREFERENCE = "CreateReference";
    public static final String CURRENTTAGVALUE = "CurrentTagValue";
    private static final int DEFAULT_CONTENTUPDATE_INTERVAL = 60000;
    private static final int DEFAULT_SYSTEMUPDATEID_INTERVAL = 2000;
    public static final String DELETERESOURCE = "DeleteResource";
    public static final String DESTINATIONURI = "DestinationURI";
    public static final String DESTROYOBJECT = "DestroyObject";
    public static final String ELEMENTS = "Elements";
    public static final String ERROR = "ERROR";
    public static final String EXPORTRESOURCE = "ExportResource";
    public static final String FILTER = "Filter";
    public static final String GETSEARCHCAPABILITIES = "GetSearchCapabilities";
    public static final String GETSORTCAPABILITIES = "GetSortCapabilities";
    public static final String GETSYSTEMUPDATEID = "GetSystemUpdateID";
    public static final String GETTRANSFERPROGRESS = "GetTransferProgress";
    public static final String ID = "Id";
    public static final String IMPORTRESOURCE = "ImportResource";
    public static final String IN_PROGRESS = "IN_PROGRESS";
    public static final String NEWID = "NewID";
    public static final String NEWTAGVALUE = "NewTagValue";
    public static final String NUMBERRETURNED = "NumberReturned";
    public static final String OBJECTID = "ObjectID";
    public static final String REQUESTEDCOUNT = "RequestedCount";
    public static final String RESOURCEURI = "ResourceURI";
    public static final String RESULT = "Result";
    public static final String SCPD = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n<scpd xmlns=\"urn:schemas-upnp-org:service-1-0\">\n   <specVersion>\n      <major>1</major>\n      <minor>0</minor>\n   </specVersion>\n   <actionList>\n      <action>\n         <name>ExportResource</name>\n         <argumentList>\n            <argument>\n               <name>SourceURI</name>\n               <direction>in</direction>\n               <relatedStateVariable>A_ARG_TYPE_URI</relatedStateVariable>\n            </argument>\n            <argument>\n               <name>DestinationURI</name>\n               <direction>in</direction>\n               <relatedStateVariable>A_ARG_TYPE_URI</relatedStateVariable>\n            </argument>\n            <argument>\n               <name>TransferID</name>\n               <direction>out</direction>\n               <relatedStateVariable>A_ARG_TYPE_TransferID</relatedStateVariable>\n            </argument>\n         </argumentList>\n      </action>\n      <action>\n         <name>StopTransferResource</name>\n         <argumentList>\n            <argument>\n               <name>TransferID</name>\n               <direction>in</direction>\n               <relatedStateVariable>A_ARG_TYPE_TransferID</relatedStateVariable>\n            </argument>\n         </argumentList>\n      </action>\n      <action>\n         <name>DestroyObject</name>\n         <argumentList>\n            <argument>\n               <name>ObjectID</name>\n               <direction>in</direction>\n               <relatedStateVariable>A_ARG_TYPE_ObjectID</relatedStateVariable>\n            </argument>\n         </argumentList>\n      </action>\n      <action>\n         <name>DeleteResource</name>\n         <argumentList>\n            <argument>\n               <name>ResourceURI</name>\n               <direction>in</direction>\n               <relatedStateVariable>A_ARG_TYPE_URI</relatedStateVariable>\n            </argument>\n         </argumentList>\n      </action>\n      <action>\n         <name>UpdateObject</name>\n         <argumentList>\n            <argument>\n               <name>ObjectID</name>\n               <direction>in</direction>\n               <relatedStateVariable>A_ARG_TYPE_ObjectID</relatedStateVariable>\n            </argument>\n            <argument>\n               <name>CurrentTagValue</name>\n               <direction>in</direction>\n               <relatedStateVariable>A_ARG_TYPE_TagValueList</relatedStateVariable>\n            </argument>\n            <argument>\n               <name>NewTagValue</name>\n               <direction>in</direction>\n               <relatedStateVariable>A_ARG_TYPE_TagValueList</relatedStateVariable>\n            </argument>\n         </argumentList>\n      </action>\n      <action>\n         <name>Browse</name>\n         <argumentList>\n            <argument>\n               <name>ObjectID</name>\n               <direction>in</direction>\n               <relatedStateVariable>A_ARG_TYPE_ObjectID</relatedStateVariable>\n            </argument>\n            <argument>\n               <name>BrowseFlag</name>\n               <direction>in</direction>\n               <relatedStateVariable>A_ARG_TYPE_BrowseFlag</relatedStateVariable>\n            </argument>\n            <argument>\n               <name>Filter</name>\n               <direction>in</direction>\n               <relatedStateVariable>A_ARG_TYPE_Filter</relatedStateVariable>\n            </argument>\n            <argument>\n               <name>StartingIndex</name>\n               <direction>in</direction>\n               <relatedStateVariable>A_ARG_TYPE_Index</relatedStateVariable>\n            </argument>\n            <argument>\n               <name>RequestedCount</name>\n               <direction>in</direction>\n               <relatedStateVariable>A_ARG_TYPE_Count</relatedStateVariable>\n            </argument>\n            <argument>\n               <name>SortCriteria</name>\n               <direction>in</direction>\n               <relatedStateVariable>A_ARG_TYPE_SortCriteria</relatedStateVariable>\n            </argument>\n            <argument>\n               <name>Result</name>\n               <direction>out</direction>\n               <relatedStateVariable>A_ARG_TYPE_Result</relatedStateVariable>\n            </argument>\n            <argument>\n               <name>NumberReturned</name>\n               <direction>out</direction>\n               <relatedStateVariable>A_ARG_TYPE_Count</relatedStateVariable>\n            </argument>\n            <argument>\n               <name>TotalMatches</name>\n               <direction>out</direction>\n               <relatedStateVariable>A_ARG_TYPE_Count</relatedStateVariable>\n            </argument>\n            <argument>\n               <name>UpdateID</name>\n               <direction>out</direction>\n               <relatedStateVariable>A_ARG_TYPE_UpdateID</relatedStateVariable>\n            </argument>\n         </argumentList>\n      </action>\n      <action>\n         <name>GetTransferProgress</name>\n         <argumentList>\n            <argument>\n               <name>TransferID</name>\n               <direction>in</direction>\n               <relatedStateVariable>A_ARG_TYPE_TransferID</relatedStateVariable>\n            </argument>\n            <argument>\n               <name>TransferStatus</name>\n               <direction>out</direction>\n               <relatedStateVariable>A_ARG_TYPE_TransferStatus</relatedStateVariable>\n            </argument>\n            <argument>\n               <name>TransferLength</name>\n               <direction>out</direction>\n               <relatedStateVariable>A_ARG_TYPE_TransferLength</relatedStateVariable>\n            </argument>\n            <argument>\n               <name>TransferTotal</name>\n               <direction>out</direction>\n               <relatedStateVariable>A_ARG_TYPE_TransferTotal</relatedStateVariable>\n            </argument>\n         </argumentList>\n      </action>\n      <action>\n         <name>GetSearchCapabilities</name>\n         <argumentList>\n            <argument>\n               <name>SearchCaps</name>\n               <direction>out</direction>\n               <relatedStateVariable>SearchCapabilities</relatedStateVariable>\n            </argument>\n         </argumentList>\n      </action>\n      <action>\n         <name>CreateObject</name>\n         <argumentList>\n            <argument>\n               <name>ContainerID</name>\n               <direction>in</direction>\n               <relatedStateVariable>A_ARG_TYPE_ObjectID</relatedStateVariable>\n            </argument>\n            <argument>\n               <name>Elements</name>\n               <direction>in</direction>\n               <relatedStateVariable>A_ARG_TYPE_Result</relatedStateVariable>\n            </argument>\n            <argument>\n               <name>ObjectID</name>\n               <direction>out</direction>\n               <relatedStateVariable>A_ARG_TYPE_ObjectID</relatedStateVariable>\n            </argument>\n            <argument>\n               <name>Result</name>\n               <direction>out</direction>\n               <relatedStateVariable>A_ARG_TYPE_Result</relatedStateVariable>\n            </argument>\n         </argumentList>\n      </action>\n      <action>\n         <name>Search</name>\n         <argumentList>\n            <argument>\n               <name>ContainerID</name>\n               <direction>in</direction>\n               <relatedStateVariable>A_ARG_TYPE_ObjectID</relatedStateVariable>\n            </argument>\n            <argument>\n               <name>SearchCriteria</name>\n               <direction>in</direction>\n               <relatedStateVariable>A_ARG_TYPE_SearchCriteria</relatedStateVariable>\n            </argument>\n            <argument>\n               <name>Filter</name>\n               <direction>in</direction>\n               <relatedStateVariable>A_ARG_TYPE_Filter</relatedStateVariable>\n            </argument>\n            <argument>\n               <name>StartingIndex</name>\n               <direction>in</direction>\n               <relatedStateVariable>A_ARG_TYPE_Index</relatedStateVariable>\n            </argument>\n            <argument>\n               <name>RequestedCount</name>\n               <direction>in</direction>\n               <relatedStateVariable>A_ARG_TYPE_Count</relatedStateVariable>\n            </argument>\n            <argument>\n               <name>SortCriteria</name>\n               <direction>in</direction>\n               <relatedStateVariable>A_ARG_TYPE_SortCriteria</relatedStateVariable>\n            </argument>\n            <argument>\n               <name>Result</name>\n               <direction>out</direction>\n               <relatedStateVariable>A_ARG_TYPE_Result</relatedStateVariable>\n            </argument>\n            <argument>\n               <name>NumberReturned</name>\n               <direction>out</direction>\n               <relatedStateVariable>A_ARG_TYPE_Count</relatedStateVariable>\n            </argument>\n            <argument>\n               <name>TotalMatches</name>\n               <direction>out</direction>\n               <relatedStateVariable>A_ARG_TYPE_Count</relatedStateVariable>\n            </argument>\n            <argument>\n               <name>UpdateID</name>\n               <direction>out</direction>\n               <relatedStateVariable>A_ARG_TYPE_UpdateID</relatedStateVariable>\n            </argument>\n         </argumentList>\n      </action>\n      <action>\n         <name>GetSortCapabilities</name>\n         <argumentList>\n            <argument>\n               <name>SortCaps</name>\n               <direction>out</direction>\n               <relatedStateVariable>SortCapabilities</relatedStateVariable>\n            </argument>\n         </argumentList>\n      </action>\n      <action>\n         <name>ImportResource</name>\n         <argumentList>\n            <argument>\n               <name>SourceURI</name>\n               <direction>in</direction>\n               <relatedStateVariable>A_ARG_TYPE_URI</relatedStateVariable>\n            </argument>\n            <argument>\n               <name>DestinationURI</name>\n               <direction>in</direction>\n               <relatedStateVariable>A_ARG_TYPE_URI</relatedStateVariable>\n            </argument>\n            <argument>\n               <name>TransferID</name>\n               <direction>out</direction>\n               <relatedStateVariable>A_ARG_TYPE_TransferID</relatedStateVariable>\n            </argument>\n         </argumentList>\n      </action>\n      <action>\n         <name>CreateReference</name>\n         <argumentList>\n            <argument>\n               <name>ContainerID</name>\n               <direction>in</direction>\n               <relatedStateVariable>A_ARG_TYPE_ObjectID</relatedStateVariable>\n            </argument>\n            <argument>\n               <name>ObjectID</name>\n               <direction>in</direction>\n               <relatedStateVariable>A_ARG_TYPE_ObjectID</relatedStateVariable>\n            </argument>\n            <argument>\n               <name>NewID</name>\n               <direction>out</direction>\n               <relatedStateVariable>A_ARG_TYPE_ObjectID</relatedStateVariable>\n            </argument>\n         </argumentList>\n      </action>\n      <action>\n         <name>GetSystemUpdateID</name>\n         <argumentList>\n            <argument>\n              <name>Id</name>\n               <direction>out</direction>\n               <relatedStateVariable>SystemUpdateID</relatedStateVariable>\n            </argument>\n         </argumentList>\n      </action>\n   </actionList>\n   <serviceStateTable>\n      <stateVariable sendEvents=\"no\">\n         <name>A_ARG_TYPE_SortCriteria</name>\n         <dataType>string</dataType>\n      </stateVariable>\n      <stateVariable sendEvents=\"no\">\n         <name>A_ARG_TYPE_TransferLength</name>\n         <dataType>string</dataType>\n      </stateVariable>\n      <stateVariable sendEvents=\"yes\">\n         <name>TransferIDs</name>\n         <dataType>string</dataType>\n      </stateVariable>\n      <stateVariable sendEvents=\"no\">\n         <name>A_ARG_TYPE_UpdateID</name>\n         <dataType>ui4</dataType>\n      </stateVariable>\n      <stateVariable sendEvents=\"no\">\n         <name>A_ARG_TYPE_SearchCriteria</name>\n         <dataType>string</dataType>\n      </stateVariable>\n      <stateVariable sendEvents=\"no\">\n         <name>A_ARG_TYPE_Filter</name>\n         <dataType>string</dataType>\n      </stateVariable>\n      <stateVariable sendEvents=\"yes\">\n         <name>ContainerUpdateIDs</name>\n         <dataType>string</dataType>\n      </stateVariable>\n      <stateVariable sendEvents=\"no\">\n         <name>A_ARG_TYPE_Result</name>\n         <dataType>string</dataType>\n      </stateVariable>\n      <stateVariable sendEvents=\"no\">\n         <name>A_ARG_TYPE_Index</name>\n         <dataType>ui4</dataType>\n      </stateVariable>\n      <stateVariable sendEvents=\"no\">\n         <name>A_ARG_TYPE_TransferID</name>\n         <dataType>ui4</dataType>\n      </stateVariable>\n      <stateVariable sendEvents=\"no\">\n         <name>A_ARG_TYPE_TagValueList</name>\n         <dataType>string</dataType>\n      </stateVariable>\n      <stateVariable sendEvents=\"no\">\n         <name>A_ARG_TYPE_URI</name>\n         <dataType>uri</dataType>\n      </stateVariable>\n      <stateVariable sendEvents=\"no\">\n         <name>A_ARG_TYPE_ObjectID</name>\n         <dataType>string</dataType>\n      </stateVariable>\n      <stateVariable sendEvents=\"no\">\n         <name>SortCapabilities</name>\n         <dataType>string</dataType>\n      </stateVariable>\n      <stateVariable sendEvents=\"no\">\n         <name>SearchCapabilities</name>\n         <dataType>string</dataType>\n      </stateVariable>\n      <stateVariable sendEvents=\"no\">\n         <name>A_ARG_TYPE_Count</name>\n         <dataType>ui4</dataType>\n      </stateVariable>\n      <stateVariable sendEvents=\"no\">\n         <name>A_ARG_TYPE_BrowseFlag</name>\n         <dataType>string</dataType>\n         <allowedValueList>\n            <allowedValue>BrowseMetadata</allowedValue>\n            <allowedValue>BrowseDirectChildren</allowedValue>\n         </allowedValueList>\n      </stateVariable>\n      <stateVariable sendEvents=\"yes\">\n         <name>SystemUpdateID</name>\n         <dataType>ui4</dataType>\n      </stateVariable>\n      <stateVariable sendEvents=\"no\">\n         <name>A_ARG_TYPE_TransferStatus</name>\n         <dataType>string</dataType>\n         <allowedValueList>\n            <allowedValue>COMPLETED</allowedValue>\n            <allowedValue>ERROR</allowedValue>\n            <allowedValue>IN_PROGRESS</allowedValue>\n            <allowedValue>STOPPED</allowedValue>\n         </allowedValueList>\n      </stateVariable>\n      <stateVariable sendEvents=\"no\">\n         <name>A_ARG_TYPE_TransferTotal</name>\n         <dataType>string</dataType>\n      </stateVariable>\n   </serviceStateTable>\n</scpd>";
    public static final String SEARCH = "Search";
    public static final String SEARCHCAPABILITIES = "SearchCapabilities";
    public static final String SEARCHCAPS = "SearchCaps";
    public static final String SEARCHCRITERIA = "SearchCriteria";
    public static final String SERVICE_TYPE = "urn:schemas-upnp-org:service:ContentDirectory:1";
    public static final String SORTCAPABILITIES = "SortCapabilities";
    public static final String SORTCAPS = "SortCaps";
    public static final String SORTCRITERIA = "SortCriteria";
    public static final String SOURCEURI = "SourceURI";
    public static final String STARTINGINDEX = "StartingIndex";
    public static final String STOPPED = "STOPPED";
    public static final String STOPTRANSFERRESOURCE = "StopTransferResource";
    public static final String SYSTEMUPDATEID = "SystemUpdateID";
    public static final String TOTALMATCHES = "TotalMatches";
    public static final String TRANSFERID = "TransferID";
    public static final String TRANSFERIDS = "TransferIDs";
    public static final String TRANSFERLENGTH = "TransferLength";
    public static final String TRANSFERSTATUS = "TransferStatus";
    public static final String TRANSFERTOTAL = "TransferTotal";
    public static final String UPDATEID = "UpdateID";
    public static final String UPDATEOBJECT = "UpdateObject";
    private long contentUpdateInterval;
    private int maxContentID;
    private MediaServer mediaServer;
    private RootNode rootNode;
    private int systemUpdateID;
    private long systemUpdateIDInterval;
    private Mutex mutex = new Mutex();
    private FormatList formatList = new FormatList();
    private SortCapList sortCapList = new SortCapList();
    private SearchCapList searchCapList = new SearchCapList();
    private DirectoryList dirList = new DirectoryList();

    public ContentDirectory(MediaServer mediaServer) {
        setMediaServer(mediaServer);
        this.systemUpdateID = 0;
        this.maxContentID = 0;
        setSystemUpdateInterval(2000L);
        setContentUpdateInterval(60000L);
        initRootNode();
        initSortCaps();
        initSearchCaps();
    }

    private boolean browseActionReceived(BrowseAction browseAction) {
        if (browseAction.isMetadata()) {
            return browseMetadataActionReceived(browseAction);
        }
        if (browseAction.isDirectChildren()) {
            return browseDirectChildrenActionReceived(browseAction);
        }
        return false;
    }

    private boolean browseDirectChildrenActionReceived(BrowseAction browseAction) {
        String objectID = browseAction.getObjectID();
        ContentNode contentNodeFindContentNodeByID = findContentNodeByID(objectID);
        int i = 0;
        if (contentNodeFindContentNodeByID == null || !contentNodeFindContentNodeByID.isContainerNode()) {
            return false;
        }
        ContainerNode containerNode = (ContainerNode) contentNodeFindContentNodeByID;
        ContentNodeList contentNodeList = new ContentNodeList();
        int nContentNodes = containerNode.getNContentNodes();
        for (int i2 = 0; i2 < nContentNodes; i2++) {
            contentNodeList.add(containerNode.getContentNode(i2));
        }
        ContentNodeList contentNodeListSortContentNodeList = sortContentNodeList(contentNodeList, browseAction.getSortCriteria());
        int startingIndex = browseAction.getStartingIndex();
        if (startingIndex <= 0) {
            startingIndex = 0;
        }
        int requestedCount = browseAction.getRequestedCount();
        if (requestedCount == 0) {
            requestedCount = nContentNodes;
        }
        DIDLLite dIDLLite = new DIDLLite();
        while (startingIndex < nContentNodes && i < requestedCount) {
            ContentNode contentNode = contentNodeListSortContentNodeList.getContentNode(startingIndex);
            dIDLLite.addContentNode(contentNode);
            contentNode.setParentID(objectID);
            i++;
            startingIndex++;
        }
        browseAction.setResult(dIDLLite.toString());
        browseAction.setNumberReturned(i);
        browseAction.setTotalMaches(nContentNodes);
        browseAction.setUpdateID(getSystemUpdateID());
        return true;
    }

    private boolean browseMetadataActionReceived(BrowseAction browseAction) {
        ContentNode contentNodeFindContentNodeByID = findContentNodeByID(browseAction.getObjectID());
        if (contentNodeFindContentNodeByID == null) {
            return false;
        }
        DIDLLite dIDLLite = new DIDLLite();
        dIDLLite.setContentNode(contentNodeFindContentNodeByID);
        browseAction.setArgumentValue("Result", dIDLLite.toString());
        browseAction.setArgumentValue("NumberReturned", 1);
        browseAction.setArgumentValue("TotalMatches", 1);
        browseAction.setArgumentValue("UpdateID", getSystemUpdateID());
        if (Debug.isOn()) {
            browseAction.print();
        }
        return true;
    }

    private ContainerNode createContainerNode() {
        return new ContainerNode();
    }

    private DirectoryList getDirectoryList() {
        return this.dirList;
    }

    private synchronized int getNextContentID() {
        int i;
        i = this.maxContentID + 1;
        this.maxContentID = i;
        return i;
    }

    private String getSearchCapabilities() {
        int nSearchCaps = getNSearchCaps();
        String str = "";
        for (int i = 0; i < nSearchCaps; i++) {
            String propertyName = getSearchCap(i).getPropertyName();
            if (i > 0) {
                str = str + ",";
            }
            str = str + propertyName;
        }
        return str;
    }

    private int getSearchContentList(ContainerNode containerNode, SearchCriteriaList searchCriteriaList, SearchCapList searchCapList, ContentNodeList contentNodeList) {
        if (searchCriteriaList.compare(containerNode, searchCapList)) {
            contentNodeList.add(containerNode);
        }
        int nContentNodes = containerNode.getNContentNodes();
        for (int i = 0; i < nContentNodes; i++) {
            ContentNode contentNode = containerNode.getContentNode(i);
            if (contentNode.isContainerNode()) {
                getSearchContentList((ContainerNode) contentNode, searchCriteriaList, searchCapList, contentNodeList);
            }
        }
        return contentNodeList.size();
    }

    private SearchCriteriaList getSearchCriteriaList(String str) {
        SearchCriteriaList searchCriteriaList = new SearchCriteriaList();
        if (str == null || str.compareTo("*") == 0) {
            return searchCriteriaList;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, SearchCriteria.WCHARS);
        while (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            if (!stringTokenizer.hasMoreTokens()) {
                break;
            }
            String strNextToken2 = stringTokenizer.nextToken();
            if (!stringTokenizer.hasMoreTokens()) {
                break;
            }
            String strTrim = StringUtil.trim(stringTokenizer.nextToken(), "\"");
            String strNextToken3 = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : "";
            SearchCriteria searchCriteria = new SearchCriteria();
            searchCriteria.setProperty(strNextToken);
            searchCriteria.setOperation(strNextToken2);
            searchCriteria.setValue(strTrim);
            searchCriteria.setLogic(strNextToken3);
            searchCriteriaList.add(searchCriteria);
        }
        return searchCriteriaList;
    }

    private String getSortCapabilities() {
        int nSortCaps = getNSortCaps();
        String str = "";
        for (int i = 0; i < nSortCaps; i++) {
            String type = getSortCap(i).getType();
            if (i > 0) {
                str = str + ",";
            }
            str = str + type;
        }
        return str;
    }

    private SortCriterionList getSortCriteriaArray(String str) {
        SortCriterionList sortCriterionList = new SortCriterionList();
        StringTokenizer stringTokenizer = new StringTokenizer(str, ", ");
        while (stringTokenizer.hasMoreTokens()) {
            sortCriterionList.add(stringTokenizer.nextToken());
        }
        return sortCriterionList;
    }

    private void initRootNode() {
        RootNode rootNode = new RootNode();
        this.rootNode = rootNode;
        rootNode.setContentDirectory(this);
    }

    private void initSearchCaps() {
        addSearchCap(new IdSearchCap());
        addSearchCap(new TitleSearchCap());
    }

    private void initSortCaps() {
        addSortCap(new UPnPClassSortCap());
        addSortCap(new DCTitleSortCap());
        addSortCap(new DCDateSortCap());
    }

    private boolean searchActionReceived(SearchAction searchAction) {
        ContentNode contentNodeFindContentNodeByID = findContentNodeByID(searchAction.getContainerID());
        int i = 0;
        if (contentNodeFindContentNodeByID == null || !contentNodeFindContentNodeByID.isContainerNode()) {
            return false;
        }
        ContainerNode containerNode = (ContainerNode) contentNodeFindContentNodeByID;
        SearchCriteriaList searchCriteriaList = getSearchCriteriaList(searchAction.getSearchCriteria());
        SearchCapList searchCapList = getSearchCapList();
        ContentNodeList contentNodeList = new ContentNodeList();
        int nContentNodes = containerNode.getNContentNodes();
        for (int i2 = 0; i2 < nContentNodes; i2++) {
            ContentNode contentNode = containerNode.getContentNode(i2);
            if (contentNode.isContainerNode()) {
                getSearchContentList((ContainerNode) contentNode, searchCriteriaList, searchCapList, contentNodeList);
            }
        }
        int size = contentNodeList.size();
        ContentNodeList contentNodeListSortContentNodeList = sortContentNodeList(contentNodeList, searchAction.getSortCriteria());
        int startingIndex = searchAction.getStartingIndex();
        if (startingIndex <= 0) {
            startingIndex = 0;
        }
        int requestedCount = searchAction.getRequestedCount();
        if (requestedCount == 0) {
            requestedCount = size;
        }
        DIDLLite dIDLLite = new DIDLLite();
        while (startingIndex < size && i < requestedCount) {
            dIDLLite.addContentNode(contentNodeListSortContentNodeList.getContentNode(startingIndex));
            i++;
            startingIndex++;
        }
        searchAction.setResult(dIDLLite.toString());
        searchAction.setNumberReturned(i);
        searchAction.setTotalMaches(size);
        searchAction.setUpdateID(getSystemUpdateID());
        return true;
    }

    private void setMediaServer(MediaServer mediaServer) {
        this.mediaServer = mediaServer;
    }

    private void sortContentNodeList(ContentNode[] contentNodeArr, SortCap sortCap, boolean z) {
        int length = contentNodeArr.length;
        int i = 0;
        while (i < length - 1) {
            int i2 = i + 1;
            int i3 = i;
            for (int i4 = i2; i4 < length; i4++) {
                int iCompare = sortCap.compare(contentNodeArr[i3], contentNodeArr[i4]);
                if (z && iCompare < 0) {
                    i3 = i4;
                }
                if (!z && iCompare > 0) {
                    i3 = i4;
                }
            }
            ContentNode contentNode = contentNodeArr[i];
            contentNodeArr[i] = contentNodeArr[i3];
            contentNodeArr[i3] = contentNode;
            i = i2;
        }
    }

    @Override // org.cybergarage.upnp.control.ActionListener
    public boolean actionControlReceived(Action action) {
        String name = action.getName();
        if (name.equals(BROWSE)) {
            return browseActionReceived(new BrowseAction(action));
        }
        if (name.equals(SEARCH)) {
            return searchActionReceived(new SearchAction(action));
        }
        if (name.equals(GETSEARCHCAPABILITIES)) {
            action.getArgument(SEARCHCAPS).setValue(getSearchCapabilities());
            return true;
        }
        if (name.equals(GETSORTCAPABILITIES)) {
            action.getArgument(SORTCAPS).setValue(getSortCapabilities());
            return true;
        }
        if (!name.equals(GETSYSTEMUPDATEID)) {
            return false;
        }
        action.getArgument("Id").setValue(getSystemUpdateID());
        return true;
    }

    public boolean addDirectory(Directory directory) {
        directory.setContentDirectory(this);
        directory.setID(getNextContainerID());
        directory.updateContentList();
        this.dirList.add(directory);
        this.rootNode.addContentNode(directory);
        updateSystemUpdateID();
        return true;
    }

    public boolean addPlugIn(Format format) {
        this.formatList.add(format);
        return true;
    }

    public boolean addSearchCap(SearchCap searchCap) {
        this.searchCapList.add(searchCap);
        return true;
    }

    public boolean addSortCap(SortCap sortCap) {
        this.sortCapList.add(sortCap);
        return true;
    }

    public void contentExportRequestRecieved(HTTPRequest hTTPRequest) {
        if (!hTTPRequest.getURI().startsWith(CONTENT_EXPORT_URI)) {
            hTTPRequest.returnBadRequest();
            return;
        }
        ParameterList parameterList = hTTPRequest.getParameterList();
        for (int i = 0; i < parameterList.size(); i++) {
            Parameter parameter = parameterList.getParameter(i);
            Debug.message("[" + parameter.getName() + "] = " + parameter.getValue());
        }
        ContentNode contentNodeFindContentNodeByID = findContentNodeByID(parameterList.getValue("id"));
        if (contentNodeFindContentNodeByID == null) {
            hTTPRequest.returnBadRequest();
            return;
        }
        if (!(contentNodeFindContentNodeByID instanceof ItemNode)) {
            hTTPRequest.returnBadRequest();
            return;
        }
        ItemNode itemNode = (ItemNode) contentNodeFindContentNodeByID;
        long contentLength = itemNode.getContentLength();
        String mimeType = itemNode.getMimeType();
        InputStream contentInputStream = itemNode.getContentInputStream();
        if (contentLength <= 0 || mimeType.length() <= 0 || contentInputStream == null) {
            hTTPRequest.returnBadRequest();
            return;
        }
        ConnectionManager connectionManager = getMediaServer().getConnectionManager();
        int nextConnectionID = connectionManager.getNextConnectionID();
        ConnectionInfo connectionInfo = new ConnectionInfo(nextConnectionID);
        connectionInfo.setProtocolInfo(mimeType);
        connectionInfo.setDirection("Output");
        connectionInfo.setStatus("OK");
        connectionManager.addConnectionInfo(connectionInfo);
        HTTPResponse hTTPResponse = new HTTPResponse();
        hTTPResponse.setContentType(mimeType);
        hTTPResponse.setStatusCode(200);
        hTTPResponse.setContentLength(contentLength);
        hTTPResponse.setContentInputStream(contentInputStream);
        hTTPRequest.post(hTTPResponse);
        try {
            contentInputStream.close();
        } catch (Exception unused) {
        }
        connectionManager.removeConnectionInfo(nextConnectionID);
    }

    public ContentNode findContentNodeByID(String str) {
        return getRootNode().findContentNodeByID(str);
    }

    public String getContentExportURL(String str) {
        return "http://" + getInterfaceAddress() + ":" + getHTTPPort() + CONTENT_EXPORT_URI + "?id" + SearchCriteria.EQ + str;
    }

    public String getContentImportURL(String str) {
        return "http://" + getInterfaceAddress() + ":" + getHTTPPort() + CONTENT_IMPORT_URI + "?id" + SearchCriteria.EQ + str;
    }

    public long getContentUpdateInterval() {
        return this.contentUpdateInterval;
    }

    public Directory getDirectory(int i) {
        return this.dirList.getDirectory(i);
    }

    public Format getFormat(File file) {
        return this.formatList.getFormat(file);
    }

    public int getHTTPPort() {
        return getMediaServer().getHTTPPort();
    }

    public String getInterfaceAddress() {
        return getMediaServer().getInterfaceAddress();
    }

    public MediaServer getMediaServer() {
        return this.mediaServer;
    }

    public int getNDirectories() {
        return this.dirList.size();
    }

    public int getNFormats() {
        return this.formatList.size();
    }

    public int getNSearchCaps() {
        return this.searchCapList.size();
    }

    public int getNSortCaps() {
        return this.sortCapList.size();
    }

    public int getNextContainerID() {
        return getNextContentID();
    }

    public int getNextItemID() {
        return getNextContentID();
    }

    public RootNode getRootNode() {
        return this.rootNode;
    }

    public SearchCap getSearchCap(int i) {
        return this.searchCapList.getSearchCap(i);
    }

    public SearchCapList getSearchCapList() {
        return this.searchCapList;
    }

    public SortCap getSortCap(int i) {
        return this.sortCapList.getSortCap(i);
    }

    public synchronized int getSystemUpdateID() {
        return this.systemUpdateID;
    }

    public long getSystemUpdateIDInterval() {
        return this.systemUpdateIDInterval;
    }

    public void lock() {
        this.mutex.lock();
    }

    @Override // org.cybergarage.upnp.control.QueryListener
    public boolean queryControlReceived(StateVariable stateVariable) {
        return false;
    }

    public boolean removeAllDirectories() {
        this.dirList.removeAllElements();
        return true;
    }

    public boolean removeDirectory(String str) {
        Directory directory = this.dirList.getDirectory(str);
        if (directory == null) {
            return false;
        }
        this.dirList.remove(directory);
        this.rootNode.removeNode(directory);
        updateSystemUpdateID();
        return true;
    }

    @Override // org.cybergarage.util.ThreadCore, java.lang.Runnable
    public void run() {
        StateVariable stateVariable = getMediaServer().getStateVariable(SYSTEMUPDATEID);
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i = 0;
        while (isRunnable()) {
            try {
                Thread.sleep(getSystemUpdateIDInterval());
            } catch (InterruptedException unused) {
            }
            int systemUpdateID = getSystemUpdateID();
            if (i != systemUpdateID) {
                stateVariable.setValue(systemUpdateID);
                i = systemUpdateID;
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            if (getContentUpdateInterval() < jCurrentTimeMillis2 - jCurrentTimeMillis) {
                getDirectoryList().update();
                jCurrentTimeMillis = jCurrentTimeMillis2;
            }
        }
    }

    public void setContentUpdateInterval(long j) {
        this.contentUpdateInterval = j;
    }

    public void setSystemUpdateInterval(long j) {
        this.systemUpdateIDInterval = j;
    }

    public void unlock() {
        this.mutex.unlock();
    }

    public synchronized void updateSystemUpdateID() {
        this.systemUpdateID++;
    }

    public Format getFormat(int i) {
        return this.formatList.getFormat(i);
    }

    public SearchCap getSearchCap(String str) {
        return this.searchCapList.getSearchCap(str);
    }

    public SortCap getSortCap(String str) {
        return this.sortCapList.getSortCap(str);
    }

    private ContentNodeList sortContentNodeList(ContentNodeList contentNodeList, String str) {
        if (str != null && str.length() > 0) {
            int size = contentNodeList.size();
            ContentNode[] contentNodeArr = new ContentNode[size];
            for (int i = 0; i < size; i++) {
                contentNodeArr[i] = contentNodeList.getContentNode(i);
            }
            SortCriterionList sortCriteriaArray = getSortCriteriaArray(str);
            int size2 = sortCriteriaArray.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String sortCriterion = sortCriteriaArray.getSortCriterion(i2);
                Debug.message("[" + i2 + "] = " + sortCriterion);
                char cCharAt = sortCriterion.charAt(0);
                boolean z = cCharAt != '-';
                if (cCharAt == '+' || cCharAt == '-') {
                    sortCriterion = sortCriterion.substring(1);
                }
                SortCap sortCap = getSortCap(sortCriterion);
                if (sortCap != null) {
                    Debug.message("  ascSeq = " + z);
                    Debug.message("  sortCap = " + sortCap.getType());
                    sortContentNodeList(contentNodeArr, sortCap, z);
                }
            }
            contentNodeList = new ContentNodeList();
            for (int i3 = 0; i3 < size; i3++) {
                contentNodeList.add(contentNodeArr[i3]);
            }
        }
        return contentNodeList;
    }
}
